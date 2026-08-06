package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    private final String f3904a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3905b;

    /* renamed from: c, reason: collision with root package name */
    private Map f3906c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f3904a = str;
        this.f3905b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f3905b;
    }

    public String getIdentifier() {
        return this.f3904a;
    }

    public Map<String, String> getPayload() {
        return this.f3906c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f3906c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f3904a + "', cartItems=" + this.f3905b + ", payload=" + this.f3906c + '}';
    }
}
