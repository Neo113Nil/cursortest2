package defpackage;

import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class zyu0 extends o2 {
    public xr1 a;
    public s1 b;

    public zyu0(i3 i3Var) {
        if (i3Var.size() != 2) {
            ny61.g(vfc.n(i3Var, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        Enumeration B = i3Var.B();
        this.a = xr1.m(B.nextElement());
        this.b = s1.y(B.nextElement());
    }

    public static zyu0 m(a2 a2Var) {
        if (a2Var instanceof zyu0) {
            return (zyu0) a2Var;
        }
        if (a2Var != null) {
            return new zyu0(i3.z(a2Var));
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }
}
