package defpackage;

import java.util.Iterator;
import java.util.logging.Logger;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class vt3 extends a77 {
    static {
        Logger.getLogger(vt3.class.getName());
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        o();
        return super.cancel();
    }

    @Override // defpackage.e77
    public final String e() {
        StringBuilder sb = new StringBuilder("Canceler(");
        p2f p2fVar = this.a;
        return su4.o(sb, p2fVar != null ? p2fVar.q : "", ")");
    }

    @Override // defpackage.a77
    public final void g() {
        z67 a = this.c.a();
        this.c = a;
        if (a.b == 4) {
            return;
        }
        cancel();
    }

    @Override // defpackage.a77
    public final o67 i(o67 o67Var) {
        Iterator it = this.a.i.a(x67.CLASS_ANY, true, this.b).iterator();
        while (it.hasNext()) {
            o67Var = a(o67Var, null, (w67) it.next());
        }
        return o67Var;
    }

    @Override // defpackage.a77
    public final o67 j(a aVar, o67 o67Var) {
        Iterator it = aVar.k(x67.CLASS_ANY, this.b, this.a.i).iterator();
        while (it.hasNext()) {
            o67Var = a(o67Var, null, (w67) it.next());
        }
        return o67Var;
    }

    @Override // defpackage.a77
    public final boolean k() {
        return true;
    }

    @Override // defpackage.a77
    public final o67 l() {
        return new o67(33792);
    }

    @Override // defpackage.a77
    public final String m() {
        return "canceling";
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
