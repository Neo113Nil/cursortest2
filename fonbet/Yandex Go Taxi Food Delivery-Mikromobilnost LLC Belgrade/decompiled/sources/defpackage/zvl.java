package defpackage;

import core.divkit.state.a;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes9.dex */
public final /* synthetic */ class zvl implements i6x {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zvl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i6x
    public final void a(d6x d6xVar) {
        n530 n530Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a) obj).d(d6xVar);
                break;
            default:
                ze11 ze11Var = (ze11) obj;
                ywl ywlVar = ze11Var.d;
                if (ywlVar != null && (n530Var = ze11Var.h) != null) {
                    pxl pxlVar = new pxl(ywlVar.c);
                    LinkedList linkedList = ze11Var.f;
                    hn2 hn2Var = new hn2(ze11Var, d6xVar, n530Var, pxlVar, 4);
                    if (!ze11Var.g) {
                        ze11Var.g = true;
                        hn2Var.invoke();
                        if (!linkedList.isEmpty()) {
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                ((sls) it.next()).invoke();
                                it.remove();
                            }
                        }
                        ze11Var.g = false;
                        break;
                    } else {
                        linkedList.add(hn2Var);
                        break;
                    }
                }
                break;
        }
    }
}
