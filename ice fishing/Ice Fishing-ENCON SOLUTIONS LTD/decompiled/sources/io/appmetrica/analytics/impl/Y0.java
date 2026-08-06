package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class Y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f5409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f5410b;

    public Y0(C0756t1 c0756t1, ECommerceEvent eCommerceEvent) {
        this.f5410b = c0756t1;
        this.f5409a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f5410b).reportECommerce(this.f5409a);
    }
}
