package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes4.dex */
public final class Q0 extends SafeRunnable {
    public final /* synthetic */ T0 a;

    public Q0(T0 t0) {
        this.a = t0;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        T0.a(this.a).b();
    }
}
