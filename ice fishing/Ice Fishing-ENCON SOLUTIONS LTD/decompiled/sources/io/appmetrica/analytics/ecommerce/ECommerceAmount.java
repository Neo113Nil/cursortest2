package io.appmetrica.analytics.ecommerce;

import C1.a;
import io.appmetrica.analytics.impl.AbstractC0572lo;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f3898a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3899b;

    public ECommerceAmount(long j2, String str) {
        this(AbstractC0572lo.a(j2), str);
    }

    public BigDecimal getAmount() {
        return this.f3898a;
    }

    public String getUnit() {
        return this.f3899b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.f3898a);
        sb.append(", unit='");
        return a.k(sb, this.f3899b, "'}");
    }

    public ECommerceAmount(double d2, String str) {
        this(new BigDecimal(AbstractC0572lo.a(d2)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f3898a = bigDecimal;
        this.f3899b = str;
    }
}
