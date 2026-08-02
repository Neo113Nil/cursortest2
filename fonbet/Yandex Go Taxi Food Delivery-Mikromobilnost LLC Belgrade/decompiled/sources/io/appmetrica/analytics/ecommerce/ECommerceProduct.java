package io.appmetrica.analytics.ecommerce;

import defpackage.unr0;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ECommerceProduct {
    private final String a;
    private String b;
    private List c;
    private Map d;
    private ECommercePrice e;
    private ECommercePrice f;
    private List g;

    public ECommerceProduct(String str) {
        this.a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.e;
    }

    public List<String> getCategoriesPath() {
        return this.c;
    }

    public String getName() {
        return this.b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f;
    }

    public Map<String, String> getPayload() {
        return this.d;
    }

    public List<String> getPromocodes() {
        return this.g;
    }

    public String getSku() {
        return this.a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.g = list;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceProduct{sku='");
        sb.append(this.a);
        sb.append("', name='");
        sb.append(this.b);
        sb.append("', categoriesPath=");
        sb.append(this.c);
        sb.append(", payload=");
        sb.append(this.d);
        sb.append(", actualPrice=");
        sb.append(this.e);
        sb.append(", originalPrice=");
        sb.append(this.f);
        sb.append(", promocodes=");
        return unr0.t(sb, this.g, '}');
    }
}
