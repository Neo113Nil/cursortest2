package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Hf {

    /* renamed from: a, reason: collision with root package name */
    public final String f4469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4470b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4471c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f4472d;

    /* renamed from: e, reason: collision with root package name */
    public final C0926zf f4473e;

    /* renamed from: f, reason: collision with root package name */
    public final C0926zf f4474f;

    /* renamed from: g, reason: collision with root package name */
    public final List f4475g;

    public Hf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C0926zf(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new C0926zf(eCommerceProduct.getOriginalPrice()), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f4469a + "', name='" + this.f4470b + "', categoriesPath=" + this.f4471c + ", payload=" + this.f4472d + ", actualPrice=" + this.f4473e + ", originalPrice=" + this.f4474f + ", promocodes=" + this.f4475g + '}';
    }

    public Hf(String str, String str2, List list, Map map, C0926zf c0926zf, C0926zf c0926zf2, List list2) {
        this.f4469a = str;
        this.f4470b = str2;
        this.f4471c = list;
        this.f4472d = map;
        this.f4473e = c0926zf;
        this.f4474f = c0926zf2;
        this.f4475g = list2;
    }
}
