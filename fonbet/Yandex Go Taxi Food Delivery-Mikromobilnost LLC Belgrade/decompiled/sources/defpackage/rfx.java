package defpackage;

/* loaded from: classes4.dex */
public final class rfx extends o2 {
    public final xr1 A;
    public final w2 B;
    public final l2 a;
    public final mgi0 b;
    public final xr1 c;
    public final w2 w;
    public final xr1 x;
    public final l2 y;
    public final w2 z;

    public rfx(i3 i3Var) {
        if (i3Var.size() != 3) {
            ny61.g("sequence must consist of 3 elements");
            throw null;
        }
        this.a = l2.u(i3Var.A(0));
        this.b = mgi0.n(i3Var.A(1));
        this.c = xr1.m(i3Var.A(2));
        this.w = w2.x(i3Var.A(3));
        this.x = xr1.m(i3Var.A(4));
        this.y = l2.u(i3Var.A(5));
        int i = 6;
        if (i3Var.A(6) instanceof s3) {
            this.z = w2.u(s3.A(i3Var.A(6)), true);
            i = 7;
        } else {
            this.z = null;
        }
        this.A = xr1.m(i3Var.A(i));
        this.B = w2.x(i3Var.A(i + 1));
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2();
        c2Var.a(this.a);
        c2Var.a(this.b);
        c2Var.a(this.c);
        c2Var.a(this.w);
        c2Var.a(this.x);
        c2Var.a(this.y);
        w2 w2Var = this.z;
        if (w2Var != null) {
            c2Var.a(new oqf(true, 0, w2Var, 0));
        }
        c2Var.a(this.A);
        c2Var.a(this.B);
        return new jqf(c2Var);
    }
}
