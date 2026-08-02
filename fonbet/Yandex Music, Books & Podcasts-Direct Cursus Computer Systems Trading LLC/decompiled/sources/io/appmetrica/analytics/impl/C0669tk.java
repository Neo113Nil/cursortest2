package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0669tk implements Provider {
    public final /* synthetic */ D0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ReporterConfig c;

    public C0669tk(D0 d0, Context context, ReporterConfig reporterConfig) {
        this.a = d0;
        this.b = context;
        this.c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        D0 d0 = this.a;
        Context context = this.b;
        ReporterConfig reporterConfig = this.c;
        d0.getClass();
        return C0.a(context).d().c(reporterConfig);
    }
}
