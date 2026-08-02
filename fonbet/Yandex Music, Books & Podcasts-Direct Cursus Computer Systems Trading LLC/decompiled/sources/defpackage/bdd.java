package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final /* synthetic */ class bdd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bdd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(ced cedVar, dhd dhdVar) {
        switch (this.a) {
            case 0:
                odd oddVar = (odd) this.b;
                odd.c(oddVar, cedVar, dhdVar.a, false, !dhdVar.b, 8);
                if (dhdVar.a) {
                    oddVar.g();
                    break;
                }
                break;
            default:
                Iterator it = ((ked) this.b).e.iterator();
                while (it.hasNext()) {
                    ((bdd) it.next()).a(cedVar, dhdVar);
                }
                break;
        }
    }
}
