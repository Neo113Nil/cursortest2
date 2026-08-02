package io.appmetrica.analytics.ecommerce;

import defpackage.smw0;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ECommerceOrder {
    private final String a;
    private final List b;
    private Map c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.a = str;
        this.b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.b;
    }

    public String getIdentifier() {
        return this.a;
    }

    public Map<String, String> getPayload() {
        return this.c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.c = map;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceOrder{identifier='");
        sb.append(this.a);
        sb.append("', cartItems=");
        sb.append(this.b);
        sb.append(", payload=");
        return smw0.n(sb, this.c, '}');
    }
}
