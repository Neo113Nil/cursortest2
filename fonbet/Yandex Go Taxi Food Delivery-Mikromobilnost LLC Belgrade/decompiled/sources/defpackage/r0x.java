package defpackage;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class r0x extends o2 {
    public gxs a;
    public l2 b;
    public s1 c;

    public r0x(jc51 jc51Var, BigInteger bigInteger) {
        this(new gxs(new fxs(jc51Var)), new l2(bigInteger));
    }

    public static r0x m(Object obj) {
        if (obj instanceof r0x) {
            return (r0x) obj;
        }
        if (obj == null) {
            return null;
        }
        i3 z = i3.z(obj);
        r0x r0xVar = new r0x();
        if (z.size() != 2 && z.size() != 3) {
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
            return null;
        }
        r0xVar.a = gxs.m(z.A(0));
        r0xVar.b = l2.u(z.A(1));
        if (z.size() == 3) {
            r0xVar.c = s1.y(z.A(2));
        }
        return r0xVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        c2Var.a(this.a);
        c2Var.a(this.b);
        s1 s1Var = this.c;
        if (s1Var != null) {
            c2Var.a(s1Var);
        }
        return new jqf(c2Var);
    }

    public r0x(gxs gxsVar, BigInteger bigInteger) {
        this(gxsVar, new l2(bigInteger));
    }

    public r0x(gxs gxsVar, l2 l2Var) {
        this.a = gxsVar;
        this.b = l2Var;
    }
}
