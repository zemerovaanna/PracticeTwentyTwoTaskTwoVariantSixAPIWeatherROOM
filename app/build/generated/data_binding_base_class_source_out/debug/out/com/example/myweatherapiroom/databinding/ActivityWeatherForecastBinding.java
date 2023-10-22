// Generated by view binder compiler. Do not edit!
package com.example.myweatherapiroom.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myweatherapiroom.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWeatherForecastBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonSave;

  @NonNull
  public final AppCompatButton buttonWeather;

  @NonNull
  public final EditText editTextCity;

  @NonNull
  public final GridLayout gridlayout;

  @NonNull
  public final TextView textViewHumidity;

  @NonNull
  public final TextView textViewNow;

  @NonNull
  public final TextView textViewPressure;

  @NonNull
  public final TextView textViewTemp;

  @NonNull
  public final TextView textViewWindySpeed;

  private ActivityWeatherForecastBinding(@NonNull LinearLayout rootView, @NonNull Button buttonSave,
      @NonNull AppCompatButton buttonWeather, @NonNull EditText editTextCity,
      @NonNull GridLayout gridlayout, @NonNull TextView textViewHumidity,
      @NonNull TextView textViewNow, @NonNull TextView textViewPressure,
      @NonNull TextView textViewTemp, @NonNull TextView textViewWindySpeed) {
    this.rootView = rootView;
    this.buttonSave = buttonSave;
    this.buttonWeather = buttonWeather;
    this.editTextCity = editTextCity;
    this.gridlayout = gridlayout;
    this.textViewHumidity = textViewHumidity;
    this.textViewNow = textViewNow;
    this.textViewPressure = textViewPressure;
    this.textViewTemp = textViewTemp;
    this.textViewWindySpeed = textViewWindySpeed;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWeatherForecastBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWeatherForecastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_weather_forecast, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWeatherForecastBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonSave;
      Button buttonSave = ViewBindings.findChildViewById(rootView, id);
      if (buttonSave == null) {
        break missingId;
      }

      id = R.id.buttonWeather;
      AppCompatButton buttonWeather = ViewBindings.findChildViewById(rootView, id);
      if (buttonWeather == null) {
        break missingId;
      }

      id = R.id.editTextCity;
      EditText editTextCity = ViewBindings.findChildViewById(rootView, id);
      if (editTextCity == null) {
        break missingId;
      }

      id = R.id.gridlayout;
      GridLayout gridlayout = ViewBindings.findChildViewById(rootView, id);
      if (gridlayout == null) {
        break missingId;
      }

      id = R.id.textViewHumidity;
      TextView textViewHumidity = ViewBindings.findChildViewById(rootView, id);
      if (textViewHumidity == null) {
        break missingId;
      }

      id = R.id.textViewNow;
      TextView textViewNow = ViewBindings.findChildViewById(rootView, id);
      if (textViewNow == null) {
        break missingId;
      }

      id = R.id.textViewPressure;
      TextView textViewPressure = ViewBindings.findChildViewById(rootView, id);
      if (textViewPressure == null) {
        break missingId;
      }

      id = R.id.textViewTemp;
      TextView textViewTemp = ViewBindings.findChildViewById(rootView, id);
      if (textViewTemp == null) {
        break missingId;
      }

      id = R.id.textViewWindySpeed;
      TextView textViewWindySpeed = ViewBindings.findChildViewById(rootView, id);
      if (textViewWindySpeed == null) {
        break missingId;
      }

      return new ActivityWeatherForecastBinding((LinearLayout) rootView, buttonSave, buttonWeather,
          editTextCity, gridlayout, textViewHumidity, textViewNow, textViewPressure, textViewTemp,
          textViewWindySpeed);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}