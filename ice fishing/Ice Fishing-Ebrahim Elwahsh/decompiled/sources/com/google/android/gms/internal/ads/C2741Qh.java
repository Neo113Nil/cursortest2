package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Qh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2741Qh {

    /* renamed from: a, reason: collision with root package name */
    public final C2690Nh f27198a;

    /* renamed from: b, reason: collision with root package name */
    public final C3165eo f27199b;

    public C2741Qh(C2690Nh c2690Nh, C3165eo c3165eo) {
        this.f27198a = c2690Nh;
        this.f27199b = c3165eo;
    }

    public final void a(Context context, C5107a c5107a) {
        C3151ea c3151ea = AbstractC3368ia.rf;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            AbstractExecutorService abstractExecutorService = AbstractC3212fg.f30738a;
            C3151ea c3151ea2 = AbstractC3368ia.tf;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue()) {
                ThreadFactoryC2724Ph threadFactoryC2724Ph = new ThreadFactoryC2724Ph(((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.vf)).intValue());
                int intValue = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.uf)).intValue();
                abstractExecutorService = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC2724Ph);
            }
            abstractExecutorService.execute(new RunnableC3771q0(this, context, c5107a, 5));
        }
    }
}
