package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f5458a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5459b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.f5458a);
        sb.append(", unit='");
        return C1.a.k(sb, this.f5459b, "'}");
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f5458a = bigDecimal;
        this.f5459b = str;
    }
}
