package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class Qh implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0911z0 f4958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f4960c;

    public Qh(C0911z0 c0911z0, Context context, ReporterConfig reporterConfig) {
        this.f4958a = c0911z0;
        this.f4959b = context;
        this.f4960c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C0911z0 c0911z0 = this.f4958a;
        Context context = this.f4959b;
        ReporterConfig reporterConfig = this.f4960c;
        c0911z0.getClass();
        return C0885y0.a(context).f().c(reporterConfig);
    }
}
