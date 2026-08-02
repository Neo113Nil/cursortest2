package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.g0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0348g0 extends SafeRunnable {
    public final /* synthetic */ C0377h0 a;
    public final /* synthetic */ Context b;

    public C0348g0(C0377h0 c0377h0, Context context) {
        this.a = c0377h0;
        this.b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0377h0 c0377h0 = this.a;
        Context context = this.b;
        c0377h0.getClass();
        c0377h0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
