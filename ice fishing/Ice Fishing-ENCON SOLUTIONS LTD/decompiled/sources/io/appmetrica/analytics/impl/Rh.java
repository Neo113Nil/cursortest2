package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class Rh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f4999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5000b;

    public Rh(C0437gi c0437gi, ECommerceEvent eCommerceEvent) {
        this.f5000b = c0437gi;
        this.f4999a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5000b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportECommerce(this.f4999a);
    }
}
