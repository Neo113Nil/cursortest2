package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0265a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f5536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5537b;

    public RunnableC0265a1(C0756t1 c0756t1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f5537b = c0756t1;
        this.f5536a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5537b.f6922a.getClass();
        C0885y0 c0885y0 = C0885y0.f7216e;
        c0885y0.f().a(this.f5536a);
    }
}
