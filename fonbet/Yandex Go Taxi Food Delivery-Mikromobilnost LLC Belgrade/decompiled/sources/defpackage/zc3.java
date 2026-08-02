package defpackage;

/* loaded from: classes4.dex */
public final class zc3 extends o2 {
    public u2 a;
    public a2 b;

    public static zc3 m(a2 a2Var) {
        if (a2Var instanceof zc3) {
            return (zc3) a2Var;
        }
        if (a2Var == null) {
            ny61.g("null value in getInstance()");
            return null;
        }
        i3 z = i3.z(a2Var);
        zc3 zc3Var = new zc3();
        zc3Var.a = (u2) z.A(0);
        zc3Var.b = z.A(1);
        return zc3Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }
}
