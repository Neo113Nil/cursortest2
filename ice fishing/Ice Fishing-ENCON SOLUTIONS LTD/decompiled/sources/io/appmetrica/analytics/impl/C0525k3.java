package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525k3 {

    /* renamed from: a, reason: collision with root package name */
    public final Hf f6337a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f6338b;

    /* renamed from: c, reason: collision with root package name */
    public final C0926zf f6339c;

    /* renamed from: d, reason: collision with root package name */
    public final C0875xg f6340d;

    public C0525k3(ECommerceCartItem eCommerceCartItem) {
        this(new Hf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C0926zf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C0875xg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f6337a + ", quantity=" + this.f6338b + ", revenue=" + this.f6339c + ", referrer=" + this.f6340d + '}';
    }

    public C0525k3(Hf hf, BigDecimal bigDecimal, C0926zf c0926zf, C0875xg c0875xg) {
        this.f6337a = hf;
        this.f6338b = bigDecimal;
        this.f6339c = c0926zf;
        this.f6340d = c0875xg;
    }
}
