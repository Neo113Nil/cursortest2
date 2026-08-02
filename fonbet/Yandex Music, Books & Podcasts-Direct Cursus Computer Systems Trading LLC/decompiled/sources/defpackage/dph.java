package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class dph extends zc4 {
    public final g23 n;
    public final tx8 o;

    public dph(g23 g23Var, tx8 tx8Var) {
        this.n = g23Var;
        this.o = tx8Var;
    }

    @Override // defpackage.zc4
    public final void f0(v19 v19Var) {
        g23 g23Var = this.n;
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (qht.a.a()) {
            v19Var.s();
            x(v19Var);
            return;
        }
        f23 a = g23Var.a();
        try {
            d51Var.p(new zg(g23Var, a, v19Var, this, 13));
        } catch (Throwable th) {
            g23.b(a);
            throw th;
        }
    }

    @Override // defpackage.zc4
    public final void g0(i39 i39Var) {
        g23 g23Var = this.n;
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (qht.a.a()) {
            i39Var.s();
            x(i39Var);
            return;
        }
        f23 a = g23Var.a();
        try {
            d51Var.p(new zg(g23Var, a, i39Var, this, 12));
        } catch (Throwable th) {
            g23.b(a);
            throw th;
        }
    }

    @Override // defpackage.zc4
    public final void j0(l0a l0aVar) {
        g23 g23Var = this.n;
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (qht.a.a()) {
            l0aVar.j();
            x(l0aVar);
            return;
        }
        f23 a = g23Var.a();
        try {
            d51Var.p(new zg(g23Var, a, l0aVar, this, 11));
        } catch (Throwable th) {
            g23.b(a);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zc4
    public final void x(f29 f29Var) {
        jc8 div;
        if (f29Var.getBindingContext() == null || (div = f29Var.getDiv()) == null) {
            return;
        }
        dp8 d = div.d();
        tx8 tx8Var = this.o;
        if (tx8Var.b(d)) {
            Iterator it = tx8Var.a.iterator();
            while (it.hasNext()) {
                ((ux8) it.next()).c(d);
            }
        }
    }
}
