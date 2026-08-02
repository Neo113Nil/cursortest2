package defpackage;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes4.dex */
public final class yc70 {
    public static final HashMap b;
    public static final jkh c;
    public final b8x a;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        c = new jkh();
        hashMap.put(zo60.e, JCP.DIGEST_SHA1);
        hashMap.put(a150.d, JCP.DIGEST_SHA224);
        hashMap.put(a150.a, JCP.DIGEST_SHA256);
        hashMap.put(a150.b, JCP.DIGEST_SHA384);
        hashMap.put(a150.c, JCP.DIGEST_SHA512);
        hashMap.put(cdy0.b, "RIPEMD128");
        hashMap.put(cdy0.a, "RIPEMD160");
        hashMap.put(cdy0.c, "RIPEMD256");
        hashMap2.put(b490.S2, "RSA/ECB/PKCS1Padding");
        hashMap2.put(zo60.h, "Elgamal/ECB/PKCS1Padding");
        hashMap2.put(b490.a3, "RSA/ECB/OAEPPadding");
        hashMap2.put(bdf.f, "ECGOST3410");
        u2 u2Var = b490.D3;
        hashMap3.put(u2Var, "DESEDEWrap");
        hashMap3.put(b490.E3, "RC2Wrap");
        u2 u2Var2 = a150.q;
        hashMap3.put(u2Var2, "AESWrap");
        u2 u2Var3 = a150.u;
        hashMap3.put(u2Var3, "AESWrap");
        u2 u2Var4 = a150.y;
        hashMap3.put(u2Var4, "AESWrap");
        u2 u2Var5 = b150.d;
        hashMap3.put(u2Var5, "CamelliaWrap");
        u2 u2Var6 = b150.e;
        hashMap3.put(u2Var6, "CamelliaWrap");
        u2 u2Var7 = b150.f;
        hashMap3.put(u2Var7, "CamelliaWrap");
        u2 u2Var8 = ufx.b;
        hashMap3.put(u2Var8, "SEEDWrap");
        u2 u2Var9 = b490.j3;
        hashMap3.put(u2Var9, "DESede");
        hashMap5.put(u2Var, 192);
        hashMap5.put(u2Var2, 128);
        hashMap5.put(u2Var3, 192);
        hashMap5.put(u2Var4, 256);
        hashMap5.put(u2Var5, 128);
        hashMap5.put(u2Var6, 192);
        hashMap5.put(u2Var7, 256);
        hashMap5.put(u2Var8, 128);
        hashMap5.put(u2Var9, 192);
        hashMap4.put(a150.o, JCSP.AES_NAME);
        hashMap4.put(a150.p, JCSP.AES_NAME);
        hashMap4.put(a150.t, JCSP.AES_NAME);
        hashMap4.put(a150.x, JCSP.AES_NAME);
        hashMap4.put(u2Var9, "DESede");
        hashMap4.put(b490.k3, "RC2");
    }

    public yc70(b8x b8xVar) {
        this.a = b8xVar;
    }

    public static String d(xr1 xr1Var) {
        c.getClass();
        a2 a2Var = xr1Var.b;
        u2 u2Var = xr1Var.a;
        if (a2Var != null) {
            zpf zpfVar = zpf.b;
            zpfVar.getClass();
            if (zpfVar != a2Var && !zpfVar.m(a2Var.toASN1Primitive()) && u2Var.q(b490.c3)) {
                x4i0 m = x4i0.m(a2Var);
                xr1 xr1Var2 = m.b;
                boolean q = xr1Var2.a.q(b490.b3);
                xr1 xr1Var3 = m.a;
                if (!q) {
                    return jkh.a(xr1Var3.a) + "WITHRSAAND" + xr1Var2.a.a;
                }
                u2 u2Var2 = xr1.m(xr1Var2.b).a;
                boolean q2 = u2Var2.q(xr1Var3.a);
                u2 u2Var3 = xr1Var3.a;
                if (q2) {
                    return jkh.a(u2Var3) + "WITHRSAANDMGF1";
                }
                return jkh.a(u2Var3) + "WITHRSAANDMGF1USING" + jkh.a(u2Var2);
            }
        }
        HashMap hashMap = jkh.a;
        return hashMap.containsKey(u2Var) ? (String) hashMap.get(u2Var) : u2Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [b8x] */
    /* JADX WARN: Type inference failed for: r5v2, types: [b8x] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.security.MessageDigest] */
    public final MessageDigest a(xr1 xr1Var) {
        String str;
        ?? r5 = this.a;
        try {
            u2 u2Var = xr1Var.a;
            a2 a2Var = xr1Var.b;
            if (u2Var.q(a150.n)) {
                str = "SHAKE256-" + l2.u(a2Var).x();
            } else if (u2Var.q(a150.m)) {
                str = "SHAKE128-" + l2.u(a2Var).x();
            } else {
                str = (String) bt10.a.get(u2Var);
                if (str == null) {
                    str = u2Var.a;
                }
            }
            r5 = r5.c(str);
            return r5;
        } catch (NoSuchAlgorithmException e) {
            u2 u2Var2 = xr1Var.a;
            HashMap hashMap = b;
            if (hashMap.get(u2Var2) != null) {
                return r5.c((String) hashMap.get(xr1Var.a));
            }
            throw e;
        }
    }

    public final Signature b(xr1 xr1Var) {
        b8x b8xVar = this.a;
        try {
            String d = d(xr1Var);
            String concat = JCP.RAW_PREFIX.concat(d.substring(d.indexOf("WITH")));
            Signature g = b8xVar.g(concat);
            if (xr1Var.a.q(b490.c3)) {
                AlgorithmParameters b2 = b8xVar.b(concat);
                a2 a2Var = xr1Var.b;
                try {
                    b2.init(a2Var.toASN1Primitive().getEncoded(), "ASN.1");
                } catch (Exception unused) {
                    b2.init(a2Var.toASN1Primitive().getEncoded());
                }
                g.setParameter((PSSParameterSpec) b2.getParameterSpec(PSSParameterSpec.class));
            }
            return g;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r2.c.x().intValue() != a(r4).getDigestLength()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Signature c(xr1 xr1Var) {
        Signature g;
        i3 z;
        b8x b8xVar = this.a;
        String d = d(xr1Var);
        try {
            g = b8xVar.g(d);
        } catch (NoSuchAlgorithmException e) {
            if (!d.endsWith("WITHRSAANDMGF1")) {
                throw e;
            }
            g = b8xVar.g(d.substring(0, d.indexOf(87)).concat("WITHRSASSA-PSS"));
        }
        if (xr1Var.a.q(b490.c3) && (z = i3.z(xr1Var.b)) != null && z.size() != 0) {
            x4i0 m = x4i0.m(z);
            xr1 xr1Var2 = m.b;
            xr1 xr1Var3 = m.a;
            if (xr1Var2.a.q(b490.b3) && xr1Var3.equals(xr1.m(m.b.b))) {
            }
            try {
                AlgorithmParameters b2 = b8xVar.b("PSS");
                b2.init(z.getEncoded());
                g.setParameter(b2.getParameterSpec(PSSParameterSpec.class));
            } catch (IOException e2) {
                throw new GeneralSecurityException(x4e.d(e2, new StringBuilder("unable to process PSS parameters: ")));
            }
        }
        return g;
    }
}
