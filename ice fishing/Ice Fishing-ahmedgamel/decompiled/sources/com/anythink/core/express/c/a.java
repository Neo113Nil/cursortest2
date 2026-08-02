package com.anythink.core.express.c;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f18332d;

    /* renamed from: a, reason: collision with root package name */
    Sensor f18333a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18334b = "a";

    /* renamed from: c, reason: collision with root package name */
    private SensorManager f18335c;

    /* renamed from: e, reason: collision with root package name */
    private float[] f18336e;

    private a() {
        Context g9 = t.b().g();
        if (g9 != null) {
            try {
                if (this.f18335c == null) {
                    this.f18335c = (SensorManager) g9.getSystemService("sensor");
                }
                if (this.f18333a == null) {
                    this.f18333a = this.f18335c.getDefaultSensor(1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static a a() {
        if (f18332d == null) {
            synchronized (a.class) {
                try {
                    if (f18332d == null) {
                        f18332d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18332d;
    }

    public final boolean b() {
        return this.f18333a != null;
    }

    public final synchronized float[] c() {
        return this.f18336e;
    }

    public final void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f18335c;
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
            this.f18335c.registerListener(sensorEventListener, this.f18333a, 2);
            sensorEventListener.hashCode();
        } catch (Throwable unused) {
        }
    }

    public final synchronized void a(float[] fArr) {
        this.f18336e = fArr;
    }
}
