package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* loaded from: classes5.dex */
public final class Z3 {
    public final C0234ei a;
    public final BigDecimal b;
    public final Vh c;
    public final C0120aj d;

    public Z3(ECommerceCartItem eCommerceCartItem) {
        this(new C0234ei(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Vh(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C0120aj(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.a + ", quantity=" + this.b + ", revenue=" + this.c + ", referrer=" + this.d + '}';
    }

    public Z3(C0234ei c0234ei, BigDecimal bigDecimal, Vh vh, C0120aj c0120aj) {
        this.a = c0234ei;
        this.b = bigDecimal;
        this.c = vh;
        this.d = c0120aj;
    }
}
