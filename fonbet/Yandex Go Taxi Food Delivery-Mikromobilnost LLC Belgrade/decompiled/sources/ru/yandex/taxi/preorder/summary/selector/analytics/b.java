package ru.yandex.taxi.preorder.summary.selector.analytics;

import com.yandex.go.analytics.AntiSurgeAnalytics$TariffCardType;
import defpackage.mi31;
import defpackage.pj;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class b {
    public final pj a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public b(pj pjVar) {
        this.a = pjVar;
    }

    public final void a(List list) {
        AntiSurgeAnalytics$TariffCardType antiSurgeAnalytics$TariffCardType = AntiSurgeAnalytics$TariffCardType.ExplicitAntisurge;
        TariffOptionAnalytics$reportIfOptionShown$1 tariffOptionAnalytics$reportIfOptionShown$1 = TariffOptionAnalytics$reportIfOptionShown$1.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) tariffOptionAnalytics$reportIfOptionShown$1.get(((mi31) obj).a)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mi31) it.next()).a.b);
        }
        HashSet hashSet = new HashSet(arrayList2);
        ConcurrentHashMap concurrentHashMap = this.b;
        List list2 = (List) concurrentHashMap.get(antiSurgeAnalytics$TariffCardType);
        if (list2 != null) {
            hashSet.removeAll(list2);
        }
        if (!hashSet.isEmpty()) {
            pj pjVar = this.a;
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("type", antiSurgeAnalytics$TariffCardType.getEventValue());
            pjVar.a.a("AntiSurge.TariffCardShown", hashMap, 1, new HashMap());
        }
        concurrentHashMap.put(antiSurgeAnalytics$TariffCardType, arrayList2);
    }
}
