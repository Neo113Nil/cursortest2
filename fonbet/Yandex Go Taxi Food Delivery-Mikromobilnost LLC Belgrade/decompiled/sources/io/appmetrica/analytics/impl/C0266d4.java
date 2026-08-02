package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0266d4 {
    public final C0799vi a;
    public final BigDecimal b;
    public final C0539mi c;
    public final C0367gj d;

    public C0266d4(ECommerceCartItem eCommerceCartItem) {
        this(new C0799vi(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C0539mi(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C0367gj(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.a + ", quantity=" + this.b + ", revenue=" + this.c + ", referrer=" + this.d + '}';
    }

    public C0266d4(C0799vi c0799vi, BigDecimal bigDecimal, C0539mi c0539mi, C0367gj c0367gj) {
        this.a = c0799vi;
        this.b = bigDecimal;
        this.c = c0539mi;
        this.d = c0367gj;
    }
}
