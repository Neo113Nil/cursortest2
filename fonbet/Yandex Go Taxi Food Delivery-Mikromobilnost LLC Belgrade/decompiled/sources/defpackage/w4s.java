package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class w4s {
    public static at0 a(at0 at0Var, LinkedHashMap linkedHashMap) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (linkedHashMap.isEmpty()) {
            return at0Var;
        }
        lqe lqeVar = at0Var.a;
        List list = at0Var.c;
        lqe b = lqeVar != null ? b(lqeVar, linkedHashMap) : null;
        lqe lqeVar2 = at0Var.b;
        lqe b2 = lqeVar2 != null ? b(lqeVar2, linkedHashMap) : null;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                lqe lqeVar3 = ((j7l0) it.next()).h;
                arrayList.add(lqeVar3 != null ? b(lqeVar3, linkedHashMap) : null);
            }
        } else {
            arrayList = null;
        }
        lqe lqeVar4 = at0Var.d;
        lqe b3 = lqeVar4 != null ? b(lqeVar4, linkedHashMap) : null;
        if (list != null) {
            List list3 = list;
            ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
            Iterator it2 = list3.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                j7l0 j7l0Var = (j7l0) next;
                arrayList3.add(new j7l0(j7l0Var.a, j7l0Var.b, j7l0Var.c, j7l0Var.d, j7l0Var.e, j7l0Var.f, j7l0Var.g, arrayList != null ? (lqe) a.S(i, arrayList) : null, j7l0Var.i, j7l0Var.j, j7l0Var.k, j7l0Var.l));
                it2 = it2;
                i = i2;
            }
            arrayList2 = arrayList3;
        } else {
            arrayList2 = null;
        }
        return new at0(b, b2, arrayList2, b3, at0Var.e, at0Var.f, at0Var.g, at0Var.h, at0Var.i, at0Var.j, at0Var.k, at0Var.l);
    }

    public static lqe b(lqe lqeVar, LinkedHashMap linkedHashMap) {
        if (linkedHashMap.isEmpty()) {
            return lqeVar;
        }
        List<pre> list = lqeVar.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (pre preVar : list) {
            pre preVar2 = (pre) linkedHashMap.get(preVar.getId());
            if (preVar2 != null) {
                preVar = preVar2;
            }
            arrayList.add(preVar);
        }
        return new lqe(arrayList, lqeVar.b, lqeVar.c);
    }

    public static t3s c(t3s t3sVar, LinkedHashMap linkedHashMap) {
        if (linkedHashMap.isEmpty()) {
            return t3sVar;
        }
        if (t3sVar == null) {
            w511.b();
            return null;
        }
        List list = t3sVar.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((lqe) it.next(), linkedHashMap));
        }
        List list2 = t3sVar.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((lqe) it2.next(), linkedHashMap));
        }
        List list3 = t3sVar.c;
        ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(b((lqe) it3.next(), linkedHashMap));
        }
        return new t3s(a.J0(arrayList), a.J0(arrayList2), a.J0(arrayList3), a.J0(t3sVar.d), a.J0(t3sVar.e), t3sVar.f, t3sVar.g, t3sVar.h);
    }
}
