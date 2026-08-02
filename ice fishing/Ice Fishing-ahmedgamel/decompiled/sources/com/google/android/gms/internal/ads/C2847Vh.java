package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Vh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2847Vh {

    /* renamed from: a, reason: collision with root package name */
    public String f29019a;

    /* renamed from: b, reason: collision with root package name */
    public WL f29020b;

    /* renamed from: c, reason: collision with root package name */
    public TM f29021c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f29022d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f29023e = new AtomicBoolean(false);

    public C2847Vh(ScheduledExecutorService scheduledExecutorService) {
        this.f29022d = scheduledExecutorService;
    }

    public final void a() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.aa)).booleanValue() && !this.f29023e.getAndSet(true)) {
            b();
        }
    }

    public final void b() {
        try {
            String d9 = com.bumptech.glide.f.m("GET_VARIATIONS_HEADER") ? H0.e.d() : null;
            if (d9 != null && !d9.isEmpty()) {
                this.f29019a = d9;
                byte[] decode = Base64.decode(d9, 10);
                this.f29020b = WL.A(decode, PK.a());
                C3324ha c3324ha = AbstractC3592ma.da;
                s2.r rVar = s2.r.f40506e;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2 = rVar.f40509c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).booleanValue()) {
                    this.f29021c = TM.A(decode, PK.a());
                }
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.ba)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.aa)).booleanValue()) {
                    this.f29022d.schedule(new RunnableC3134e(26, this), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.ca)).intValue(), TimeUnit.MINUTES);
                }
            }
        } catch (C3318hL e9) {
            e = e9;
            C4906k.f40186C.f40196h.e("ChromeVariations", e);
        } catch (IllegalArgumentException e10) {
            e = e10;
            C4906k.f40186C.f40196h.e("ChromeVariations", e);
        }
    }
}
