package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0609p1 implements Runnable {
    public final /* synthetic */ DeferredDeeplinkParametersListener a;
    public final /* synthetic */ J1 b;

    public RunnableC0609p1(J1 j1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.b = j1;
        this.a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.getClass();
        E0 e0 = E0.e;
        e0.d().a(this.a);
    }
}
