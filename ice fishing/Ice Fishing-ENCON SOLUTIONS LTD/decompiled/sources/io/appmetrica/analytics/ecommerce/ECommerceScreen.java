package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceScreen {

    /* renamed from: a, reason: collision with root package name */
    private String f3919a;

    /* renamed from: b, reason: collision with root package name */
    private List f3920b;

    /* renamed from: c, reason: collision with root package name */
    private String f3921c;

    /* renamed from: d, reason: collision with root package name */
    private Map f3922d;

    public List<String> getCategoriesPath() {
        return this.f3920b;
    }

    public String getName() {
        return this.f3919a;
    }

    public Map<String, String> getPayload() {
        return this.f3922d;
    }

    public String getSearchQuery() {
        return this.f3921c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f3920b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f3919a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f3922d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f3921c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f3919a + "', categoriesPath=" + this.f3920b + ", searchQuery='" + this.f3921c + "', payload=" + this.f3922d + '}';
    }
}
