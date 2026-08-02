package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class rpc0 implements b70 {
    public static final List a = scc.g("rootNodeId", "nodes");

    public static ppc0 c(xdx xdxVar, c cVar) {
        Integer num = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                num = (Integer) l80.b.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new ppc0(num.intValue(), arrayList);
                }
                qpc0 qpc0Var = qpc0.a;
                foe foeVar = l80.a;
                ep60 ep60Var = new ep60(qpc0Var, true);
                xdxVar.l();
                arrayList = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList.add(ep60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
            }
        }
    }
}
