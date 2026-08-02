package defpackage;

/* loaded from: classes.dex */
public final class hrd extends ynv {
    @Override // defpackage.px7
    public final void a(px7 px7Var) {
        sx7 sx7Var = this.h;
        if (sx7Var.c && !sx7Var.j) {
            sx7Var.d((int) ((((sx7) sx7Var.l.get(0)).g * ((grd) this.b).u0) + 0.5f));
        }
    }

    @Override // defpackage.ynv
    public final void d() {
        aa6 aa6Var = this.b;
        grd grdVar = (grd) aa6Var;
        int i = grdVar.v0;
        int i2 = grdVar.w0;
        int i3 = grdVar.y0;
        sx7 sx7Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                sx7Var.l.add(aa6Var.V.d.h);
                this.b.V.d.h.k.add(sx7Var);
                sx7Var.f = i;
            } else if (i2 != -1) {
                sx7Var.l.add(aa6Var.V.d.i);
                this.b.V.d.i.k.add(sx7Var);
                sx7Var.f = -i2;
            } else {
                sx7Var.b = true;
                sx7Var.l.add(aa6Var.V.d.i);
                this.b.V.d.i.k.add(sx7Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            sx7Var.l.add(aa6Var.V.e.h);
            this.b.V.e.h.k.add(sx7Var);
            sx7Var.f = i;
        } else if (i2 != -1) {
            sx7Var.l.add(aa6Var.V.e.i);
            this.b.V.e.i.k.add(sx7Var);
            sx7Var.f = -i2;
        } else {
            sx7Var.b = true;
            sx7Var.l.add(aa6Var.V.e.i);
            this.b.V.e.i.k.add(sx7Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.ynv
    public final void e() {
        aa6 aa6Var = this.b;
        int i = ((grd) aa6Var).y0;
        sx7 sx7Var = this.h;
        if (i == 1) {
            aa6Var.a0 = sx7Var.g;
        } else {
            aa6Var.b0 = sx7Var.g;
        }
    }

    @Override // defpackage.ynv
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.ynv
    public final boolean k() {
        return false;
    }

    public final void m(sx7 sx7Var) {
        sx7 sx7Var2 = this.h;
        sx7Var2.k.add(sx7Var);
        sx7Var.l.add(sx7Var2);
    }
}
