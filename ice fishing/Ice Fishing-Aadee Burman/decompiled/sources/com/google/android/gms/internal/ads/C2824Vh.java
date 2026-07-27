package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Vh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2824Vh {

    /* renamed from: a, reason: collision with root package name */
    public String f28222a;

    /* renamed from: b, reason: collision with root package name */
    public WL f28223b;

    /* renamed from: c, reason: collision with root package name */
    public TM f28224c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f28225d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f28226e = new AtomicBoolean(false);

    public C2824Vh(ScheduledExecutorService scheduledExecutorService) {
        this.f28225d = scheduledExecutorService;
    }

    public final void a() {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.aa)).booleanValue() && !this.f28226e.getAndSet(true)) {
            b();
        }
    }

    public final void b() {
        try {
            String d2 = com.bumptech.glide.f.o("GET_VARIATIONS_HEADER") ? H0.e.d() : null;
            if (d2 != null && !d2.isEmpty()) {
                this.f28222a = d2;
                byte[] decode = Base64.decode(d2, 10);
                this.f28223b = WL.A(decode, PK.a());
                C3301ha c3301ha = AbstractC3569ma.da;
                q2.r rVar = q2.r.f40204e;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2 = rVar.f40207c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).booleanValue()) {
                    this.f28224c = TM.A(decode, PK.a());
                }
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.ba)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.aa)).booleanValue()) {
                    this.f28225d.schedule(new RunnableC3111e(26, this), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.ca)).intValue(), TimeUnit.MINUTES);
                }
            }
        } catch (C3295hL e9) {
            e = e9;
            C4835j.f39730C.f39740h.e("ChromeVariations", e);
        } catch (IllegalArgumentException e10) {
            e = e10;
            C4835j.f39730C.f39740h.e("ChromeVariations", e);
        }
    }
}
