package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.ap, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2940ap extends AbstractC3484kx {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29124a;

    /* renamed from: b, reason: collision with root package name */
    public SensorManager f29125b;

    /* renamed from: c, reason: collision with root package name */
    public Sensor f29126c;

    /* renamed from: d, reason: collision with root package name */
    public long f29127d;

    /* renamed from: e, reason: collision with root package name */
    public int f29128e;

    /* renamed from: f, reason: collision with root package name */
    public C2749Qo f29129f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29130g;

    public C2940ap(Context context) {
        this.f29124a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3484kx
    public final void a(SensorEvent sensorEvent) {
        C3301ha c3301ha = AbstractC3569ma.oa;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f3 = fArr[0] / 9.80665f;
            float f9 = fArr[1] / 9.80665f;
            float f10 = fArr[2] / 9.80665f;
            float f11 = f10 * f10;
            float sqrt = (float) Math.sqrt(f11 + (f9 * f9) + (f3 * f3));
            C3301ha c3301ha2 = AbstractC3569ma.pa;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
            if (sqrt >= ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).floatValue()) {
                C4835j.f39733C.f39745k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f29127d + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.qa)).intValue() <= currentTimeMillis) {
                    if (this.f29127d + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.ra)).intValue() < currentTimeMillis) {
                        this.f29128e = 0;
                    }
                    u2.z.k("Shake detected.");
                    this.f29127d = currentTimeMillis;
                    int i = this.f29128e + 1;
                    this.f29128e = i;
                    C2749Qo c2749Qo = this.f29129f;
                    if (c2749Qo == null || i != ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.sa)).intValue()) {
                        return;
                    }
                    c2749Qo.e(new BinderC2715Oo(0), EnumC2732Po.f26863v);
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.oa)).booleanValue()) {
                    if (this.f29125b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f29124a.getSystemService("sensor");
                        this.f29125b = sensorManager2;
                        if (sensorManager2 == null) {
                            int i = u2.z.f41322b;
                            v2.i.f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f29126c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f29130g && (sensorManager = this.f29125b) != null && (sensor = this.f29126c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        C4835j.f39733C.f39745k.getClass();
                        this.f29127d = System.currentTimeMillis() - ((Integer) r1.f40210c.a(AbstractC3569ma.qa)).intValue();
                        this.f29130g = true;
                        u2.z.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
