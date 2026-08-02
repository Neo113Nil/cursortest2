package io.appmetrica.analytics.locationinternal.impl;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class G0 implements Comparator {
    public final InterfaceC0961k0 a;
    public final Comparator b;

    public G0(InterfaceC0961k0 interfaceC0961k0, Comparator comparator) {
        this.a = interfaceC0961k0;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        if ((list2 == null) ^ (list == null)) {
            return 10;
        }
        if (list != list2) {
            if (list.size() != list2.size()) {
                return 10;
            }
            HashMap hashMap = new HashMap();
            for (Object obj3 : list) {
                hashMap.put(this.a.a(obj3), obj3);
            }
            for (Object obj4 : list2) {
                Object obj5 = hashMap.get(this.a.a(obj4));
                if (obj5 == null || this.b.compare(obj5, obj4) != 0) {
                    return 10;
                }
            }
        }
        return 0;
    }
}
