package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes9.dex */
public final class Hk implements Runnable {
    public final /* synthetic */ ReporterConfig a;
    public final /* synthetic */ Tk b;

    public Hk(Tk tk, ReporterConfig reporterConfig) {
        this.b = tk;
        this.a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        ReporterConfig reporterConfig = this.a;
        F0 f0 = tk.a;
        Context context = tk.d;
        f0.getClass();
        E0.a(context).d().a(reporterConfig);
    }
}
