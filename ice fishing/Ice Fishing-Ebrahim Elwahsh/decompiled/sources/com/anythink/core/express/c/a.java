package com.anythink.core.express.c;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f17703d;

    /* renamed from: a, reason: collision with root package name */
    Sensor f17704a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17705b = "a";

    /* renamed from: c, reason: collision with root package name */
    private SensorManager f17706c;

    /* renamed from: e, reason: collision with root package name */
    private float[] f17707e;

    private a() {
        Context g9 = t.b().g();
        if (g9 != null) {
            try {
                if (this.f17706c == null) {
                    this.f17706c = (SensorManager) g9.getSystemService("sensor");
                }
                if (this.f17704a == null) {
                    this.f17704a = this.f17706c.getDefaultSensor(1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static a a() {
        if (f17703d == null) {
            synchronized (a.class) {
                try {
                    if (f17703d == null) {
                        f17703d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17703d;
    }

    public final boolean b() {
        return this.f17704a != null;
    }

    public final synchronized float[] c() {
        return this.f17707e;
    }

    public final void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f17706c;
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
            this.f17706c.registerListener(sensorEventListener, this.f17704a, 2);
            sensorEventListener.hashCode();
        } catch (Throwable unused) {
        }
    }

    public final synchronized void a(float[] fArr) {
        this.f17707e = fArr;
    }
}
