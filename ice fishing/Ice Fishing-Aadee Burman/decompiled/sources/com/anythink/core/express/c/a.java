package com.anythink.core.express.c;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f17545d;

    /* renamed from: a, reason: collision with root package name */
    Sensor f17546a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17547b = "a";

    /* renamed from: c, reason: collision with root package name */
    private SensorManager f17548c;

    /* renamed from: e, reason: collision with root package name */
    private float[] f17549e;

    private a() {
        Context g4 = t.b().g();
        if (g4 != null) {
            try {
                if (this.f17548c == null) {
                    this.f17548c = (SensorManager) g4.getSystemService("sensor");
                }
                if (this.f17546a == null) {
                    this.f17546a = this.f17548c.getDefaultSensor(1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static a a() {
        if (f17545d == null) {
            synchronized (a.class) {
                try {
                    if (f17545d == null) {
                        f17545d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17545d;
    }

    public final boolean b() {
        return this.f17546a != null;
    }

    public final synchronized float[] c() {
        return this.f17549e;
    }

    public final void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f17548c;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
                sensorEventListener.hashCode();
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(SensorEventListener sensorEventListener) {
        try {
            this.f17548c.registerListener(sensorEventListener, this.f17546a, 2);
            sensorEventListener.hashCode();
        } catch (Throwable unused) {
        }
    }

    public final synchronized void a(float[] fArr) {
        this.f17549e = fArr;
    }
}
