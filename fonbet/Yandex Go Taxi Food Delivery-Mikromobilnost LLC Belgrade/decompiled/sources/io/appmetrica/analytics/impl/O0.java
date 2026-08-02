package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes9.dex */
public final class O0 extends SafeRunnable {
    public final /* synthetic */ RtmClientEvent a;
    public final /* synthetic */ T0 b;

    public O0(T0 t0, RtmClientEvent rtmClientEvent) {
        this.b = t0;
        this.a = rtmClientEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        T0.a(this.b).reportRtmEvent(this.a);
    }
}
