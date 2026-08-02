package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0698uk implements Runnable {
    public final /* synthetic */ ECommerceEvent a;
    public final /* synthetic */ Jk b;

    public RunnableC0698uk(Jk jk, ECommerceEvent eCommerceEvent) {
        this.b = jk;
        this.a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.b;
        Jk.a(jk.a, jk.d, jk.e).reportECommerce(this.a);
    }
}
