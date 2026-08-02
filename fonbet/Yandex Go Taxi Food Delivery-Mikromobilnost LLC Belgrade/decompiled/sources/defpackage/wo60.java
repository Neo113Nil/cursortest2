package defpackage;

/* loaded from: classes4.dex */
public final class wo60 extends o2 {
    public xo60 a;
    public svj0 b;

    public static wo60 m(Object obj) {
        xo60 xo60Var;
        if (obj instanceof wo60) {
            return (wo60) obj;
        }
        svj0 svj0Var = null;
        if (obj == null) {
            return null;
        }
        i3 z = i3.z(obj);
        wo60 wo60Var = new wo60();
        a2 A = z.A(0);
        if (A instanceof xo60) {
            xo60Var = (xo60) A;
        } else if (A != null) {
            e2 x = e2.x(A);
            xo60 xo60Var2 = new xo60();
            xo60Var2.a = x;
            xo60Var = xo60Var2;
        } else {
            xo60Var = null;
        }
        wo60Var.a = xo60Var;
        if (z.size() == 2) {
            i3 y = i3.y((s3) z.A(1), true);
            if (y != null) {
                i3 z2 = i3.z(y);
                svj0Var = new svj0();
                svj0Var.a = (u2) z2.A(0);
                svj0Var.b = (w2) z2.A(1);
            }
            wo60Var.b = svj0Var;
        }
        return wo60Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        svj0 svj0Var = this.b;
        if (svj0Var != null) {
            c2Var.a(new oqf(true, 0, svj0Var, 0));
        }
        return new jqf(c2Var);
    }
}
