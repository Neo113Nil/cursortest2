package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.ui.bouncer.model.l2;
import com.yandex.passport.internal.ui.bouncer.model.n2;
import defpackage.rhw;
import defpackage.v75;
import defpackage.wah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends androidx.core.app.n0 {
    public static final com.yandex.passport.internal.core.accounts.r c = new com.yandex.passport.internal.core.accounts.r(2);
    public final com.yandex.passport.internal.flags.i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.flags.i iVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        iVar.getClass();
        this.b = iVar;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        com.yandex.passport.internal.core.accounts.r rVar;
        String str;
        a aVar = (a) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        boolean booleanValue = ((Boolean) this.b.b(com.yandex.passport.internal.flags.o.q0)).booleanValue();
        Iterator it = aVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            n2 n2Var = (n2) it.next();
            com.yandex.passport.common.core.f a = n2Var.a();
            if (a == null || !booleanValue) {
                l2 l2Var = n2Var instanceof l2 ? (l2) n2Var : null;
                if (l2Var != null) {
                    arrayList.add(l2Var);
                }
            } else {
                Long l = new Long(a.b);
                Object obj2 = linkedHashMap.get(l);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    linkedHashMap.put(l, obj2);
                }
                ((Set) obj2).add(n2Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((l2) it2.next()).a.j);
        }
        Map map = aVar.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (arrayList4.contains((String) entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        List r = wah.r(linkedHashMap2);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            l2 l2Var2 = (l2) it3.next();
            com.yandex.passport.internal.l lVar = l2Var2.a;
            if (lVar.e.x) {
                com.yandex.passport.common.core.f fVar = lVar.b;
                Iterator it4 = r.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        str = null;
                        break;
                    }
                    Pair pair = (Pair) it4.next();
                    str = (String) pair.a;
                    if (((List) pair.b).contains(fVar)) {
                        break;
                    }
                }
                if (str == null) {
                    arrayList3.add(l2Var2);
                } else {
                    arrayList2.add(new Pair(str, l2Var2));
                }
            } else {
                arrayList3.add(l2Var2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it5.hasNext();
            rVar = c;
            if (!hasNext) {
                break;
            }
            arrayList5.addAll(CollectionsKt.o0((Iterable) ((Map.Entry) it5.next()).getValue(), rVar));
        }
        for (l2 l2Var3 : CollectionsKt.o0(arrayList3, rVar)) {
            arrayList5.add(l2Var3);
            ArrayList arrayList6 = new ArrayList();
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                Object next = it6.next();
                if (Intrinsics.d(((Pair) next).a, l2Var3.a.j)) {
                    arrayList6.add(next);
                }
            }
            ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, 10));
            Iterator it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                arrayList7.add((l2) ((Pair) it7.next()).b);
            }
            arrayList5.addAll(CollectionsKt.o0(arrayList7, rVar));
        }
        return arrayList5;
    }
}
