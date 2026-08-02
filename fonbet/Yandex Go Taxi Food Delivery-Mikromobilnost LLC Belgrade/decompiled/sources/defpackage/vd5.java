package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class vd5 extends o2 {
    public w1 a;
    public l2 b;

    public static vd5 m(b3 b3Var) {
        if (b3Var == null) {
            return null;
        }
        i3 z = i3.z(b3Var);
        vd5 vd5Var = new vd5();
        vd5Var.a = w1.c;
        vd5Var.b = null;
        if (z.size() == 0) {
            vd5Var.a = null;
            vd5Var.b = null;
            return vd5Var;
        }
        if (z.A(0) instanceof w1) {
            vd5Var.a = w1.x(z.A(0));
        } else {
            vd5Var.a = null;
            vd5Var.b = l2.u(z.A(0));
        }
        if (z.size() <= 1) {
            return vd5Var;
        }
        if (vd5Var.a != null) {
            vd5Var.b = l2.u(z.A(1));
            return vd5Var;
        }
        ny61.g("wrong sequence in constructor");
        return null;
    }

    public final boolean n() {
        w1 w1Var = this.a;
        return w1Var != null && w1Var.y();
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        w1 w1Var = this.a;
        if (w1Var != null) {
            c2Var.a(w1Var);
        }
        l2 l2Var = this.b;
        if (l2Var != null) {
            c2Var.a(l2Var);
        }
        return new jqf(c2Var);
    }

    public final String toString() {
        l2 l2Var = this.b;
        if (l2Var == null) {
            return "BasicConstraints: isCa(" + n() + Extension.C_BRAKE;
        }
        return "BasicConstraints: isCa(" + n() + "), pathLenConstraint = " + l2Var.x();
    }
}
