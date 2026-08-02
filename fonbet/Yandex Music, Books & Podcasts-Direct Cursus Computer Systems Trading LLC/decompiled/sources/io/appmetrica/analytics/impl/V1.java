package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes5.dex */
public final class V1 extends SafeRunnable {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ C0247f2 b;

    public V1(C0247f2 c0247f2, Configuration configuration) {
        this.b = c0247f2;
        this.a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.onConfigurationChanged(this.a);
    }
}
