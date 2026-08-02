package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0319f0 {
    public final BigDecimal a;
    public final String b;

    public C0319f0(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.a);
        sb.append(", unit='");
        return AbstractC0748tp.a(sb, this.b, "'}");
    }

    public C0319f0(BigDecimal bigDecimal, String str) {
        this.a = bigDecimal;
        this.b = str;
    }
}
