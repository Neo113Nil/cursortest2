package defpackage;

/* loaded from: classes5.dex */
public final class tz6 extends s0 {
    public n0 a;
    public j0 b;
    public s0 c;
    public int d;
    public s0 e;
    public final /* synthetic */ int f = 0;

    public tz6(v0 v0Var) {
        int i;
        s0 n;
        s0 D = D(v0Var, 0);
        if (D instanceof n0) {
            this.a = (n0) D;
            D = D(v0Var, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (D instanceof j0) {
            this.b = (j0) D;
            i++;
            D = D(v0Var, i);
        }
        if (!(D instanceof z0)) {
            this.c = D;
            i++;
            D = D(v0Var, i);
        }
        if (v0Var.size() != i + 1) {
            xq0.x("input sequence too large");
            throw null;
        }
        if (!(D instanceof z0)) {
            xq0.x("No tagged object found in sequence. Structure doesn't seem to be of type External");
            throw null;
        }
        z0 z0Var = (z0) D;
        int i2 = z0Var.c;
        if (i2 < 0 || i2 > 2) {
            xq0.x(k5r.i(i2, "invalid encoding value: "));
            throw null;
        }
        this.d = i2;
        int i3 = z0Var.b;
        if (128 != i3) {
            xq0.x("invalid tag: ".concat(h4a.w(i3, i2)));
            throw null;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                n = (o0) o0.b.f(z0Var, false);
            } else {
                if (i2 != 2) {
                    xq0.x("invalid tag: ".concat(h4a.w(i3, i2)));
                    throw null;
                }
                n = (z) z.b.f(z0Var, false);
            }
        } else {
            if (!z0Var.D()) {
                xq0.q("object implicit - explicit expected.");
                throw null;
            }
            d0 d0Var = z0Var.d;
            n = (d0Var instanceof k0 ? (k0) d0Var : d0Var.n()).n();
        }
        this.e = n;
    }

    public static s0 D(v0 v0Var, int i) {
        if (v0Var.size() > i) {
            return v0Var.F(i).n();
        }
        xq0.x("too few objects in input sequence");
        return null;
    }

    @Override // defpackage.s0
    public final s0 A() {
        int i = this.f;
        return this;
    }

    public final v0 B() {
        switch (this.f) {
            case 0:
                e0 e0Var = new e0(4);
                n0 n0Var = this.a;
                if (n0Var != null) {
                    e0Var.e(n0Var);
                }
                j0 j0Var = this.b;
                if (j0Var != null) {
                    e0Var.e(j0Var);
                }
                s0 s0Var = this.c;
                if (s0Var != null) {
                    e0Var.e(s0Var.z());
                }
                int i = this.d;
                e0Var.e(new ki2(i == 0, i, this.e, 1));
                d07 d07Var = new d07(e0Var);
                d07Var.c = -1;
                return d07Var;
            default:
                e0 e0Var2 = new e0(4);
                n0 n0Var2 = this.a;
                if (n0Var2 != null) {
                    e0Var2.e(n0Var2);
                }
                j0 j0Var2 = this.b;
                if (j0Var2 != null) {
                    e0Var2.e(j0Var2);
                }
                s0 s0Var2 = this.c;
                if (s0Var2 != null) {
                    e0Var2.e(s0Var2.A());
                }
                int i2 = this.d;
                e0Var2.e(new ki2(i2 == 0, i2, this.e, 2));
                f67 f67Var = new f67(e0Var2);
                f67Var.c = -1;
                return f67Var;
        }
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        n0 n0Var = this.a;
        int hashCode = n0Var == null ? 0 : n0Var.hashCode();
        j0 j0Var = this.b;
        int hashCode2 = hashCode ^ (j0Var == null ? 0 : j0Var.hashCode());
        s0 s0Var = this.c;
        return ((hashCode2 ^ (s0Var != null ? s0Var.hashCode() : 0)) ^ this.d) ^ this.e.hashCode();
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        tz6 tz6Var;
        n0 n0Var;
        n0 n0Var2;
        if (this == s0Var) {
            return true;
        }
        if (!(s0Var instanceof tz6) || ((n0Var = this.a) != (n0Var2 = (tz6Var = (tz6) s0Var).a) && (n0Var == null || n0Var2 == null || !n0Var.equals(n0Var2)))) {
            return false;
        }
        j0 j0Var = this.b;
        j0 j0Var2 = tz6Var.b;
        if (j0Var != j0Var2 && (j0Var == null || j0Var2 == null || !j0Var.equals(j0Var2))) {
            return false;
        }
        s0 s0Var2 = this.c;
        s0 s0Var3 = tz6Var.c;
        return (s0Var2 == s0Var3 || !(s0Var2 == null || s0Var3 == null || !s0Var2.equals(s0Var3))) && this.d == tz6Var.d && this.e.x(tz6Var.e);
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.A(40, z);
        B().u(qxpVar, false);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return true;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return B().w(z);
    }

    @Override // defpackage.s0
    public s0 z() {
        switch (this.f) {
            case 0:
                return this;
            default:
                n0 n0Var = this.a;
                j0 j0Var = this.b;
                s0 s0Var = this.c;
                int i = this.d;
                s0 s0Var2 = this.e;
                tz6 tz6Var = new tz6();
                tz6Var.a = n0Var;
                tz6Var.b = j0Var;
                tz6Var.c = s0Var;
                if (i >= 0 && i <= 2) {
                    tz6Var.d = i;
                    if (i == 1) {
                        if (!o0.class.isInstance(s0Var2)) {
                            xq0.q("unexpected object: ".concat(s0Var2.getClass().getName()));
                        }
                        tz6Var.e = s0Var2;
                        return tz6Var;
                    }
                    if (i == 2 && !z.class.isInstance(s0Var2)) {
                        xq0.q("unexpected object: ".concat(s0Var2.getClass().getName()));
                    }
                    tz6Var.e = s0Var2;
                    return tz6Var;
                }
                xq0.x(k5r.i(i, "invalid encoding value: "));
                return null;
        }
    }

    public /* synthetic */ tz6() {
    }
}
