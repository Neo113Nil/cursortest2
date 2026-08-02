package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class u00 implements do2 {
    @Override // defpackage.do2
    public final co2 a(pr20 pr20Var, String str, List list) {
        if (list.isEmpty()) {
            return new co2(str, EmptyList.a, false);
        }
        lq20 lq20Var = pr20Var != null ? pr20Var.a : null;
        List list2 = list;
        Set N0 = a.N0(list2);
        lq20 lq20Var2 = (lq20) a.P(list);
        List singletonList = jl40.l(lq20Var2, lq20Var) ? Collections.singletonList(lq20Var) : (lq20Var == null || !N0.contains(lq20Var)) ? Collections.singletonList(lq20Var2) : scc.g(lq20Var, lq20Var2);
        Set N02 = a.N0(singletonList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!N02.contains((lq20) obj)) {
                arrayList.add(obj);
            }
        }
        return new co2(str, scc.g(singletonList, arrayList), false);
    }
}
