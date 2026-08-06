package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC0572lo;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceCartItem {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f3900a;

    /* renamed from: b, reason: collision with root package name */
    private final BigDecimal f3901b;

    /* renamed from: c, reason: collision with root package name */
    private final ECommercePrice f3902c;

    /* renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f3903d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j2) {
        this(eCommerceProduct, eCommercePrice, AbstractC0572lo.a(j2));
    }

    public ECommerceProduct getProduct() {
        return this.f3900a;
    }

    public BigDecimal getQuantity() {
        return this.f3901b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f3903d;
    }

    public ECommercePrice getRevenue() {
        return this.f3902c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f3903d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f3900a + ", quantity=" + this.f3901b + ", revenue=" + this.f3902c + ", referrer=" + this.f3903d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d2) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC0572lo.a(d2)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f3900a = eCommerceProduct;
        this.f3901b = bigDecimal;
        this.f3902c = eCommercePrice;
    }
}
