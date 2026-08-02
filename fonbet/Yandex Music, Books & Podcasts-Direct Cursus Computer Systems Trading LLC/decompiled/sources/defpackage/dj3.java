package defpackage;

/* loaded from: classes3.dex */
public class dj3 implements sa7 {
    public final sa7 a;
    public boolean b;
    public d6w d;
    public boolean f;
    public final om3 c = new om3();
    public int e = Integer.MAX_VALUE;

    public dj3(sa7 sa7Var) {
        this.a = sa7Var;
        sa7Var.h(new efo(12, this));
    }

    @Override // defpackage.sa7
    public final ys1 a() {
        return this.a.a();
    }

    public final void b(om3 om3Var, boolean z) {
        if (this.a.a().e != Thread.currentThread()) {
            this.a.a().h(new cj3(this, om3Var, z, 0));
            return;
        }
        om3 om3Var2 = this.c;
        if (!om3Var2.i() && !this.b) {
            this.a.e(om3Var);
        }
        int i = om3Var.c;
        if (i > 0) {
            int min = Math.min(i, this.e);
            if (z) {
                min = om3Var.c;
            }
            if (min > 0) {
                om3Var.g(om3Var2, min);
            }
        }
    }

    public final void c() {
        d6w d6wVar;
        if (this.b) {
            return;
        }
        om3 om3Var = this.c;
        if (om3Var.i()) {
            this.a.e(om3Var);
            if (om3Var.c == 0 && this.f) {
                this.a.end();
            }
        }
        if (om3Var.i() || (d6wVar = this.d) == null) {
            return;
        }
        d6wVar.o();
    }

    @Override // defpackage.sa7
    public final void d(pm5 pm5Var) {
        this.a.d(pm5Var);
    }

    @Override // defpackage.sa7
    public void e(om3 om3Var) {
        b(om3Var, false);
    }

    @Override // defpackage.sa7
    public void end() {
        if (this.a.a().e != Thread.currentThread()) {
            this.a.a().h(new q9(10, this));
        } else if (this.c.i()) {
            this.f = true;
        } else {
            this.a.end();
        }
    }

    @Override // defpackage.sa7
    public final void h(d6w d6wVar) {
        this.d = d6wVar;
    }

    @Override // defpackage.sa7
    public final boolean isOpen() {
        return this.a.isOpen();
    }
}
