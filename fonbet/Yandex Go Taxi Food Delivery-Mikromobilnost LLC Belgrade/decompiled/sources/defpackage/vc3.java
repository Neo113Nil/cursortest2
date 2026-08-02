package defpackage;

/* loaded from: classes4.dex */
public final class vc3 extends o2 {
    public u2 a;
    public m3 b;

    public vc3(u2 u2Var, m3 m3Var) {
        this.a = u2Var;
        this.b = m3Var;
    }

    public static vc3 m(Object obj) {
        if (obj instanceof vc3) {
            return (vc3) obj;
        }
        if (obj == null) {
            return null;
        }
        i3 z = i3.z(obj);
        vc3 vc3Var = new vc3();
        vc3Var.a = (u2) z.A(0);
        vc3Var.b = (m3) z.A(1);
        return vc3Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        c2Var.a(this.b);
        return new jqf(c2Var);
    }
}
