package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926zf {

    /* renamed from: a, reason: collision with root package name */
    public final Z f7276a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7277b;

    public C0926zf(ECommercePrice eCommercePrice) {
        this(new Z(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new Z(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        return "PriceWrapper{fiat=" + this.f7276a + ", internalComponents=" + this.f7277b + '}';
    }

    public C0926zf(Z z2, LinkedList linkedList) {
        this.f7276a = z2;
        this.f7277b = linkedList;
    }
}
