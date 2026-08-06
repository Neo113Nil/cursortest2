package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceProduct {

    /* renamed from: a, reason: collision with root package name */
    private final String f3909a;

    /* renamed from: b, reason: collision with root package name */
    private String f3910b;

    /* renamed from: c, reason: collision with root package name */
    private List f3911c;

    /* renamed from: d, reason: collision with root package name */
    private Map f3912d;

    /* renamed from: e, reason: collision with root package name */
    private ECommercePrice f3913e;

    /* renamed from: f, reason: collision with root package name */
    private ECommercePrice f3914f;

    /* renamed from: g, reason: collision with root package name */
    private List f3915g;

    public ECommerceProduct(String str) {
        this.f3909a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f3913e;
    }

    public List<String> getCategoriesPath() {
        return this.f3911c;
    }

    public String getName() {
        return this.f3910b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f3914f;
    }

    public Map<String, String> getPayload() {
        return this.f3912d;
    }

    public List<String> getPromocodes() {
        return this.f3915g;
    }

    public String getSku() {
        return this.f3909a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f3913e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f3911c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f3910b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f3914f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f3912d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f3915g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f3909a + "', name='" + this.f3910b + "', categoriesPath=" + this.f3911c + ", payload=" + this.f3912d + ", actualPrice=" + this.f3913e + ", originalPrice=" + this.f3914f + ", promocodes=" + this.f3915g + '}';
    }
}
