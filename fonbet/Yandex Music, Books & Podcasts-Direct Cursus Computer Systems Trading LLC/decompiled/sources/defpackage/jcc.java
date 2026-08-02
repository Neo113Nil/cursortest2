package defpackage;

/* loaded from: classes3.dex */
public abstract class jcc implements u97, aa7 {
    public boolean a;
    public pm5 b;
    public u97 c;
    public aa7 d;
    public boolean e;

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        if (this.e) {
            om3Var.n();
        } else {
            v7g.s(this, om3Var);
        }
    }

    @Override // defpackage.aa7
    public ys1 a() {
        return this.d.a();
    }

    public void b(Exception exc) {
        if (this.a) {
            return;
        }
        this.a = true;
        pm5 pm5Var = this.b;
        if (pm5Var != null) {
            pm5Var.r(exc);
        }
    }

    @Override // defpackage.aa7
    public final void c(u97 u97Var) {
        this.c = u97Var;
    }

    @Override // defpackage.aa7
    public void close() {
        this.e = true;
        aa7 aa7Var = this.d;
        if (aa7Var != null) {
            aa7Var.close();
        }
    }

    public void f(aa7 aa7Var) {
        aa7 aa7Var2 = this.d;
        if (aa7Var2 != null) {
            aa7Var2.c(null);
        }
        this.d = aa7Var;
        aa7Var.c(this);
        this.d.s(new n7b(this));
    }

    @Override // defpackage.aa7
    public final boolean g() {
        return this.d.g();
    }

    @Override // defpackage.aa7
    public final void m() {
        this.d.m();
    }

    @Override // defpackage.aa7
    public final void s(pm5 pm5Var) {
        this.b = pm5Var;
    }

    @Override // defpackage.aa7
    public final u97 u() {
        return this.c;
    }
}
