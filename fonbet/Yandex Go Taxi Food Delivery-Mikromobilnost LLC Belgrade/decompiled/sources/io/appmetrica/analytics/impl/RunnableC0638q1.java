package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0638q1 implements Runnable {
    public final /* synthetic */ DeferredDeeplinkListener a;
    public final /* synthetic */ J1 b;

    public RunnableC0638q1(J1 j1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.b = j1;
        this.a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.getClass();
        E0 e0 = E0.e;
        e0.d().a(this.a);
    }
}
