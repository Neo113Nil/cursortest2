package defpackage;

import java.util.Enumeration;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qm3 extends o2 {
    public w2 a;
    public gxs b;
    public l2 c;

    public static qm3 m(Object obj) {
        if (obj instanceof qm3) {
            return (qm3) obj;
        }
        if (obj == null) {
            return null;
        }
        i3 z = i3.z(obj);
        qm3 qm3Var = new qm3();
        qm3Var.a = null;
        qm3Var.b = null;
        qm3Var.c = null;
        Enumeration B = z.B();
        while (B.hasMoreElements()) {
            s3 A = s3.A(B.nextElement());
            int i = A.c;
            if (i == 0) {
                qm3Var.a = (w2) w2.b.Hg(A, false);
            } else if (i == 1) {
                qm3Var.b = new gxs((i3) i3.b.Hg(A, false));
            } else {
                if (i != 2) {
                    ny61.g("illegal tag");
                    return null;
                }
                qm3Var.c = (l2) l2.c.Hg(A, false);
            }
        }
        return qm3Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        w2 w2Var = this.a;
        if (w2Var != null) {
            c2Var.a(new oqf(false, 0, w2Var, 0));
        }
        gxs gxsVar = this.b;
        if (gxsVar != null) {
            c2Var.a(new oqf(false, 1, gxsVar, 0));
        }
        l2 l2Var = this.c;
        if (l2Var != null) {
            c2Var.a(new oqf(false, 2, l2Var, 0));
        }
        return new jqf(c2Var);
    }

    public final String toString() {
        String str;
        w2 w2Var = this.a;
        if (w2Var != null) {
            byte[] bArr = w2Var.a;
            agu aguVar = qfu.a;
            str = quu0.a(qfu.c(bArr.length, bArr));
        } else {
            str = "null";
        }
        return oyr.p("AuthorityKeyIdentifier: KeyID(", str, Extension.C_BRAKE);
    }
}
