package io.appmetrica.analytics.ecommerce;

import java.util.List;

/* loaded from: classes.dex */
public class ECommercePrice {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f3907a;

    /* renamed from: b, reason: collision with root package name */
    private List f3908b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f3907a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f3907a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f3908b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f3908b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f3907a + ", internalComponents=" + this.f3908b + '}';
    }
}
