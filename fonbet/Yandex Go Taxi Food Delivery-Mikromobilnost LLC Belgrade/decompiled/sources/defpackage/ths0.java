package defpackage;

/* loaded from: classes4.dex */
public final class ths0 extends o2 {
    public d79 a;
    public e79 b;
    public g2 c;
    public g2 w;
    public gzo x;

    public static ths0 m(a2 a2Var) {
        d79 d79Var;
        e79 e79Var;
        o2 o2Var;
        if (a2Var instanceof ths0) {
            return (ths0) a2Var;
        }
        if (a2Var == null) {
            return null;
        }
        i3 z = i3.z(a2Var);
        ths0 ths0Var = new ths0();
        a2 A = z.A(0);
        if (A instanceof d79) {
            d79Var = (d79) A;
        } else if (A != null) {
            i3 z2 = i3.z(A);
            d79 d79Var2 = new d79();
            d79Var2.a = xr1.m(z2.A(0));
            d79Var2.b = (w2) z2.A(1);
            d79Var2.c = (w2) z2.A(2);
            d79Var2.w = (l2) z2.A(3);
            d79Var = d79Var2;
        } else {
            d79Var = null;
        }
        ths0Var.a = d79Var;
        a2 A2 = z.A(1);
        p1 p1Var = i3.b;
        if (A2 == null || (A2 instanceof e79)) {
            e79Var = (e79) A2;
        } else {
            if (!(A2 instanceof s3)) {
                ny61.g("unknown object in factory: ".concat(A2.getClass().getName()));
                return null;
            }
            s3 s3Var = (s3) A2;
            e79Var = new e79();
            int i = s3Var.c;
            p1 p1Var2 = m2.a;
            if (i != 0) {
                if (i == 1) {
                    o2Var = w2k0.m((i3) p1Var.Hg(s3Var, false));
                    e79Var.b = o2Var;
                    e79Var.a = i;
                } else if (i != 2) {
                    ny61.g("Unknown tag encountered: ".concat(z3.b(s3Var.b, i)));
                    return null;
                }
            }
            o2Var = (m2) p1Var2.Hg(s3Var, false);
            e79Var.b = o2Var;
            e79Var.a = i;
        }
        ths0Var.b = e79Var;
        ths0Var.c = g2.z(z.A(2));
        int size = z.size();
        p1 p1Var3 = g2.b;
        if (size > 4) {
            ths0Var.w = (g2) p1Var3.Hg((s3) z.A(3), true);
            ths0Var.x = gzo.n(i3.y((s3) z.A(4), true));
            return ths0Var;
        }
        if (z.size() > 3) {
            s3 s3Var2 = (s3) z.A(3);
            if (s3Var2.c == 0) {
                ths0Var.w = (g2) p1Var3.Hg(s3Var2, true);
                return ths0Var;
            }
            ths0Var.x = gzo.n((i3) p1Var.Hg(s3Var2, true));
        }
        return ths0Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(5);
        c2Var.a(this.a);
        c2Var.a(this.b);
        c2Var.a(this.c);
        g2 g2Var = this.w;
        if (g2Var != null) {
            c2Var.a(new oqf(true, 0, g2Var, 0));
        }
        gzo gzoVar = this.x;
        if (gzoVar != null) {
            c2Var.a(new oqf(true, 1, gzoVar, 0));
        }
        return new jqf(c2Var);
    }
}
