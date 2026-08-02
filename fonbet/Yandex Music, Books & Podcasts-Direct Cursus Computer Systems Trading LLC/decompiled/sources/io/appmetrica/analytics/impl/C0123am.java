package io.appmetrica.analytics.impl;

import defpackage.k5r;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0123am {
    public final String a;
    public final List b;
    public final String c;
    public final Map d;

    public C0123am(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenWrapper{name='");
        sb.append(this.a);
        sb.append("', categoriesPath=");
        sb.append(this.b);
        sb.append(", searchQuery='");
        sb.append(this.c);
        sb.append("', payload=");
        return k5r.p(sb, this.d, '}');
    }

    public C0123am(String str, String str2, List list, Map map) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = map;
    }
}
