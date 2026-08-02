package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class lq2 implements db7 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public nb7 d;

    public lq2(boolean z) {
        this.a = z;
    }

    public final void c(int i) {
        nb7 nb7Var = this.d;
        int i2 = dvt.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((t6t) this.b.get(i3)).a(this, nb7Var, this.a, i);
        }
    }

    public final void d() {
        nb7 nb7Var = this.d;
        int i = dvt.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((t6t) this.b.get(i2)).z(this, nb7Var, this.a);
        }
        this.d = null;
    }

    public final void f(nb7 nb7Var) {
        for (int i = 0; i < this.c; i++) {
            ((t6t) this.b.get(i)).h(this, nb7Var, this.a);
        }
    }

    public final void g(nb7 nb7Var) {
        this.d = nb7Var;
        for (int i = 0; i < this.c; i++) {
            ((t6t) this.b.get(i)).C(this, nb7Var, this.a);
        }
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(t6tVar)) {
            return;
        }
        arrayList.add(t6tVar);
        this.c++;
    }
}
