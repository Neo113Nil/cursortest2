package io.appmetrica.analytics.impl;

import defpackage.unr0;
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0539mi {
    public final C0319f0 a;
    public final List b;

    public C0539mi(ECommercePrice eCommercePrice) {
        this(new C0319f0(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new C0319f0(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceWrapper{fiat=");
        sb.append(this.a);
        sb.append(", internalComponents=");
        return unr0.t(sb, this.b, '}');
    }

    public C0539mi(C0319f0 c0319f0, LinkedList linkedList) {
        this.a = c0319f0;
        this.b = linkedList;
    }
}
