package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class sc81 {
    public final int a;
    public final v281 b;
    public final CopyOnWriteArrayList c;
    public final long d;

    public sc81() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public final long a(long j) {
        long u = rf71.u(j);
        if (u == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.d + u;
    }

    public final void b(pil0 pil0Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            g981 g981Var = (g981) it.next();
            rf71.l(g981Var.a, new nk61(8, this, g981Var.b, pil0Var));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, sf81] */
    public final void c(nl81 nl81Var, pil0 pil0Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            g981 g981Var = (g981) it.next();
            rf71.l(g981Var.a, new rc81(this, g981Var.b, nl81Var, pil0Var, 2));
        }
    }

    public final void d(nl81 nl81Var, pil0 pil0Var, IOException iOException, boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            g981 g981Var = (g981) it.next();
            rf71.l(g981Var.a, new cg10(this, g981Var.b, nl81Var, pil0Var, iOException, z, 3));
        }
    }

    public final void e(pil0 pil0Var) {
        v281 v281Var = this.b;
        v281Var.getClass();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            g981 g981Var = (g981) it.next();
            rf71.l(g981Var.a, new hek0(this, g981Var.b, v281Var, pil0Var, 18));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, sf81] */
    public final void f(nl81 nl81Var, pil0 pil0Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            g981 g981Var = (g981) it.next();
            rf71.l(g981Var.a, new rc81(this, g981Var.b, nl81Var, pil0Var, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, sf81] */
    public final void g(nl81 nl81Var, pil0 pil0Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            g981 g981Var = (g981) it.next();
            rf71.l(g981Var.a, new rc81(this, g981Var.b, nl81Var, pil0Var, 1));
        }
    }

    public sc81(CopyOnWriteArrayList copyOnWriteArrayList, int i, v281 v281Var, long j) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = v281Var;
        this.d = j;
    }
}
