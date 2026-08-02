package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final /* synthetic */ class tw3 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ itt0 b;

    public /* synthetic */ tw3(itt0 itt0Var, int i) {
        this.a = i;
        this.b = itt0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        h5a0 h5a0Var;
        Object obj;
        rtt0 rtt0Var;
        int i = this.a;
        itt0 itt0Var = this.b;
        switch (i) {
            case 0:
                ttt0 ttt0Var = itt0Var.a.a;
                ott0 ott0Var = (ttt0Var == null || (rtt0Var = ttt0Var.b) == null) ? null : rtt0Var.b;
                if (ott0Var != null) {
                    Iterator it = ott0Var.b.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            String id = ((h5a0) obj).getId();
                            h5a0 h5a0Var2 = ott0Var.c;
                            if (jl40.l(id, h5a0Var2 != null ? h5a0Var2.getId() : null)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    h5a0Var = (h5a0) obj;
                } else {
                    h5a0Var = null;
                }
                return new sw3(ott0Var != null ? ott0Var.a : null, new rg6(h5a0Var), ott0Var != null ? ott0Var.b : null, 8);
            default:
                ctt0 ctt0Var = itt0Var.a;
                ttt0 ttt0Var2 = ctt0Var.a;
                List list = ctt0Var.b;
                a9u0 a9u0Var = ttt0Var2 != null ? ttt0Var2.a.a : null;
                a9u0 a9u0Var2 = ttt0Var2 != null ? ttt0Var2.a.b : null;
                if (list == null) {
                    list = EmptyList.a;
                }
                return new cut0(null, null, a9u0Var, a9u0Var2, true, list);
        }
    }
}
