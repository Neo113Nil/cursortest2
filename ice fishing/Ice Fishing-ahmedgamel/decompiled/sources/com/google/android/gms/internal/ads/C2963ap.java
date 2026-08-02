package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.ap, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2963ap extends AbstractC3507kx {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29909a;

    /* renamed from: b, reason: collision with root package name */
    public SensorManager f29910b;

    /* renamed from: c, reason: collision with root package name */
    public Sensor f29911c;

    /* renamed from: d, reason: collision with root package name */
    public long f29912d;

    /* renamed from: e, reason: collision with root package name */
    public int f29913e;

    /* renamed from: f, reason: collision with root package name */
    public C2786Ro f29914f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29915g;

    public C2963ap(Context context) {
        this.f29909a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3507kx
    public final void a(SensorEvent sensorEvent) {
        C3324ha c3324ha = AbstractC3592ma.oa;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f2 = fArr[0] / 9.80665f;
            float f9 = fArr[1] / 9.80665f;
            float f10 = fArr[2] / 9.80665f;
            float f11 = f10 * f10;
            float sqrt = (float) Math.sqrt(f11 + (f9 * f9) + (f2 * f2));
            C3324ha c3324ha2 = AbstractC3592ma.pa;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (sqrt >= ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).floatValue()) {
                C4906k.f40186C.f40198k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f29912d + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.qa)).intValue() <= currentTimeMillis) {
                    if (this.f29912d + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.ra)).intValue() < currentTimeMillis) {
                        this.f29913e = 0;
                    }
                    w2.z.k("Shake detected.");
                    this.f29912d = currentTimeMillis;
                    int i = this.f29913e + 1;
                    this.f29913e = i;
                    C2786Ro c2786Ro = this.f29914f;
                    if (c2786Ro == null || i != ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.sa)).intValue()) {
                        return;
                    }
                    c2786Ro.e(new BinderC2752Po(0), EnumC2769Qo.f27856v);
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.oa)).booleanValue()) {
                    if (this.f29910b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f29909a.getSystemService("sensor");
                        this.f29910b = sensorManager2;
                        if (sensorManager2 == null) {
                            int i = w2.z.f41712b;
                            x2.i.f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f29911c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f29915g && (sensorManager = this.f29910b) != null && (sensor = this.f29911c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        C4906k.f40186C.f40198k.getClass();
                        this.f29912d = System.currentTimeMillis() - ((Integer) r1.f40509c.a(AbstractC3592ma.qa)).intValue();
                        this.f29915g = true;
                        w2.z.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
