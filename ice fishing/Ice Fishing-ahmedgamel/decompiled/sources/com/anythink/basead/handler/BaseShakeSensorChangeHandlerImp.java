package com.anythink.basead.handler;

import android.hardware.SensorEvent;
import com.anythink.core.express.c.a;

/* loaded from: classes.dex */
public abstract class BaseShakeSensorChangeHandlerImp implements IShackSensorChangeHandler {

    /* renamed from: a, reason: collision with root package name */
    protected final int f9827a = 0;

    /* renamed from: b, reason: collision with root package name */
    protected final int f9828b = 1;

    /* renamed from: c, reason: collision with root package name */
    protected final int f9829c = 2;

    /* renamed from: d, reason: collision with root package name */
    private float f9830d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f9831e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f9832f = 0.0f;

    public final void a(SensorEvent sensorEvent) {
        try {
            float[] fArr = sensorEvent.values;
            if (Math.abs(fArr[0]) > this.f9830d) {
                this.f9830d = Math.abs(fArr[0]);
            }
            if (Math.abs(fArr[1]) > this.f9831e) {
                this.f9831e = Math.abs(fArr[1]);
            }
            if (Math.abs(fArr[2]) > this.f9832f) {
                this.f9832f = Math.abs(fArr[2]);
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        a.a().a(getMaxAccValues());
    }

    public float[] getMaxAccValues() {
        try {
            return new float[]{this.f9830d, this.f9831e, this.f9832f};
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a() {
        this.f9830d = 0.0f;
        this.f9831e = 0.0f;
        this.f9832f = 0.0f;
    }
}
