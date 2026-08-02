package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import defpackage.g92;
import defpackage.rol0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.x8n;
import defpackage.zcz0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class a {
    public final tpr a(long j, List list) {
        List list2;
        Object obj = null;
        if (list.isEmpty()) {
            return new g92(2, obj);
        }
        List list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((x8n) it.next()).a.iterator();
            long j2 = 0;
            while (it2.hasNext()) {
                j2 += ((zcz0) it2.next()).a;
            }
            arrayList.add(Long.valueOf(j2));
        }
        Long valueOf = Long.valueOf(j);
        int n = tcc.n(arrayList, 9);
        if (n == 0) {
            list2 = Collections.singletonList(valueOf);
        } else {
            ArrayList arrayList2 = new ArrayList(n + 1);
            arrayList2.add(valueOf);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                valueOf = Long.valueOf(valueOf.longValue() + ((Number) it3.next()).longValue());
                arrayList2.add(valueOf);
            }
            list2 = arrayList2;
        }
        return new rol0(new CurrentDynamicTimelineInteractor$currentTimelineFlow$1(list, this, list2, null));
    }
}
