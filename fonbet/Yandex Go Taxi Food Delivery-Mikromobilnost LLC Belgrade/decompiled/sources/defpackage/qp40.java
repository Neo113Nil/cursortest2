package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class qp40 {
    public static List a(List list, Set set) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (jl40.l(((pex0) next).b, str)) {
                    obj = next;
                    break;
                }
            }
            pex0 pex0Var = (pex0) obj;
            if (pex0Var != null) {
                arrayList.add(pex0Var);
            }
        }
        if (!arrayList.isEmpty()) {
            list = arrayList;
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((pex0) it3.next()).e);
        }
        Iterator it4 = arrayList2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next2 = it4.next();
            if (!((List) next2).isEmpty()) {
                obj = next2;
                break;
            }
        }
        List list3 = (List) obj;
        return list3 == null ? EmptyList.a : list3;
    }
}
