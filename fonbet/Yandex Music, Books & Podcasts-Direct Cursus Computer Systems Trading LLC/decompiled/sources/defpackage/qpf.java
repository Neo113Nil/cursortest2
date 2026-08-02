package defpackage;

/* loaded from: classes.dex */
public final class qpf {
    public final mpf a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public zwg q;
    public ipf d = ipf.e;
    public final jfh p = new jfh(this);

    public qpf(mpf mpfVar) {
        this.a = mpfVar;
    }

    public final f8j a() {
        return (f8j) this.a.F.d;
    }

    public final void b(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            mpf u = this.a.u();
            qpf qpfVar = u != null ? u.G : null;
            if (qpfVar != null) {
                int i3 = qpfVar.l;
                if (i == 0) {
                    qpfVar.b(i3 - 1);
                } else {
                    qpfVar.b(i3 + 1);
                }
            }
        }
    }

    public final void c(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            mpf u = this.a.u();
            qpf qpfVar = u != null ? u.G : null;
            if (qpfVar != null) {
                int i3 = qpfVar.o;
                if (i == 0) {
                    qpfVar.c(i3 - 1);
                } else {
                    qpfVar.c(i3 + 1);
                }
            }
        }
    }

    public final void d(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                b(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                b(this.l - 1);
            }
        }
    }

    public final void e(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                b(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                b(this.l - 1);
            }
        }
    }

    public final void f(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                c(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                c(this.o - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                c(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                c(this.o - 1);
            }
        }
    }

    public final void h() {
        jfh jfhVar = this.p;
        qpf qpfVar = jfhVar.f;
        Object obj = jfhVar.s;
        mpf mpfVar = this.a;
        if ((obj != null || qpfVar.a().n() != null) && jfhVar.r) {
            jfhVar.r = false;
            jfhVar.s = qpfVar.a().n();
            mpf u = mpfVar.u();
            if (u != null) {
                mpf.W(u, false, 7);
            }
        }
        zwg zwgVar = this.q;
        if (zwgVar != null) {
            qpf qpfVar2 = zwgVar.f;
            if (zwgVar.x == null) {
                vwg Z0 = qpfVar2.a().Z0();
                Z0.getClass();
                if (Z0.l.n() == null) {
                    return;
                }
            }
            if (zwgVar.w) {
                zwgVar.w = false;
                vwg Z02 = qpfVar2.a().Z0();
                Z02.getClass();
                zwgVar.x = Z02.l.n();
                if (quj.Y(mpfVar)) {
                    mpf u2 = mpfVar.u();
                    if (u2 != null) {
                        mpf.W(u2, false, 7);
                        return;
                    }
                    return;
                }
                mpf u3 = mpfVar.u();
                if (u3 != null) {
                    mpf.T(u3, false, 7);
                }
            }
        }
    }
}
