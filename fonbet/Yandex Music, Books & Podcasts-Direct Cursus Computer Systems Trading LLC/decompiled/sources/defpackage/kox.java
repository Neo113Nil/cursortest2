package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class kox {
    public final /* synthetic */ p84 a;

    public kox(p84 p84Var) {
        this.a = p84Var;
    }

    public final void a() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((kox) it.next()).a();
        }
    }

    public final void b(int i) {
        p84 p84Var = this.a;
        p84.e(p84Var, i);
        p84Var.a(i);
        Iterator it = new HashSet(p84Var.d).iterator();
        while (it.hasNext()) {
            ((kox) it.next()).b(i);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((kox) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((kox) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((kox) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((kox) it.next()).f();
        }
    }
}
