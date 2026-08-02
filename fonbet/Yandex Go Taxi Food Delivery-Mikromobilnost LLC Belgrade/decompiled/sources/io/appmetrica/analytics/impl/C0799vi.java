package io.appmetrica.analytics.impl;

import defpackage.unr0;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.vi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0799vi {
    public final String a;
    public final String b;
    public final List c;
    public final Map d;
    public final C0539mi e;
    public final C0539mi f;
    public final List g;

    public C0799vi(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C0539mi(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new C0539mi(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductWrapper{sku='");
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

    public C0799vi(String str, String str2, List list, Map map, C0539mi c0539mi, C0539mi c0539mi2, List list2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = map;
        this.e = c0539mi;
        this.f = c0539mi2;
        this.g = list2;
    }
}
