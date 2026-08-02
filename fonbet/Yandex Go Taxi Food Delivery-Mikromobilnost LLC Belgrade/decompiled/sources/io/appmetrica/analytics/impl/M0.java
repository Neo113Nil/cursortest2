package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes4.dex */
public final class M0 extends SafeRunnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ T0 c;

    public M0(T0 t0, String str, String str2) {
        this.c = t0;
        this.a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        T0.a(this.c).reportRtmException(this.a, this.b);
    }
}
