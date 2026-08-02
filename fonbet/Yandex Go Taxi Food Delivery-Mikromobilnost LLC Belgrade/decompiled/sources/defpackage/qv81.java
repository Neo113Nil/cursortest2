package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class qv81 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final sc81 c = new sc81();
    public final cw71 d = new cw71();
    public Looper e;
    public yn81 f;
    public wl61 g;

    public abstract ra71 a(v281 v281Var, xi71 xi71Var, long j);

    public abstract void a(mr81 mr81Var);

    public abstract void a(ra71 ra71Var);

    public final void a(sf81 sf81Var) {
        sc81 sc81Var = this.c;
        Iterator it = sc81Var.c.iterator();
        while (it.hasNext()) {
            g981 g981Var = (g981) it.next();
            if (g981Var.b == sf81Var) {
                sc81Var.c.remove(g981Var);
            }
        }
    }

    public final void b(u581 u581Var) {
        this.e.getClass();
        boolean isEmpty = this.b.isEmpty();
        this.b.add(u581Var);
        if (isEmpty) {
            b();
        }
    }

    public abstract op81 c();

    public final void c(u581 u581Var) {
        this.a.remove(u581Var);
        if (!this.a.isEmpty()) {
            a(u581Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        e();
    }

    public abstract void d();

    public abstract void e();

    public void b() {
    }

    public void a() {
    }

    public final void a(yn81 yn81Var) {
        this.f = yn81Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((u581) it.next()).a(this, yn81Var);
        }
    }

    public final void a(cz71 cz71Var) {
        cw71 cw71Var = this.d;
        Iterator it = cw71Var.c.iterator();
        while (it.hasNext()) {
            xs71 xs71Var = (xs71) it.next();
            if (xs71Var.a == cz71Var) {
                cw71Var.c.remove(xs71Var);
            }
        }
    }

    public final void a(u581 u581Var) {
        boolean isEmpty = this.b.isEmpty();
        this.b.remove(u581Var);
        if (isEmpty || !this.b.isEmpty()) {
            return;
        }
        a();
    }
}
