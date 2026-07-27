package com.giderosmobile.android.player;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public class Accelerometer implements SensorEventListener {
    private boolean isEnabled_;
    private Sensor mAccelerometer;
    private int mNativeOrientation;
    private SensorManager mSensorManager;

    private static native void onSensorChanged(float f, float f2, float f3);

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public Accelerometer() {
        char c;
        Activity activity = WeakActivityHolder.get();
        SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
        this.mSensorManager = sensorManager;
        this.mAccelerometer = sensorManager.getDefaultSensor(1);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                c = 'Z';
            } else if (rotation == 2) {
                c = 180;
            } else if (rotation == 3) {
                c = 270;
            }
            int i = activity.getResources().getConfiguration().orientation;
            if (((c != 0 || c == 180) && i == 2) || ((c == 'Z' || c == 270) && i == 1)) {
                this.mNativeOrientation = 2;
            } else {
                this.mNativeOrientation = 1;
            }
            this.isEnabled_ = false;
        }
        c = 0;
        int i2 = activity.getResources().getConfiguration().orientation;
        if (c != 0) {
        }
        this.mNativeOrientation = 2;
        this.isEnabled_ = false;
    }

    boolean isAvailable() {
        return this.mAccelerometer != null;
    }

    public void enable() {
        if (isAvailable() && !this.isEnabled_) {
            this.mSensorManager.registerListener(this, this.mAccelerometer, 1);
            this.isEnabled_ = true;
        }
    }

    public void disable() {
        if (isAvailable() && this.isEnabled_) {
            this.mSensorManager.unregisterListener(this);
            this.isEnabled_ = false;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        float f2;
        float f3;
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        if (this.mNativeOrientation == 1) {
            f = sensorEvent.values[0];
            f2 = sensorEvent.values[1];
            f3 = sensorEvent.values[2];
        } else {
            f = sensorEvent.values[1];
            f2 = -sensorEvent.values[0];
            f3 = sensorEvent.values[2];
        }
        onSensorChanged((-f) / 9.80665f, (-f2) / 9.80665f, (-f3) / 9.80665f);
    }
}
