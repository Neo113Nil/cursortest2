package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Th, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2792Th {

    /* renamed from: a, reason: collision with root package name */
    public final C2742Qh f27764a;

    /* renamed from: b, reason: collision with root package name */
    public final C3153eo f27765b;

    public C2792Th(C2742Qh c2742Qh, C3153eo c3153eo) {
        this.f27764a = c2742Qh;
        this.f27765b = c3153eo;
    }

    public final void a(Context context, C5110a c5110a) {
        C3301ha c3301ha = AbstractC3569ma.xf;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            AbstractExecutorService abstractExecutorService = AbstractC3413jg.f31268a;
            C3301ha c3301ha2 = AbstractC3569ma.zf;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue()) {
                ThreadFactoryC2776Sh threadFactoryC2776Sh = new ThreadFactoryC2776Sh(((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Bf)).intValue());
                int intValue = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Af)).intValue();
                abstractExecutorService = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC2776Sh);
            }
            abstractExecutorService.execute(new RunnableC3865s0(5, this, context, c5110a));
        }
    }
}
