package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class tjm0 implements ujm0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b;

    public tjm0(ArrayList arrayList) {
        int d = gw00.d(tcc.n(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ikm0 ikm0Var = (ikm0) it.next();
            Pair pair = new Pair(ikm0Var.b, ikm0Var.d);
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.b = linkedHashMap;
    }

    @Override // defpackage.ujm0
    public final pjm0 get(l1o l1oVar, mjm0 mjm0Var) {
        rjm0 rjm0Var = new rjm0(l1oVar, qoi0.a(mjm0Var.getClass()));
        LinkedHashMap linkedHashMap = this.a;
        pjm0 pjm0Var = (pjm0) linkedHashMap.get(rjm0Var);
        if (pjm0Var != null) {
            return pjm0Var;
        }
        ujm0 ujm0Var = (ujm0) this.b.get(qoi0.a(mjm0Var.getClass()));
        pjm0 pjm0Var2 = ujm0Var != null ? ujm0Var.get(l1oVar, mjm0Var) : null;
        linkedHashMap.put(new rjm0(l1oVar, qoi0.a(mjm0Var.getClass())), pjm0Var2);
        return pjm0Var2;
    }

    @Override // defpackage.ujm0
    public final pjm0 get(l1o l1oVar, mjm0 mjm0Var, rzl rzlVar) {
        return get(l1oVar, mjm0Var);
    }
}
