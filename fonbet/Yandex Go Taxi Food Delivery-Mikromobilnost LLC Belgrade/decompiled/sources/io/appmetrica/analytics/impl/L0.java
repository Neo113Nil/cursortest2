package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes4.dex */
public final class L0 extends SafeRunnable {
    public final /* synthetic */ RtmConfig a;
    public final /* synthetic */ T0 b;

    public L0(T0 t0, RtmConfig rtmConfig) {
        this.b = t0;
        this.a = rtmConfig;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        T0.a(this.b).updateRtmConfig(this.a);
    }
}
