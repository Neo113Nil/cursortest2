package com.giderosmobile.android.player;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public class Gyroscope implements SensorEventListener {
    private boolean isEnabled_;
    private Context mContext;
    private Sensor mGyroscope;
    private SensorManager mSensorManager;

    private static native void onSensorChanged(float f, float f2, float f3);

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public Gyroscope() {
        SensorManager sensorManager = (SensorManager) WeakActivityHolder.get().getSystemService("sensor");
        this.mSensorManager = sensorManager;
        this.mGyroscope = sensorManager.getDefaultSensor(4);
        this.isEnabled_ = false;
    }

    boolean isAvailable() {
        return this.mGyroscope != null;
    }

    public void enable() {
        if (isAvailable() && !this.isEnabled_) {
            this.mSensorManager.registerListener(this, this.mGyroscope, 1);
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
        if (sensorEvent.sensor.getType() != 4) {
            return;
        }
        onSensorChanged(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
    }
}
