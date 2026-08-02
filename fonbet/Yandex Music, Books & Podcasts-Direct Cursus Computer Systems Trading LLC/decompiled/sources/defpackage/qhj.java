package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class qhj implements pj {
    public final pj a;
    public final boolean b;

    public qhj(pj pjVar, boolean z) {
        pjVar.getClass();
        this.a = pjVar;
        this.b = z;
    }

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        r7fVar.getClass();
        fx6Var.getClass();
        boolean z = this.b;
        pj pjVar = this.a;
        if (!z || (r7fVar instanceof fah)) {
            r7fVar.j();
            pjVar.a(r7fVar, fx6Var, obj);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        pjVar.a(fahVar, fx6Var, obj);
        fahVar.p();
        Object b = fahVar.b();
        b.getClass();
        irf.V(r7fVar, b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        if (this.b) {
            if (a7fVar instanceof bah) {
                a7fVar = (bah) a7fVar;
            } else {
                int peek = a7fVar.peek();
                if (peek != 3) {
                    jj4.h(f1d.v(peek), "` json token", "Failed to buffer json reader, expected `BEGIN_OBJECT` but found `");
                    return null;
                }
                ArrayList path = a7fVar.getPath();
                Object d0 = saf.d0(a7fVar);
                d0.getClass();
                a7fVar = new bah(path, (Map) d0);
            }
        }
        a7fVar.j();
        Object b = this.a.b(a7fVar, fx6Var);
        a7fVar.p();
        return b;
    }
}
