package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class s0x extends o2 {
    public h2k a;
    public boolean b;
    public boolean c;
    public c490 w;
    public boolean x;
    public boolean y;
    public i3 z;

    public static void m(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append(Extension.TAB_CHAR);
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append(Extension.TAB_CHAR);
        stringBuffer.append(Extension.TAB_CHAR);
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static s0x n(Object obj) {
        if (obj instanceof s0x) {
            return (s0x) obj;
        }
        if (obj == null) {
            return null;
        }
        i3 z = i3.z(obj);
        s0x s0xVar = new s0x();
        s0xVar.z = z;
        for (int i = 0; i != z.size(); i++) {
            s3 A = s3.A(z.A(i));
            int i2 = A.c;
            if (i2 == 0) {
                s0xVar.a = h2k.n(A);
            } else if (i2 == 1) {
                s0xVar.b = ((w1) w1.b.Hg(A, false)).y();
            } else if (i2 == 2) {
                s0xVar.c = ((w1) w1.b.Hg(A, false)).y();
            } else if (i2 == 3) {
                s0xVar.w = new c490((s1) s1.b.Hg(A, false));
            } else if (i2 == 4) {
                s0xVar.x = ((w1) w1.b.Hg(A, false)).y();
            } else {
                if (i2 != 5) {
                    ny61.g("unknown tag in IssuingDistributionPoint");
                    return null;
                }
                s0xVar.y = ((w1) w1.b.Hg(A, false)).y();
            }
        }
        return s0xVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.z;
    }

    public final String toString() {
        String str = quu0.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(str);
        h2k h2kVar = this.a;
        if (h2kVar != null) {
            m(stringBuffer, str, "distributionPoint", h2kVar.toString());
        }
        boolean z = this.b;
        if (z) {
            m(stringBuffer, str, "onlyContainsUserCerts", z ? "true" : "false");
        }
        boolean z2 = this.c;
        if (z2) {
            m(stringBuffer, str, "onlyContainsCACerts", z2 ? "true" : "false");
        }
        c490 c490Var = this.w;
        if (c490Var != null) {
            m(stringBuffer, str, "onlySomeReasons", c490Var.f());
        }
        boolean z3 = this.y;
        if (z3) {
            m(stringBuffer, str, "onlyContainsAttributeCerts", z3 ? "true" : "false");
        }
        boolean z4 = this.x;
        if (z4) {
            m(stringBuffer, str, "indirectCRL", z4 ? "true" : "false");
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
