package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666pe {

    /* renamed from: a, reason: collision with root package name */
    public final String f6741a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6742b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6743c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6744d;

    public C0666pe(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0525k3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f6741a + "', identifier='" + this.f6742b + "', cartItems=" + this.f6743c + ", payload=" + this.f6744d + '}';
    }

    public C0666pe(String str, String str2, ArrayList arrayList, Map map) {
        this.f6741a = str;
        this.f6742b = str2;
        this.f6743c = arrayList;
        this.f6744d = map;
    }
}
