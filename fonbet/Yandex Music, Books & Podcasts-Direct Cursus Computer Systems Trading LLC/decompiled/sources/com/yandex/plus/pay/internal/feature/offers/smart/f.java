package com.yandex.plus.pay.internal.feature.offers.smart;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import com.yandex.plus.pay.internal.di.o;
import com.yandex.plus.pay.internal.model.SmartOffersBatch;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.onb;
import defpackage.pnb;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import defpackage.wvs;
import defpackage.xq0;
import defpackage.z75;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class f implements a {
    public final g a;
    public final List b;
    public final com.yandex.plus.pay.internal.analytics.tarifficator.d c;

    public f(g gVar, List list, com.yandex.plus.pay.internal.analytics.tarifficator.d dVar) {
        gVar.getClass();
        list.getClass();
        dVar.getClass();
        this.a = gVar;
        this.b = list;
        this.c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a8 -> B:10:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, List list, PlusPaySmartOffer.TargetAndFeatures targetAndFeatures, cg6 cg6Var) {
        b bVar;
        int i;
        PlusPayCompositeOffers plusPayCompositeOffers;
        int i2;
        Iterator it;
        List<PlusPaySmartOffer> list2;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i3 = bVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.o = i3 - Integer.MIN_VALUE;
                Object obj = bVar.m;
                nm6 nm6Var = nm6.a;
                i = bVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    String batchId = ((PlusPaySmartOffer) CollectionsKt.Q(list)).getMeta().getBatchId();
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((PlusPaySmartOffer) it2.next()).getCompositeOffer());
                    }
                    plusPayCompositeOffers = new PlusPayCompositeOffers(str, batchId, arrayList, targetAndFeatures.getTarget());
                    i2 = 0;
                    it = this.b.iterator();
                    list2 = list;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = bVar.l;
                    it = bVar.k;
                    List list4 = bVar.j;
                    qgg.h0(obj);
                    List list5 = list4;
                    plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                    list2 = list5;
                    if (it.hasNext()) {
                        com.yandex.plus.pay.internal.feature.offers.post.a aVar = (com.yandex.plus.pay.internal.feature.offers.post.a) it.next();
                        bVar.j = list2;
                        bVar.k = it;
                        bVar.l = i2;
                        bVar.o = 1;
                        Object a = aVar.a(plusPayCompositeOffers, bVar);
                        if (a == nm6Var) {
                            return nm6Var;
                        }
                        list4 = list2;
                        obj = a;
                        List list52 = list4;
                        plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                        list2 = list52;
                        if (it.hasNext()) {
                            List<PlusPayCompositeOffers.Offer> offers = plusPayCompositeOffers.getOffers();
                            int a2 = tah.a(v75.o(offers, 10));
                            if (a2 < 16) {
                                a2 = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
                            for (Object obj2 : offers) {
                                linkedHashMap.put(com.yandex.plus.pay.internal.utils.b.b((PlusPayCompositeOffers.Offer) obj2), obj2);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (PlusPaySmartOffer plusPaySmartOffer : list2) {
                                String b = com.yandex.plus.pay.internal.utils.b.b(plusPaySmartOffer.getCompositeOffer());
                                PlusPaySmartOffer copy$default = linkedHashMap.containsKey(b) ? PlusPaySmartOffer.copy$default(plusPaySmartOffer, 0, null, null, null, null, false, null, null, null, null, (PlusPayCompositeOffers.Offer) uah.c(b, linkedHashMap), 1023, null) : null;
                                if (copy$default != null) {
                                    arrayList2.add(copy$default);
                                }
                            }
                            return arrayList2;
                        }
                    }
                }
            }
        }
        bVar = new b(this, cg6Var);
        Object obj3 = bVar.m;
        nm6 nm6Var2 = nm6.a;
        i = bVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, Set set, Map map, com.yandex.plus.pay.api.analytics.c cVar, boolean z, Function1 function1, cg6 cg6Var) {
        c cVar2;
        Object obj;
        nm6 nm6Var;
        int i;
        Set set2;
        Function1 function12;
        Object obj2;
        boolean z2;
        Set set3;
        Iterator it;
        com.yandex.plus.pay.api.analytics.c cVar3 = cVar;
        if (cg6Var instanceof c) {
            cVar2 = (c) cg6Var;
            int i2 = cVar2.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.p = i2 - Integer.MIN_VALUE;
                c cVar4 = cVar2;
                obj = cVar4.n;
                nm6Var = nm6.a;
                i = cVar4.p;
                if (i != 0) {
                    qgg.h0(obj);
                    q5b q5bVar = q5b.a;
                    Set set4 = cVar3.c;
                    Set set5 = cVar3.e;
                    String str2 = cVar3.a;
                    cVar4.j = set;
                    cVar4.k = cVar3;
                    cVar4.l = function1;
                    cVar4.m = z;
                    cVar4.p = 1;
                    Object c = ((l) this.a).c(str, set, q5bVar, set4, set5, map, str2, z, cVar4);
                    if (c != nm6Var) {
                        set2 = set;
                        function12 = function1;
                        obj2 = c;
                        z2 = z;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function1 function13 = cVar4.l;
                    set3 = cVar4.j;
                    qgg.h0(obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (((PlusPaySmartOffer) obj3).getPlace() != null) {
                            arrayList.add(obj3);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        String place = ((PlusPaySmartOffer) next).getPlace();
                        place.getClass();
                        Object obj4 = linkedHashMap.get(place);
                        if (obj4 == null) {
                            obj4 = new ArrayList();
                            linkedHashMap.put(place, obj4);
                        }
                        ((List) obj4).add(next);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        Object key = entry.getKey();
                        Iterator it2 = ((List) entry.getValue()).iterator();
                        if (!it2.hasNext()) {
                            wvs.n();
                            return null;
                        }
                        Object next2 = it2.next();
                        if (it2.hasNext()) {
                            int priority = ((PlusPaySmartOffer) next2).getPriority();
                            do {
                                Object next3 = it2.next();
                                int priority2 = ((PlusPaySmartOffer) next3).getPriority();
                                if (priority > priority2) {
                                    next2 = next3;
                                    priority = priority2;
                                }
                            } while (it2.hasNext());
                        }
                        linkedHashMap2.put(key, (PlusPaySmartOffer) next2);
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                    for (Object obj5 : set3) {
                        if (!linkedHashMap3.containsKey(obj5)) {
                            linkedHashMap3.put(obj5, null);
                        }
                    }
                    return linkedHashMap3;
                }
                boolean z3 = cVar4.m;
                function12 = cVar4.l;
                com.yandex.plus.pay.api.analytics.c cVar5 = cVar4.k;
                set2 = cVar4.j;
                qgg.h0(obj);
                z2 = z3;
                cVar3 = cVar5;
                obj2 = obj;
                q5b q5bVar2 = q5b.a;
                cVar4.j = set2;
                cVar4.k = null;
                cVar4.l = null;
                cVar4.m = z2;
                cVar4.p = 2;
                obj = d((SmartOffersBatch) obj2, q5bVar2, cVar3, function12, cVar4);
                if (obj != nm6Var) {
                    set3 = set2;
                    ArrayList arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                    }
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap(tah.a(linkedHashMap4.size()));
                    while (r2.hasNext()) {
                    }
                    LinkedHashMap linkedHashMap32 = new LinkedHashMap(linkedHashMap22);
                    while (r0.hasNext()) {
                    }
                    return linkedHashMap32;
                }
                return nm6Var;
            }
        }
        cVar2 = new c(this, cg6Var);
        c cVar42 = cVar2;
        obj = cVar42.n;
        nm6Var = nm6.a;
        i = cVar42.p;
        if (i != 0) {
        }
        q5b q5bVar22 = q5b.a;
        cVar42.j = set2;
        cVar42.k = null;
        cVar42.l = null;
        cVar42.m = z2;
        cVar42.p = 2;
        obj = d((SmartOffersBatch) obj2, q5bVar22, cVar3, function12, cVar42);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        if (r2 != r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Set set, Map map, com.yandex.plus.pay.api.analytics.c cVar, boolean z, Function1 function1, cg6 cg6Var) {
        d dVar;
        int i;
        Function1 function12;
        Object obj;
        boolean z2;
        com.yandex.plus.pay.api.analytics.c cVar2 = cVar;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.o = i2 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj2 = dVar2.m;
                Object obj3 = nm6.a;
                i = dVar2.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    q5b q5bVar = q5b.a;
                    Set set2 = cVar2.c;
                    Set set3 = cVar2.e;
                    String str2 = cVar2.a;
                    dVar2.j = cVar2;
                    dVar2.k = function1;
                    dVar2.l = z;
                    dVar2.o = 1;
                    Object c = ((l) this.a).c(str, set, q5bVar, set2, set3, map, str2, z, dVar2);
                    if (c != obj3) {
                        function12 = function1;
                        obj = c;
                        z2 = z;
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function1 function13 = dVar2.k;
                    qgg.h0(obj2);
                    return (List) obj2;
                }
                boolean z3 = dVar2.l;
                function12 = dVar2.k;
                com.yandex.plus.pay.api.analytics.c cVar3 = dVar2.j;
                qgg.h0(obj2);
                z2 = z3;
                cVar2 = cVar3;
                obj = obj2;
                q5b q5bVar2 = q5b.a;
                dVar2.j = null;
                dVar2.k = null;
                dVar2.l = z2;
                dVar2.o = 2;
                obj2 = d((SmartOffersBatch) obj, q5bVar2, cVar2, function12, dVar2);
            }
        }
        dVar = new d(this, cg6Var);
        d dVar22 = dVar;
        Object obj22 = dVar22.m;
        Object obj32 = nm6.a;
        i = dVar22.o;
        if (i != 0) {
        }
        q5b q5bVar22 = q5b.a;
        dVar22.j = null;
        dVar22.k = null;
        dVar22.l = z2;
        dVar22.o = 2;
        obj22 = d((SmartOffersBatch) obj, q5bVar22, cVar2, function12, dVar22);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0196 -> B:10:0x0199). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(SmartOffersBatch smartOffersBatch, q5b q5bVar, com.yandex.plus.pay.api.analytics.c cVar, Function1 function1, cg6 cg6Var) {
        e eVar;
        int i;
        String str;
        String str2;
        String str3;
        Map map;
        com.yandex.plus.pay.internal.analytics.tarifficator.e eVar2;
        String str4;
        String str5;
        String str6;
        String str7;
        Map map2;
        String str8;
        Iterator it;
        List list;
        Function1 function12;
        Function1 function13;
        PlusPaySmartOffer.TargetAndFeatures targetAndFeatures;
        f fVar = this;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.r = i2 - Integer.MIN_VALUE;
                Object obj = eVar.p;
                nm6 nm6Var = nm6.a;
                i = eVar.r;
                com.yandex.plus.pay.internal.analytics.tarifficator.d dVar = fVar.c;
                if (i == 0) {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PlusPaySmartOffer.TargetAndFeatures targetAndFeatures2 = eVar.o;
                    it = eVar.n;
                    map2 = eVar.m;
                    list = eVar.l;
                    str8 = eVar.k;
                    Function1 function14 = eVar.j;
                    qgg.h0(obj);
                    PlusPaySmartOffer.TargetAndFeatures targetAndFeatures3 = targetAndFeatures2;
                    function12 = function14;
                    Object a = obj;
                    List list2 = (List) a;
                    if (list2.isEmpty()) {
                        List list3 = (List) function12.invoke(list2);
                        if (list3.isEmpty()) {
                            String target = targetAndFeatures3.getTarget();
                            com.yandex.plus.pay.internal.analytics.tarifficator.e eVar3 = (com.yandex.plus.pay.internal.analytics.tarifficator.e) dVar;
                            eVar3.getClass();
                            str8.getClass();
                            function13 = function12;
                            targetAndFeatures = targetAndFeatures3;
                            eVar3.a.c(str8, onb.Default, target == null ? "no_value" : target, "Client filtered and got empty list of offers");
                            eVar3.a(target, str8, c5b.a);
                        } else {
                            function13 = function12;
                            targetAndFeatures = targetAndFeatures3;
                        }
                        ((com.yandex.plus.pay.internal.analytics.tarifficator.e) dVar).a(targetAndFeatures.getTarget(), str8, list3);
                        list.addAll(list3);
                    } else {
                        String target2 = targetAndFeatures3.getTarget();
                        com.yandex.plus.pay.internal.analytics.tarifficator.e eVar4 = (com.yandex.plus.pay.internal.analytics.tarifficator.e) dVar;
                        eVar4.getClass();
                        str8.getClass();
                        eVar4.a.c(str8, onb.Default, target2 == null ? "no_value" : target2, "In-app store returned empty list of offers");
                        eVar4.a(target2, str8, c5b.a);
                        function13 = function12;
                    }
                    fVar = this;
                    function12 = function13;
                    while (it.hasNext()) {
                        targetAndFeatures3 = (PlusPaySmartOffer.TargetAndFeatures) it.next();
                        List list4 = (List) map2.get(targetAndFeatures3);
                        if (list4 == null) {
                            String target3 = targetAndFeatures3.getTarget();
                            com.yandex.plus.pay.internal.analytics.tarifficator.e eVar5 = (com.yandex.plus.pay.internal.analytics.tarifficator.e) dVar;
                            eVar5.getClass();
                            str8.getClass();
                            eVar5.a.c(str8, onb.Default, target3 == null ? "no_value" : target3, "Backend returned empty list of offers");
                            eVar5.a(target3, str8, c5b.a);
                        } else {
                            eVar.getClass();
                            eVar.j = function12;
                            eVar.k = str8;
                            eVar.l = list;
                            eVar.m = map2;
                            eVar.n = it;
                            eVar.o = targetAndFeatures3;
                            eVar.r = 1;
                            a = fVar.a(str8, list4, targetAndFeatures3, eVar);
                            if (a == nm6Var) {
                                return nm6Var;
                            }
                            List list22 = (List) a;
                            if (list22.isEmpty()) {
                            }
                            fVar = this;
                            function12 = function13;
                            while (it.hasNext()) {
                            }
                        }
                    }
                    return list;
                }
                qgg.h0(obj);
                String sessionId = smartOffersBatch.getSessionId();
                String str9 = cVar.b;
                Set set = cVar.c;
                String H = set != null ? r1.H(set) : null;
                Set set2 = cVar.d;
                String H2 = set2 != null ? r1.H(set2) : null;
                Map map3 = cVar.f;
                com.yandex.plus.pay.internal.analytics.tarifficator.e eVar6 = (com.yandex.plus.pay.internal.analytics.tarifficator.e) dVar;
                o oVar = eVar6.b;
                sessionId.getClass();
                map3.getClass();
                pnb pnbVar = eVar6.a;
                String str10 = H2;
                String str11 = eVar6.c;
                String str12 = eVar6.d;
                if (str12 == null) {
                    str12 = "no_value";
                }
                if (str9 == null) {
                    str9 = "no_value";
                }
                com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) oVar.invoke();
                if (aVar == null || (str = aVar.a) == null) {
                    str = "no_value";
                }
                com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) oVar.invoke();
                if (aVar2 == null || (str2 = aVar2.b) == null) {
                    str2 = "no_value";
                }
                String str13 = H == null ? "no_value" : H;
                if (str10 == null) {
                    str3 = "no_value";
                    map = map3;
                    eVar2 = eVar6;
                    str6 = str2;
                    str4 = str12;
                    str7 = str9;
                    str5 = str;
                } else {
                    str3 = str10;
                    map = map3;
                    eVar2 = eVar6;
                    str4 = str12;
                    str5 = str;
                    str6 = str2;
                    str7 = str9;
                }
                pnbVar.b(sessionId, str11, str4, str7, str5, str6, str13, str3, map);
                if (smartOffersBatch.getOffers().isEmpty()) {
                    q5bVar.getClass();
                    eVar2.getClass();
                    eVar2.a.c(sessionId, onb.Default, "no_value", "Backend returned empty list of offers");
                    c5b c5bVar = c5b.a;
                    eVar2.a(null, sessionId, c5bVar);
                    return c5bVar;
                }
                List<PlusPaySmartOffer> offers = smartOffersBatch.getOffers();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : offers) {
                    PlusPaySmartOffer.TargetAndFeatures targetAndFeatures4 = ((PlusPaySmartOffer) obj2).getTargetAndFeatures();
                    Object obj3 = linkedHashMap.get(targetAndFeatures4);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(targetAndFeatures4, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                Set keySet = linkedHashMap.keySet();
                q5bVar.getClass();
                keySet.getClass();
                LinkedHashSet z0 = CollectionsKt.z0(q5bVar);
                z75.t(z0, keySet);
                map2 = linkedHashMap;
                str8 = sessionId;
                it = z0.iterator();
                list = arrayList;
                function12 = function1;
                while (it.hasNext()) {
                }
                return list;
            }
        }
        eVar = new e(fVar, cg6Var);
        Object obj4 = eVar.p;
        nm6 nm6Var2 = nm6.a;
        i = eVar.r;
        com.yandex.plus.pay.internal.analytics.tarifficator.d dVar2 = fVar.c;
        if (i == 0) {
        }
    }
}
