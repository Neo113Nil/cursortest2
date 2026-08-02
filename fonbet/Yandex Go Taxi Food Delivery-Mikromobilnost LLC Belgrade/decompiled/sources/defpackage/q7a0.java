package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class q7a0 extends yr31 {
    public final eii b;
    public final r0 c;

    public q7a0(n7a0 n7a0Var, eii eiiVar, s9n s9nVar) {
        this.b = eiiVar;
        l7x0 l7x0Var = s9nVar.a;
        String str = n7a0Var.a;
        String str2 = n7a0Var.b;
        String str3 = n7a0Var.c;
        lvi0 lvi0Var = str3 != null ? new lvi0(l7x0Var.a(str3), null, null, null, null, 62) : null;
        String str4 = n7a0Var.w;
        ArrayList<m7a0> arrayList = n7a0Var.x;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (m7a0 m7a0Var : arrayList) {
            arrayList2.add(new o7a0(new lvi0(l7x0Var.a(m7a0Var.c), null, null, null, null, 62), m7a0Var.a, m7a0Var.b));
        }
        this.c = bvf0.c(new p7a0(str, str2, lvi0Var, str4, arrayList2));
    }
}
