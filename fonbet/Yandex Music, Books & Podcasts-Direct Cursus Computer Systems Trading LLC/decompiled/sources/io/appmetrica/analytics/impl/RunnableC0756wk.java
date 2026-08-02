package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0756wk implements Runnable {
    public final /* synthetic */ ReporterConfig a;
    public final /* synthetic */ Jk b;

    public RunnableC0756wk(Jk jk, ReporterConfig reporterConfig) {
        this.b = jk;
        this.a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.b;
        ReporterConfig reporterConfig = this.a;
        D0 d0 = jk.a;
        Context context = jk.d;
        d0.getClass();
        C0.a(context).d().a(reporterConfig);
    }
}
