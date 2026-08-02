package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Ho, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2616Ho extends AbstractC3507kx {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f26115a;

    /* renamed from: b, reason: collision with root package name */
    public final Sensor f26116b;

    /* renamed from: c, reason: collision with root package name */
    public float f26117c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public Float f26118d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    public long f26119e;

    /* renamed from: f, reason: collision with root package name */
    public int f26120f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26121g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26122h;
    public C2786Ro i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26123j;

    public C2616Ho(Context context) {
        C4906k.f40186C.f40198k.getClass();
        this.f26119e = System.currentTimeMillis();
        this.f26120f = 0;
        this.f26121g = false;
        this.f26122h = false;
        this.i = null;
        this.f26123j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f26115a = sensorManager;
        if (sensorManager != null) {
            this.f26116b = sensorManager.getDefaultSensor(4);
        } else {
            this.f26116b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3507kx
    public final void a(SensorEvent sensorEvent) {
        C3324ha c3324ha = AbstractC3592ma.ta;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            C4906k.f40186C.f40198k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j6 = this.f26119e;
            C3324ha c3324ha2 = AbstractC3592ma.va;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (j6 + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).intValue() < currentTimeMillis) {
                this.f26120f = 0;
                this.f26119e = currentTimeMillis;
                this.f26121g = false;
                this.f26122h = false;
                this.f26117c = this.f26118d.floatValue();
            }
            float floatValue = this.f26118d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f26118d = Float.valueOf(floatValue);
            float f2 = this.f26117c;
            C3324ha c3324ha3 = AbstractC3592ma.ua;
            if (floatValue > ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha3)).floatValue() + f2) {
                this.f26117c = this.f26118d.floatValue();
                this.f26122h = true;
            } else if (this.f26118d.floatValue() < this.f26117c - ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha3)).floatValue()) {
                this.f26117c = this.f26118d.floatValue();
                this.f26121g = true;
            }
            if (this.f26118d.isInfinite()) {
                this.f26118d = Float.valueOf(0.0f);
                this.f26117c = 0.0f;
            }
            if (this.f26121g && this.f26122h) {
                w2.z.k("Flick detected.");
                this.f26119e = currentTimeMillis;
                int i = this.f26120f + 1;
                this.f26120f = i;
                this.f26121g = false;
                this.f26122h = false;
                C2786Ro c2786Ro = this.i;
                if (c2786Ro == null || i != ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.wa)).intValue()) {
                    return;
                }
                c2786Ro.e(new BinderC2752Po(1), EnumC2769Qo.f27856v);
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ta)).booleanValue()) {
                    if (!this.f26123j && (sensorManager = this.f26115a) != null && (sensor = this.f26116b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f26123j = true;
                        w2.z.k("Listening for flick gestures.");
                    }
                    if (this.f26115a == null || this.f26116b == null) {
                        int i = w2.z.f41712b;
                        x2.i.f("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
