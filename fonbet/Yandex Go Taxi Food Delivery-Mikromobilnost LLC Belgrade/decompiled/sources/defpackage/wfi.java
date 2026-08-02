package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class wfi implements qqo {
    public final /* synthetic */ qqo a;
    public final ile0 b;

    public wfi(ile0 ile0Var, rqo rqoVar) {
        vfi.Companion.getClass();
        this.a = ((jbh) rqoVar).c(vfi.d);
        this.b = ile0Var;
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        return (vfi) this.a.b();
    }

    public final boolean d(die0 die0Var) {
        Object x9pVar;
        List<gle0> list = ((vfi) this.a.b()).b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (gle0 gle0Var : list) {
            this.b.getClass();
            if (gle0Var instanceof nje0) {
                nje0 nje0Var = (nje0) gle0Var;
                x9pVar = new u610(nje0Var.a, nje0Var.b);
            } else {
                if (!jl40.l(gle0Var, fle0.INSTANCE)) {
                    w511.b();
                    return false;
                }
                x9pVar = new x9p();
            }
            arrayList.add(x9pVar);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((gie0) it.next()).a(die0Var)) {
                    return true;
                }
            }
        }
        return false;
    }
}
