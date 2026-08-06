package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335cj {

    /* renamed from: a, reason: collision with root package name */
    public final String f5754a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5755b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5756c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f5757d;

    public C0335cj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f5754a + "', categoriesPath=" + this.f5755b + ", searchQuery='" + this.f5756c + "', payload=" + this.f5757d + '}';
    }

    public C0335cj(String str, String str2, List list, Map map) {
        this.f5754a = str;
        this.f5755b = list;
        this.f5756c = str2;
        this.f5757d = map;
    }
}
