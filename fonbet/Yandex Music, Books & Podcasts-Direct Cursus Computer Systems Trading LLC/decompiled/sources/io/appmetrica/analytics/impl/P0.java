package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes5.dex */
public final class P0 extends SafeRunnable {
    public final /* synthetic */ S0 a;

    public P0(S0 s0) {
        this.a = s0;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        S0.a(this.a).b();
    }
}
