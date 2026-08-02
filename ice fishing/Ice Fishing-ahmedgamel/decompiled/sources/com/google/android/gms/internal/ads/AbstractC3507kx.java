package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.google.android.gms.internal.ads.kx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3507kx implements SensorEventListener {
    public abstract void a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a(sensorEvent);
    }
}
