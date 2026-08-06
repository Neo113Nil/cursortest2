package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* loaded from: classes.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f5460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5461b;

    public Z0(C0756t1 c0756t1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f5461b = c0756t1;
        this.f5460a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5461b.f6922a.getClass();
        C0885y0 c0885y0 = C0885y0.f7216e;
        c0885y0.f().a(this.f5460a);
    }
}
