package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0535p1 implements Runnable {
    public final /* synthetic */ DeferredDeeplinkParametersListener a;
    public final /* synthetic */ J1 b;

    public RunnableC0535p1(J1 j1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.b = j1;
        this.a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.getClass();
        C0 c0 = C0.e;
        c0.d().a(this.a);
    }
}
