package defpackage;

import java.util.Iterator;
import java.util.logging.Logger;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class vsm extends a77 {
    static {
        Logger.getLogger(vsm.class.getName());
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        o();
        return super.cancel();
    }

    @Override // defpackage.e77
    public final String e() {
        StringBuilder sb = new StringBuilder("Prober(");
        p2f p2fVar = this.a;
        return su4.o(sb, p2fVar != null ? p2fVar.q : "", ")");
    }

    @Override // defpackage.a77
    public final void g() {
        z67 a = this.c.a();
        this.c = a;
        if (a.b == 1) {
            return;
        }
        cancel();
        this.a.Q();
    }

    @Override // defpackage.a77
    public final o67 i(o67 o67Var) {
        p2f p2fVar = this.a;
        o67Var.h(q67.s(p2fVar.i.a, y67.TYPE_ANY, x67.CLASS_IN, false));
        Iterator it = p2fVar.i.a(x67.CLASS_ANY, false, this.b).iterator();
        while (it.hasNext()) {
            o67Var = c(o67Var, (w67) it.next());
        }
        return o67Var;
    }

    @Override // defpackage.a77
    public final o67 j(a aVar, o67 o67Var) {
        String f = aVar.f();
        y67 y67Var = y67.TYPE_ANY;
        x67 x67Var = x67.CLASS_IN;
        return c(d(o67Var, q67.s(f, y67Var, x67Var, false)), new u67(aVar.f(), x67Var, false, this.b, aVar.j, aVar.i, aVar.h, this.a.i.a));
    }

    @Override // defpackage.a77
    public final boolean k() {
        p2f p2fVar = this.a;
        return (p2fVar.L0() || p2fVar.K0()) ? false : true;
    }

    @Override // defpackage.a77
    public final o67 l() {
        return new o67(0);
    }

    @Override // defpackage.a77
    public final String m() {
        return "probing";
    }

    @Override // defpackage.a77
    public final void n() {
        this.a.O0();
    }

    @Override // defpackage.e77
    public final String toString() {
        return e() + " state: " + this.c;
    }
}
