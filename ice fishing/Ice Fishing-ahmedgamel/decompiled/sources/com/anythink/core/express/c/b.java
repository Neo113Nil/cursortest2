package com.anythink.core.express.c;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes.dex */
public abstract class b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17550a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17551b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17552c = 2;

    /* renamed from: d, reason: collision with root package name */
    public float f17553d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f17554e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f17555f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public long f17556g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f17557h;
    private int i;

    public b(int i, int i6) {
        this.f17557h = i;
        this.i = i6;
    }

    public abstract void a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (java.lang.Math.abs(r9 - r2) > r8.f17557h) goto L14;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f3 = -fArr[0];
        float f9 = -fArr[1];
        float f10 = -fArr[2];
        String.format("mtg handleSensorData lastx:%d,lasty:%d,lastz:%d", Integer.valueOf((int) f3), Integer.valueOf((int) f9), Integer.valueOf((int) f10));
        float f11 = this.f17553d;
        if (f11 == 0.0f || Math.abs(f3 - f11) <= this.f17557h) {
            float f12 = this.f17554e;
            if (f12 == 0.0f || Math.abs(f9 - f12) <= this.f17557h) {
                float f13 = this.f17555f;
                if (f13 != 0.0f) {
                }
                this.f17553d = f3;
                this.f17554e = f9;
                this.f17555f = f10;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f17556g > this.i) {
            this.f17556g = currentTimeMillis;
            a();
        }
        this.f17553d = f3;
        this.f17554e = f9;
        this.f17555f = f10;
    }
}
