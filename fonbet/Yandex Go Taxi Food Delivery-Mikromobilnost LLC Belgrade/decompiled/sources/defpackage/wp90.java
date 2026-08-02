package defpackage;

/* loaded from: classes4.dex */
public final class wp90 extends o2 {
    public l2 a;
    public xr1 b;
    public xr1 c;
    public w2 w;

    public static wp90 m(s3 s3Var) {
        a2 A;
        i3 y = i3.y(s3Var, false);
        if (y == null) {
            return null;
        }
        i3 z = i3.z(y);
        wp90 wp90Var = new wp90();
        wp90Var.a = (l2) z.A(0);
        if (z.A(1) instanceof s3) {
            wp90Var.b = xr1.m(i3.y((s3) z.A(1), false));
            wp90Var.c = xr1.m(z.A(2));
            A = z.A(3);
        } else {
            wp90Var.c = xr1.m(z.A(1));
            A = z.A(2);
        }
        wp90Var.w = (w2) A;
        return wp90Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(4);
        c2Var.a(this.a);
        xr1 xr1Var = this.b;
        if (xr1Var != null) {
            c2Var.a(new oqf(false, 0, xr1Var, 0));
        }
        c2Var.a(this.c);
        c2Var.a(this.w);
        return new jqf(c2Var);
    }
}
