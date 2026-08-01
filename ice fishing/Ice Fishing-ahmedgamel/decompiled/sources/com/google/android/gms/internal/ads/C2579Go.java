package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Go, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2579Go extends AbstractC3484kx {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f25114a;

    /* renamed from: b, reason: collision with root package name */
    public final Sensor f25115b;

    /* renamed from: c, reason: collision with root package name */
    public float f25116c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public Float f25117d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    public long f25118e;

    /* renamed from: f, reason: collision with root package name */
    public int f25119f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25120g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25121h;
    public C2749Qo i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25122j;

    public C2579Go(Context context) {
        C4835j.f39733C.f39745k.getClass();
        this.f25118e = System.currentTimeMillis();
        this.f25119f = 0;
        this.f25120g = false;
        this.f25121h = false;
        this.i = null;
        this.f25122j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f25114a = sensorManager;
        if (sensorManager != null) {
            this.f25115b = sensorManager.getDefaultSensor(4);
        } else {
            this.f25115b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3484kx
    public final void a(SensorEvent sensorEvent) {
        C3301ha c3301ha = AbstractC3569ma.ta;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            C4835j.f39733C.f39745k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j6 = this.f25118e;
            C3301ha c3301ha2 = AbstractC3569ma.va;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
            if (j6 + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).intValue() < currentTimeMillis) {
                this.f25119f = 0;
                this.f25118e = currentTimeMillis;
                this.f25120g = false;
                this.f25121h = false;
                this.f25116c = this.f25117d.floatValue();
            }
            float floatValue = this.f25117d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f25117d = Float.valueOf(floatValue);
            float f3 = this.f25116c;
            C3301ha c3301ha3 = AbstractC3569ma.ua;
            if (floatValue > ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha3)).floatValue() + f3) {
                this.f25116c = this.f25117d.floatValue();
                this.f25121h = true;
            } else if (this.f25117d.floatValue() < this.f25116c - ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha3)).floatValue()) {
                this.f25116c = this.f25117d.floatValue();
                this.f25120g = true;
            }
            if (this.f25117d.isInfinite()) {
                this.f25117d = Float.valueOf(0.0f);
                this.f25116c = 0.0f;
            }
            if (this.f25120g && this.f25121h) {
                u2.z.k("Flick detected.");
                this.f25118e = currentTimeMillis;
                int i = this.f25119f + 1;
                this.f25119f = i;
                this.f25120g = false;
                this.f25121h = false;
                C2749Qo c2749Qo = this.i;
                if (c2749Qo == null || i != ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.wa)).intValue()) {
                    return;
                }
                c2749Qo.e(new BinderC2715Oo(1), EnumC2732Po.f26863v);
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.ta)).booleanValue()) {
                    if (!this.f25122j && (sensorManager = this.f25114a) != null && (sensor = this.f25115b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f25122j = true;
                        u2.z.k("Listening for flick gestures.");
                    }
                    if (this.f25114a == null || this.f25115b == null) {
                        int i = u2.z.f41322b;
                        v2.i.f("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
