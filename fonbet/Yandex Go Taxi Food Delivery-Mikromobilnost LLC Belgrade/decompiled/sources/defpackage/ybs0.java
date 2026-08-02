package defpackage;

import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class ybs0 extends o2 {
    public l2 a;
    public xbs0 b;
    public xr1 c;
    public m3 w;
    public xr1 x;
    public w2 y;
    public m3 z;

    public ybs0(xbs0 xbs0Var, xr1 xr1Var, m3 m3Var, xr1 xr1Var2, w2 w2Var, lqf lqfVar) {
        this.a = xbs0Var.a instanceof s3 ? new l2(3L) : new l2(1L);
        this.b = xbs0Var;
        this.c = xr1Var;
        this.w = m3Var;
        this.x = xr1Var2;
        this.y = w2Var;
        this.z = lqfVar;
    }

    public static ybs0 m(a2 a2Var) {
        if (a2Var instanceof ybs0) {
            return (ybs0) a2Var;
        }
        if (a2Var == null) {
            return null;
        }
        i3 z = i3.z(a2Var);
        ybs0 ybs0Var = new ybs0();
        Enumeration B = z.B();
        ybs0Var.a = (l2) B.nextElement();
        ybs0Var.b = xbs0.m(B.nextElement());
        ybs0Var.c = xr1.m(B.nextElement());
        Object nextElement = B.nextElement();
        boolean z2 = nextElement instanceof s3;
        p1 p1Var = m3.c;
        if (z2) {
            ybs0Var.w = (m3) p1Var.Hg((s3) nextElement, false);
            nextElement = B.nextElement();
        } else {
            ybs0Var.w = null;
        }
        ybs0Var.x = xr1.m(nextElement);
        ybs0Var.y = w2.x(B.nextElement());
        if (B.hasMoreElements()) {
            ybs0Var.z = (m3) p1Var.Hg((s3) B.nextElement(), false);
            return ybs0Var;
        }
        ybs0Var.z = null;
        return ybs0Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(7);
        c2Var.a(this.a);
        c2Var.a(this.b);
        c2Var.a(this.c);
        m3 m3Var = this.w;
        if (m3Var != null) {
            c2Var.a(new oqf(false, 0, m3Var, 0));
        }
        c2Var.a(this.x);
        c2Var.a(this.y);
        m3 m3Var2 = this.z;
        if (m3Var2 != null) {
            c2Var.a(new oqf(false, 1, m3Var2, 0));
        }
        return new jqf(c2Var);
    }
}
