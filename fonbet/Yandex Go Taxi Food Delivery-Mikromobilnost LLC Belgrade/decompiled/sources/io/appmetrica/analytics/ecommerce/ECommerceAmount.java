package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC0748tp;
import io.appmetrica.analytics.impl.Or;
import java.math.BigDecimal;

/* loaded from: classes4.dex */
public class ECommerceAmount {
    private final BigDecimal a;
    private final String b;

    public ECommerceAmount(double d, String str) {
        this(new BigDecimal(Or.a(d)), str);
    }

    public BigDecimal getAmount() {
        return this.a;
    }

    public String getUnit() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.a);
        sb.append(", unit='");
        return AbstractC0748tp.a(sb, this.b, "'}");
    }

    public ECommerceAmount(long j, String str) {
        this(Or.a(j), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.a = bigDecimal;
        this.b = str;
    }
}
