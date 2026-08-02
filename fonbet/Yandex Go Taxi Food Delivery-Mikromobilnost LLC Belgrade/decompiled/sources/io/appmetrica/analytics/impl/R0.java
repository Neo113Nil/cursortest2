package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes4.dex */
public final class R0 extends SafeRunnable {
    public final /* synthetic */ PulseConfig a;
    public final /* synthetic */ T0 b;

    public R0(T0 t0, PulseConfig pulseConfig) {
        this.b = t0;
        this.a = pulseConfig;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        T0.a(this.b).a(this.a);
    }
}
