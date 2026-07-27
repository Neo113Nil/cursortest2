package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* renamed from: com.google.android.gms.internal.ads.cp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3057cp extends AbstractC3605mx {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29753a;

    /* renamed from: b, reason: collision with root package name */
    public SensorManager f29754b;

    /* renamed from: c, reason: collision with root package name */
    public Sensor f29755c;

    /* renamed from: d, reason: collision with root package name */
    public long f29756d;

    /* renamed from: e, reason: collision with root package name */
    public int f29757e;

    /* renamed from: f, reason: collision with root package name */
    public C2748Qo f29758f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29759g;

    public C3057cp(Context context) {
        this.f29753a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3605mx
    public final void a(SensorEvent sensorEvent) {
        C3151ea c3151ea = AbstractC3368ia.oa;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f6 = fArr[0] / 9.80665f;
            float f9 = fArr[1] / 9.80665f;
            float f10 = fArr[2] / 9.80665f;
            float f11 = f10 * f10;
            float sqrt = (float) Math.sqrt(f11 + (f9 * f9) + (f6 * f6));
            C3151ea c3151ea2 = AbstractC3368ia.pa;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (sqrt >= ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).floatValue()) {
                p2.j.f39798C.f39810k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f29756d + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.qa)).intValue() <= currentTimeMillis) {
                    if (this.f29756d + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.ra)).intValue() < currentTimeMillis) {
                        this.f29757e = 0;
                    }
                    t2.C.k("Shake detected.");
                    this.f29756d = currentTimeMillis;
                    int i = this.f29757e + 1;
                    this.f29757e = i;
                    C2748Qo c2748Qo = this.f29758f;
                    if (c2748Qo == null || i != ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.sa)).intValue()) {
                        return;
                    }
                    c2748Qo.e(new BinderC2714Oo(0), EnumC2731Po.f27052v);
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.oa)).booleanValue()) {
                    if (this.f29754b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f29753a.getSystemService("sensor");
                        this.f29754b = sensorManager2;
                        if (sensorManager2 == null) {
                            int i = t2.C.f40822b;
                            u2.i.f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f29755c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f29759g && (sensorManager = this.f29754b) != null && (sensor = this.f29755c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        p2.j.f39798C.f39810k.getClass();
                        this.f29756d = System.currentTimeMillis() - ((Integer) r1.f40119c.a(AbstractC3368ia.qa)).intValue();
                        this.f29759g = true;
                        t2.C.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
