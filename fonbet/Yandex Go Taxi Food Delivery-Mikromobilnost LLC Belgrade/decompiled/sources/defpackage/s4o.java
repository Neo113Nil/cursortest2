package defpackage;

/* loaded from: classes4.dex */
public final class s4o extends o2 {
    public l2 a;
    public zq80 b = null;
    public m3 c;
    public szn w;
    public m3 x;

    public s4o(lqf lqfVar, szn sznVar, rd4 rd4Var) {
        this.a = new l2(m(lqfVar, rd4Var));
        this.c = lqfVar;
        this.w = sznVar;
        this.x = rd4Var;
    }

    public static int m(m3 m3Var, m3 m3Var2) {
        l2 l2Var;
        a2[] a2VarArr = m3Var.a;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (i < a2VarArr.length) {
            if (i >= a2VarArr.length) {
                ny61.p();
                return 0;
            }
            int i2 = i + 1;
            ngi0 n = ngi0.n(a2VarArr[i]);
            o2 o2Var = n.a;
            if (o2Var instanceof s3) {
                s3 s3Var = (s3) o2Var;
                int i3 = s3Var.c;
                if (i3 == 1) {
                    l2Var = phx.m(s3Var).a;
                } else if (i3 == 2) {
                    l2Var = (s3Var.C() ? pfx.m(s3Var, true) : pfx.m(s3Var, false)).a;
                } else if (i3 == 3) {
                    l2Var = wp90.m(s3Var).a;
                } else {
                    if (i3 != 4) {
                        ny61.r("unknown tag");
                        return 0;
                    }
                    l2Var = new l2(0L);
                }
            } else {
                l2Var = njx.m(o2Var).a;
            }
            if (!l2Var.y(0)) {
                z2 = true;
            }
            a2 m = n.m();
            if ((m instanceof wp90) || (m instanceof jr80)) {
                z = true;
            }
            i = i2;
        }
        if (z) {
            return 3;
        }
        return (!z2 && m3Var2 == null) ? 0 : 2;
    }

    public static s4o n(Object obj) {
        int i;
        if (obj instanceof s4o) {
            return (s4o) obj;
        }
        szn sznVar = null;
        if (obj == null) {
            return null;
        }
        i3 z = i3.z(obj);
        s4o s4oVar = new s4o();
        s4oVar.a = (l2) z.A(0);
        a2 A = z.A(1);
        if (A instanceof s3) {
            s4oVar.b = zq80.m((i3) i3.b.Hg((s3) A, false));
            A = z.A(2);
            i = 3;
        } else {
            i = 2;
        }
        s4oVar.c = m3.x(A);
        int i2 = i + 1;
        a2 A2 = z.A(i);
        if (A2 instanceof szn) {
            sznVar = (szn) A2;
        } else if (A2 != null) {
            i3 z2 = i3.z(A2);
            szn sznVar2 = new szn();
            if (z2.size() < 2) {
                ny61.g("Truncated Sequence Found");
                return null;
            }
            sznVar2.a = (u2) z2.A(0);
            sznVar2.b = xr1.m(z2.A(1));
            if (z2.size() > 2) {
                sznVar2.c = w2.u((s3) z2.A(2), false);
            }
            sznVar = sznVar2;
        }
        s4oVar.w = sznVar;
        if (z.size() > i2) {
            s4oVar.x = (m3) m3.c.Hg((s3) z.A(i2), false);
        }
        return s4oVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(5);
        c2Var.a(this.a);
        zq80 zq80Var = this.b;
        if (zq80Var != null) {
            c2Var.a(new oqf(false, 0, zq80Var, 0));
        }
        c2Var.a(this.c);
        c2Var.a(this.w);
        m3 m3Var = this.x;
        if (m3Var != null) {
            c2Var.a(new oqf(false, 1, m3Var, 0));
        }
        return new nd4(c2Var);
    }
}
