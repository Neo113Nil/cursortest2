package defpackage;

/* loaded from: classes4.dex */
public class x4i0 extends o2 {
    public static final l2 A;
    public static final xr1 x;
    public static final xr1 y;
    public static final l2 z;
    public xr1 a = x;
    public xr1 b = y;
    public l2 c = z;
    public l2 w = A;

    static {
        xr1 xr1Var = new xr1(zo60.e, zpf.b);
        x = xr1Var;
        y = new xr1(b490.b3, xr1Var);
        z = new l2(20L);
        A = new l2(1L);
    }

    public static x4i0 m(Object obj) {
        if (obj instanceof x4i0) {
            return (x4i0) obj;
        }
        if (obj == null) {
            return null;
        }
        i3 z2 = i3.z(obj);
        x4i0 x4i0Var = new x4i0();
        x4i0Var.a = x;
        x4i0Var.b = y;
        x4i0Var.c = z;
        x4i0Var.w = A;
        for (int i = 0; i != z2.size(); i++) {
            s3 s3Var = (s3) z2.A(i);
            int i2 = s3Var.c;
            p1 p1Var = i3.b;
            if (i2 == 0) {
                x4i0Var.a = xr1.m((i3) p1Var.Hg(s3Var, true));
            } else if (i2 != 1) {
                p1 p1Var2 = l2.c;
                if (i2 == 2) {
                    x4i0Var.c = (l2) p1Var2.Hg(s3Var, true);
                } else {
                    if (i2 != 3) {
                        ny61.g("unknown tag");
                        return null;
                    }
                    x4i0Var.w = (l2) p1Var2.Hg(s3Var, true);
                }
            } else {
                x4i0Var.b = xr1.m((i3) p1Var.Hg(s3Var, true));
            }
        }
        return x4i0Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        l2 l2Var = this.w;
        l2 l2Var2 = this.c;
        xr1 xr1Var = this.b;
        c2 c2Var = new c2(4);
        xr1 xr1Var2 = this.a;
        boolean z2 = true;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        if (!xr1Var2.equals(x)) {
            c2Var.a(new oqf(z2, 0, xr1Var2, 0));
        }
        if (!xr1Var.equals(y)) {
            c2Var.a(new oqf(c4 == true ? 1 : 0, c3 == true ? 1 : 0, xr1Var, 0));
        }
        if (!l2Var2.q(z)) {
            c2Var.a(new oqf(c2 == true ? 1 : 0, 2, l2Var2, 0));
        }
        if (!l2Var.q(A)) {
            c2Var.a(new oqf(c == true ? 1 : 0, 3, l2Var, 0));
        }
        return new jqf(c2Var);
    }
}
