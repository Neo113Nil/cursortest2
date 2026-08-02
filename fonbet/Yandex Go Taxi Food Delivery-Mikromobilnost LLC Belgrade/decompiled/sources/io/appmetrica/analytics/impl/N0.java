package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes4.dex */
public final class N0 extends SafeRunnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ T0 c;

    public N0(T0 t0, String str, Throwable th) {
        this.c = t0;
        this.a = str;
        this.b = th;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        T0.a(this.c).reportRtmException(this.a, this.b);
    }
}
