package defpackage;

/* loaded from: classes4.dex */
public final class xr1 extends o2 {
    public u2 a;
    public a2 b;

    public xr1(u2 u2Var, a2 a2Var) {
        this.a = u2Var;
        this.b = a2Var;
    }

    public static xr1 m(Object obj) {
        if (obj instanceof xr1) {
            return (xr1) obj;
        }
        if (obj != null) {
            i3 z = i3.z(obj);
            xr1 xr1Var = new xr1();
            if (z.size() >= 1 && z.size() <= 2) {
                xr1Var.a = u2.A(z.A(0));
                if (z.size() == 2) {
                    xr1Var.b = z.A(1);
                    return xr1Var;
                }
                xr1Var.b = null;
                return xr1Var;
            }
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        a2 a2Var = this.b;
        if (a2Var != null) {
            c2Var.a(a2Var);
        }
        return new jqf(c2Var);
    }

    public xr1(u2 u2Var) {
        this.a = u2Var;
    }
}
