package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.RtmErrorEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes4.dex */
public final class P0 extends SafeRunnable {
    public final /* synthetic */ RtmErrorEvent a;
    public final /* synthetic */ T0 b;

    public P0(T0 t0, RtmErrorEvent rtmErrorEvent) {
        this.b = t0;
        this.a = rtmErrorEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        T0.a(this.b).reportRtmError(this.a);
    }
}
