package io.appmetrica.analytics.impl;

import i1.AbstractC0252i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603n3 implements InterfaceC0314bo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0314bo, t1.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0706r3> invoke(List<C0706r3> list, C0706r3 c0706r3) {
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                S7 s7 = ((C0706r3) it.next()).f6807b;
                S7 s72 = c0706r3.f6807b;
                if (s7 == s72) {
                    if (s72 != S7.f5045c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C0706r3) obj).f6807b != S7.f5045c) {
                            arrayList.add(obj);
                        }
                    }
                    return AbstractC0252i.M(arrayList, c0706r3);
                }
            }
        }
        return AbstractC0252i.M(list, c0706r3);
    }
}
