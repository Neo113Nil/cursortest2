package com.anythink.basead.handler;

import android.hardware.SensorEvent;
import com.anythink.core.express.c.a;

/* loaded from: classes.dex */
public abstract class BaseShakeSensorChangeHandlerImp implements IShackSensorChangeHandler {

    /* renamed from: a, reason: collision with root package name */
    protected final int f9198a = 0;

    /* renamed from: b, reason: collision with root package name */
    protected final int f9199b = 1;

    /* renamed from: c, reason: collision with root package name */
    protected final int f9200c = 2;

    /* renamed from: d, reason: collision with root package name */
    private float f9201d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f9202e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f9203f = 0.0f;

    public final void a(SensorEvent sensorEvent) {
        try {
            float[] fArr = sensorEvent.values;
            if (Math.abs(fArr[0]) > this.f9201d) {
                this.f9201d = Math.abs(fArr[0]);
            }
            if (Math.abs(fArr[1]) > this.f9202e) {
                this.f9202e = Math.abs(fArr[1]);
            }
            if (Math.abs(fArr[2]) > this.f9203f) {
                this.f9203f = Math.abs(fArr[2]);
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        a.a().a(getMaxAccValues());
    }

    public float[] getMaxAccValues() {
        try {
            return new float[]{this.f9201d, this.f9202e, this.f9203f};
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a() {
        this.f9201d = 0.0f;
        this.f9202e = 0.0f;
        this.f9203f = 0.0f;
    }
}
