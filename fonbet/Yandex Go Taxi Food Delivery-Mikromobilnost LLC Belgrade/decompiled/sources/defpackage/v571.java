package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes7.dex */
public final class v571 {
    public static Set a(List list) {
        Object obj;
        Object obj2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj3;
        Set M0 = a.M0(qj71.a(list));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((uy71) obj).a.equals("feedback")) {
                break;
            }
        }
        uy71 uy71Var = (uy71) obj;
        boolean z = (uy71Var != null ? uy71Var.c : null) instanceof gt81;
        Iterable iterable = EmptyList.a;
        if (z) {
            List h = scc.h(((gt81) uy71Var.c).a);
            fj71 fj71Var = uy71Var.d;
            if (fj71Var == null || (arrayList2 = fj71Var.a) == null) {
                obj2 = null;
            } else {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (jl40.l(((xh71) obj3).a(), "divkit_adtune")) {
                        break;
                    }
                }
                obj2 = (xh71) obj3;
            }
            dc81 dc81Var = obj2 instanceof dc81 ? (dc81) obj2 : null;
            if (dc81Var != null && (arrayList = dc81Var.b.d) != null) {
                iterable = arrayList;
            }
            iterable = a.m0(iterable, h);
        }
        M0.addAll(iterable);
        return M0;
    }
}
