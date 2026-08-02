package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class y87 {
    public static final y87 a = new y87();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        a(a150.B, "DSA");
        a(a150.C, "DSA");
        a(a150.D, "DSA");
        a(a150.E, "DSA");
        a(a150.F, "DSA");
        a(a150.G, "DSA");
        a(a150.H, "DSA");
        a(a150.I, "DSA");
        a(zo60.f, "DSA");
        a(zo60.a, "RSA");
        a(zo60.c, "RSA");
        a(zo60.b, "RSA");
        a(zo60.g, "RSA");
        a(b490.U2, "RSA");
        a(b490.W2, "RSA");
        a(b490.Y2, "RSA");
        a(b490.Z2, "RSA");
        a(b490.g3, "RSA");
        a(b490.d3, "RSA");
        a(b490.e3, "RSA");
        a(b490.f3, "RSA");
        a(a150.N, "RSA");
        a(a150.O, "RSA");
        a(a150.P, "RSA");
        a(a150.Q, "RSA");
        a(xc51.a, JCP.ECDSA_NAME);
        a(xc51.c, JCP.ECDSA_NAME);
        a(xc51.d, JCP.ECDSA_NAME);
        a(xc51.e, JCP.ECDSA_NAME);
        a(xc51.f, JCP.ECDSA_NAME);
        a(a150.J, JCP.ECDSA_NAME);
        a(a150.K, JCP.ECDSA_NAME);
        a(a150.L, JCP.ECDSA_NAME);
        a(a150.M, JCP.ECDSA_NAME);
        a(xc51.h, "DSA");
        a(han.e, JCP.ECDSA_NAME);
        a(han.f, JCP.ECDSA_NAME);
        a(han.g, JCP.ECDSA_NAME);
        a(han.h, JCP.ECDSA_NAME);
        a(han.i, JCP.ECDSA_NAME);
        a(han.a, "RSA");
        a(han.b, "RSA");
        a(han.c, "RSAandMGF1");
        a(han.d, "RSAandMGF1");
        a(xc51.g, "DSA");
        a(b490.S2, "RSA");
        a(cdy0.d, "RSA");
        a(uc51.J4, "RSA");
        a(b490.c3, "RSAandMGF1");
        a(bdf.e, "GOST3410");
        a(bdf.f, "ECGOST3410");
        hashMap.put(new u2("1.3.6.1.4.1.5849.1.6.2").a, "ECGOST3410");
        hashMap.put(new u2("1.3.6.1.4.1.5849.1.1.5").a, "GOST3410");
        a(pwk0.c, "ECGOST3410-2012-256");
        a(pwk0.d, "ECGOST3410-2012-512");
        a(bdf.h, "ECGOST3410");
        a(bdf.g, "GOST3410");
        a(pwk0.e, "ECGOST3410-2012-256");
        a(pwk0.f, "ECGOST3410-2012-512");
    }

    public static void a(u2 u2Var, String str) {
        b.put(u2Var.a, str);
    }

    public static xr1 b(xr1 xr1Var, fah fahVar) {
        a2 a2Var = xr1Var.b;
        if (a2Var != null) {
            zpf zpfVar = zpf.b;
            zpfVar.getClass();
            if (zpfVar != a2Var && !zpfVar.m(a2Var.toASN1Primitive())) {
                return xr1Var;
            }
        }
        u2 u2Var = xr1Var.a;
        fahVar.getClass();
        return fah.b(u2Var);
    }

    public static ncc c(m3 m3Var) {
        if (m3Var == null) {
            return new ncc(new ArrayList());
        }
        a2[] a2VarArr = m3Var.a;
        ArrayList arrayList = new ArrayList(a2VarArr.length);
        int i = 0;
        while (i < a2VarArr.length) {
            if (i >= a2VarArr.length) {
                ny61.p();
                return null;
            }
            int i2 = i + 1;
            b3 aSN1Primitive = a2VarArr[i].toASN1Primitive();
            if (aSN1Primitive instanceof i3) {
                arrayList.add(new X509CRLHolder(m79.m(aSN1Primitive)));
            }
            i = i2;
        }
        return new ncc(arrayList);
    }

    public static ncc d(m3 m3Var) {
        if (m3Var == null) {
            return new ncc(new ArrayList());
        }
        a2[] a2VarArr = m3Var.a;
        ArrayList arrayList = new ArrayList(a2VarArr.length);
        int i = 0;
        while (i < a2VarArr.length) {
            if (i >= a2VarArr.length) {
                ny61.p();
                return null;
            }
            int i2 = i + 1;
            b3 aSN1Primitive = a2VarArr[i].toASN1Primitive();
            if (aSN1Primitive instanceof i3) {
                arrayList.add(new X509CertificateHolder(h79.m(aSN1Primitive)));
            }
            i = i2;
        }
        return new ncc(arrayList);
    }

    public static ncc e(u2 u2Var, m3 m3Var) {
        if (m3Var == null) {
            return new ncc(new ArrayList());
        }
        a2[] a2VarArr = m3Var.a;
        ArrayList arrayList = new ArrayList(a2VarArr.length);
        int i = 0;
        while (i < a2VarArr.length) {
            if (i >= a2VarArr.length) {
                ny61.p();
                return null;
            }
            int i2 = i + 1;
            b3 aSN1Primitive = a2VarArr[i].toASN1Primitive();
            if (aSN1Primitive instanceof s3) {
                s3 A = s3.A(aSN1Primitive);
                if (A.l(1)) {
                    mr80 m = mr80.m((i3) i3.b.Hg(A, false));
                    if (u2Var.q(m.a)) {
                        arrayList.add(m.b);
                    }
                }
            }
            i = i2;
        }
        return new ncc(arrayList);
    }
}
