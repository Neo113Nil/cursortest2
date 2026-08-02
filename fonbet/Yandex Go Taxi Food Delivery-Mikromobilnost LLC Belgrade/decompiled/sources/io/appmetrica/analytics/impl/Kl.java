package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.rtmwrapper.internal.IRtmCrashWrapper;

/* loaded from: classes9.dex */
public final class Kl implements InterfaceC0331fc {
    public final IRtmCrashWrapper a;

    public Kl(IRtmCrashWrapper iRtmCrashWrapper) {
        this.a = iRtmCrashWrapper;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0331fc
    public final void a(Throwable th, C0204b0 c0204b0) {
        this.a.reportException(th == null ? "" : th.getClass().getName(), th);
    }
}
