package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0216e0 extends SafeRunnable {
    public final /* synthetic */ C0245f0 a;
    public final /* synthetic */ Context b;

    public C0216e0(C0245f0 c0245f0, Context context) {
        this.a = c0245f0;
        this.b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0245f0 c0245f0 = this.a;
        Context context = this.b;
        c0245f0.getClass();
        c0245f0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
