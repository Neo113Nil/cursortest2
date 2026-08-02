package io.appmetrica.analytics.ecommerce;

import defpackage.unr0;
import java.util.List;

/* loaded from: classes4.dex */
public class ECommercePrice {
    private final ECommerceAmount a;
    private List b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.b = list;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommercePrice{fiat=");
        sb.append(this.a);
        sb.append(", internalComponents=");
        return unr0.t(sb, this.b, '}');
    }
}
