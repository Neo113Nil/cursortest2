package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class r4o0 implements z910 {
    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        Object obj;
        aa10 w;
        List<x910> list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(pj91.g((x910) obj), "anchor")) {
                break;
            }
        }
        x910 x910Var = (x910) obj;
        if (x910Var == null) {
            x910Var = (x910) a.R(list);
        }
        if (x910Var == null) {
            w = kVar.w(0, 0, b.f(), new p0u(5));
            return w;
        }
        o l0 = x910Var.l0(j);
        int i = l0.b;
        int i2 = l0.a;
        int f0 = i - kVar.f0(50.0f);
        int i3 = f0 >= 0 ? f0 : 0;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (x910 x910Var2 : list2) {
            arrayList.add(x910Var2 == x910Var ? l0 : x910Var2.l0(j));
        }
        return kVar.w(i2, i3, b.f(), new j0v(arrayList, i2, i3, 4));
    }
}
