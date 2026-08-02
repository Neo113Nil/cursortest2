package defpackage;

/* loaded from: classes4.dex */
public final class zq80 extends o2 {
    public m3 a;
    public m3 b;

    public static zq80 m(b3 b3Var) {
        if (b3Var == null) {
            return null;
        }
        i3 z = i3.z(b3Var);
        zq80 zq80Var = new zq80();
        int size = z.size();
        if (size != 0) {
            p1 p1Var = m3.c;
            if (size != 1) {
                if (size != 2) {
                    ny61.g("OriginatorInfo too big");
                    return null;
                }
                zq80Var.a = (m3) p1Var.Hg((s3) z.A(0), false);
                zq80Var.b = (m3) p1Var.Hg((s3) z.A(1), false);
                return zq80Var;
            }
            s3 s3Var = (s3) z.A(0);
            int i = s3Var.c;
            if (i != 0) {
                if (i == 1) {
                    zq80Var.b = (m3) p1Var.Hg(s3Var, false);
                    return zq80Var;
                }
                ny61.e(s3Var.c, "Bad tag in OriginatorInfo: ");
                return null;
            }
            zq80Var.a = (m3) p1Var.Hg(s3Var, false);
        }
        return zq80Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        m3 m3Var = this.a;
        if (m3Var != null) {
            c2Var.a(new oqf(false, 0, m3Var, 0));
        }
        m3 m3Var2 = this.b;
        if (m3Var2 != null) {
            c2Var.a(new oqf(false, 1, m3Var2, 0));
        }
        return new jqf(c2Var);
    }
}
