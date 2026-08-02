package com.anythink.core.express.c;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes.dex */
public abstract class b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18337a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18338b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18339c = 2;

    /* renamed from: d, reason: collision with root package name */
    public float f18340d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f18341e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f18342f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public long f18343g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f18344h;
    private int i;

    public b(int i, int i4) {
        this.f18344h = i;
        this.i = i4;
    }

    public abstract void a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (java.lang.Math.abs(r9 - r2) > r8.f18344h) goto L14;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f2 = -fArr[0];
        float f9 = -fArr[1];
        float f10 = -fArr[2];
        String.format("mtg handleSensorData lastx:%d,lasty:%d,lastz:%d", Integer.valueOf((int) f2), Integer.valueOf((int) f9), Integer.valueOf((int) f10));
        float f11 = this.f18340d;
        if (f11 == 0.0f || Math.abs(f2 - f11) <= this.f18344h) {
            float f12 = this.f18341e;
            if (f12 == 0.0f || Math.abs(f9 - f12) <= this.f18344h) {
                float f13 = this.f18342f;
                if (f13 != 0.0f) {
                }
                this.f18340d = f2;
                this.f18341e = f9;
                this.f18342f = f10;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f18343g > this.i) {
            this.f18343g = currentTimeMillis;
            a();
        }
        this.f18340d = f2;
        this.f18341e = f9;
        this.f18342f = f10;
    }
}
