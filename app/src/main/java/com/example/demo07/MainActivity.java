package com.example.demo07;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        random = new Random();
    }


    public void clicked(View view) {
        int number = random.nextInt(3) + 1;
        if (number == 1) {
            imageView.setImageResource(R.drawable.first);
        }
        if (number == 2) {
            imageView.setImageResource(R.drawable.second);
        }
        if (number == 3) {
            imageView.setImageResource(R.drawable.third);





        }
    }
}

