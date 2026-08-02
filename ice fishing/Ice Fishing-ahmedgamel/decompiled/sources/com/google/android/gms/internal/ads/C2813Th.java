package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Th, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2813Th {

    /* renamed from: a, reason: collision with root package name */
    public final C2762Qh f28551a;

    /* renamed from: b, reason: collision with root package name */
    public final C3230fo f28552b;

    public C2813Th(C2762Qh c2762Qh, C3230fo c3230fo) {
        this.f28551a = c2762Qh;
        this.f28552b = c3230fo;
    }

    public final void a(Context context, C5189a c5189a) {
        C3324ha c3324ha = AbstractC3592ma.xf;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            AbstractExecutorService abstractExecutorService = AbstractC3436jg.f32055a;
            C3324ha c3324ha2 = AbstractC3592ma.zf;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue()) {
                ThreadFactoryC2796Sh threadFactoryC2796Sh = new ThreadFactoryC2796Sh(((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Bf)).intValue());
                int intValue = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Af)).intValue();
                abstractExecutorService = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC2796Sh);
            }
            abstractExecutorService.execute(new RunnableC3888s0(5, this, context, c5189a));
        }
    }
}
