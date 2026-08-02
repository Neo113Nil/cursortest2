package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class hwe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sgr b;
    public final /* synthetic */ owe c;

    public /* synthetic */ hwe(owe oweVar, sgr sgrVar, int i) {
        this.a = i;
        this.c = oweVar;
        this.b = sgrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r76 r76Var = this.c.v.a;
                r76 r76Var2 = r76.e;
                if (r76Var != r76Var2) {
                    owe oweVar = this.c;
                    oweVar.w = this.b;
                    kwe kweVar = oweVar.u;
                    owe oweVar2 = this.c;
                    kwe kweVar2 = oweVar2.t;
                    oweVar2.u = null;
                    owe oweVar3 = this.c;
                    oweVar3.t = null;
                    owe.e(oweVar3, r76Var2);
                    this.c.k.d();
                    if (this.c.r.isEmpty()) {
                        owe oweVar4 = this.c;
                        oweVar4.j.execute(new gwe(oweVar4, 3));
                    }
                    owe oweVar5 = this.c;
                    oweVar5.j.e();
                    rjp rjpVar = oweVar5.o;
                    if (rjpVar != null) {
                        rjpVar.c();
                        oweVar5.o = null;
                        oweVar5.m = null;
                    }
                    rjp rjpVar2 = this.c.p;
                    if (rjpVar2 != null) {
                        rjpVar2.c();
                        this.c.q.b(this.b);
                        owe oweVar6 = this.c;
                        oweVar6.p = null;
                        oweVar6.q = null;
                    }
                    if (kweVar != null) {
                        kweVar.b(this.b);
                    }
                    if (kweVar2 != null) {
                        kweVar2.b(this.b);
                        break;
                    }
                }
                break;
            default:
                Iterator it = new ArrayList(this.c.r).iterator();
                while (it.hasNext()) {
                    ((s8h) it.next()).c(this.b);
                }
                break;
        }
    }
}
