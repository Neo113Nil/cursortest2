package com.anythink.basead.d;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes.dex */
public abstract class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public long f6139a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f6140b = com.anythink.basead.exoplayer.i.a.f7883f;

    public abstract boolean a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f6139a <= this.f6140b || !a(sensorEvent)) {
            return;
        }
        this.f6139a = currentTimeMillis;
    }
}
