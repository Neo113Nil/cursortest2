package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class li3 implements tx7 {
    public final qxp a;
    public final List b;
    public final ew6 c;
    public final rku d;

    public li3(qxp qxpVar, ArrayList arrayList) {
        ew6 ew6Var = new ew6();
        rku rkuVar = new rku();
        arrayList.getClass();
        this.a = qxpVar;
        this.b = arrayList;
        this.c = ew6Var;
        this.d = rkuVar;
    }

    @Override // defpackage.tx7
    public final void a(paw pawVar) {
        pawVar.w(this.c);
        this.d.a(pawVar);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((tx7) it.next()).a(pawVar);
        }
    }

    @Override // defpackage.tx7
    public final void e(paw pawVar) {
        pawVar.q(this.c);
        this.d.e(pawVar);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((tx7) it.next()).e(pawVar);
        }
    }
}
