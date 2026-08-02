package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0580o1 implements Runnable {
    public final /* synthetic */ ECommerceEvent a;
    public final /* synthetic */ J1 b;

    public RunnableC0580o1(J1 j1, ECommerceEvent eCommerceEvent) {
        this.b = j1;
        this.a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J1.a(this.b).reportECommerce(this.a);
    }
}
