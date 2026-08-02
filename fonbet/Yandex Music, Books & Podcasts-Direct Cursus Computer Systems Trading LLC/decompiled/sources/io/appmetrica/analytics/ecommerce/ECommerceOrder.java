package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import defpackage.k5r;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class ECommerceOrder {
    private final String a;
    private final List b;
    private Map c;

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.a = str;
        this.b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.b;
    }

    @NonNull
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
        return k5r.p(sb, this.c, '}');
    }
}
