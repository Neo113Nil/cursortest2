package defpackage;

/* loaded from: classes4.dex */
public final class yc3 extends n2 {
    public t2 a;
    public z1 b;

    public static yc3 h(z1 z1Var) {
        if (z1Var instanceof yc3) {
            return (yc3) z1Var;
        }
        if (z1Var == null) {
            ny61.g("null value in getInstance()");
            return null;
        }
        h3 r = h3.r(z1Var);
        yc3 yc3Var = new yc3();
        yc3Var.a = (t2) r.s(0);
        yc3Var.b = r.s(1);
        return yc3Var;
    }

    public final z1 i() {
        return this.b;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        b2 b2Var = new b2(2);
        b2Var.a(this.a);
        b2Var.a(this.b);
        return new iqf(b2Var);
    }
}
