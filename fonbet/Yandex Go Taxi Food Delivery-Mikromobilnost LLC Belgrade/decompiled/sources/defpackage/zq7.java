package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class zq7 implements pq7 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ar7 c;

    public /* synthetic */ zq7(ar7 ar7Var, int i) {
        this.b = i;
        this.c = ar7Var;
    }

    @Override // defpackage.pq7
    public final List a(List list) {
        int i = this.b;
        ar7 ar7Var = this.c;
        switch (i) {
            case 0:
                String c = ar7Var.c();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ar7 ar7Var2 = (ar7) it.next();
                    d6z.n(ar7Var2 instanceof ar7);
                    if (ar7Var2.c().equals(c)) {
                        return Collections.singletonList(ar7Var2);
                    }
                }
                ny61.r(oyr.p("Unable to find camera with id ", c, " from list of available cameras."));
                return null;
            default:
                return Collections.singletonList(ar7Var);
        }
    }
}
