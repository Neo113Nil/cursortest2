package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class rck0 {
    public static mkz0 a(List list, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof vck0) {
                    arrayList.add(obj);
                }
            }
            vck0 vck0Var = (vck0) a.R(arrayList);
            if (vck0Var != null) {
                return new kkz0(vck0Var.a, vck0Var.b, 3);
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof uck0) {
                    arrayList2.add(obj2);
                }
            }
            uck0 uck0Var = (uck0) a.R(arrayList2);
            if (uck0Var != null) {
                return new kkz0(uck0Var.a, uck0Var.b, 0);
            }
        }
        return lkz0.a;
    }
}
