package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes9.dex */
public final class Dk implements Provider {
    public final /* synthetic */ F0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ReporterConfig c;

    public Dk(F0 f0, Context context, ReporterConfig reporterConfig) {
        this.a = f0;
        this.b = context;
        this.c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        F0 f0 = this.a;
        Context context = this.b;
        ReporterConfig reporterConfig = this.c;
        f0.getClass();
        return E0.a(context).d().c(reporterConfig);
    }
}
