package defpackage;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import ru.CryptoPro.JCP.JCP;
import ru.domesticroots.certificatetransparency.internal.verifier.model.Version;

/* loaded from: classes4.dex */
public final class sfz {
    public final kfz a;

    public sfz(kfz kfzVar) {
        this.a = kfzVar;
    }

    public static b4x0 a(X509Certificate x509Certificate, q0x q0xVar) {
        byo byoVar = q0xVar.c;
        if (x509Certificate.getVersion() < 3) {
            ny61.g("Failed requirement.");
            return null;
        }
        i2 i2Var = new i2(x509Certificate.getEncoded());
        try {
            b4x0 b4x0Var = g79.h(i2Var.k()).b;
            fzo fzoVar = b4x0Var.E;
            if (((byo) fzoVar.a.get(new t2("2.5.29.35"))) != null && q0xVar.d && byoVar == null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ArrayList b = b(b4x0Var.E, byoVar);
            oy21 oy21Var = new oy21();
            oy21Var.b = b4x0Var.c;
            oy21Var.c = b4x0Var.w;
            ic51 ic51Var = q0xVar.a;
            if (ic51Var == null) {
                ic51Var = b4x0Var.x;
            }
            oy21Var.d = ic51Var;
            oy21Var.e = b4x0Var.y;
            oy21Var.f = b4x0Var.z;
            oy21Var.g = b4x0Var.A;
            oy21Var.h = b4x0Var.B;
            oy21Var.k = b4x0Var.C;
            oy21Var.l = b4x0Var.D;
            fzo fzoVar2 = new fzo((byo[]) b.toArray(new byo[0]));
            oy21Var.i = fzoVar2;
            byo byoVar2 = (byo) fzoVar2.a.get(byo.w);
            if (byoVar2 != null && byoVar2.b) {
                oy21Var.j = true;
            }
            b4x0 a = oy21Var.a();
            i2Var.close();
            return a;
        } finally {
        }
    }

    public static ArrayList b(fzo fzoVar, byo byoVar) {
        Vector vector = fzoVar.b;
        int size = vector.size();
        t2[] t2VarArr = new t2[size];
        for (int i = 0; i != size; i++) {
            t2VarArr[i] = (t2) vector.elementAt(i);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            t2 t2Var = t2VarArr[i2];
            if (!jl40.l(t2Var.a, "1.3.6.1.4.1.11129.2.4.3")) {
                arrayList.add(t2Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!jl40.l(((t2) next).a, "1.3.6.1.4.1.11129.2.4.2")) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            t2 t2Var2 = (t2) it2.next();
            arrayList3.add((!jl40.l(t2Var2.a, "2.5.29.35") || byoVar == null) ? (byo) fzoVar.a.get(t2Var2) : byoVar);
        }
        return arrayList3;
    }

    public static void c(ByteArrayOutputStream byteArrayOutputStream, tbs0 tbs0Var) {
        if (tbs0Var.a != Version.V1) {
            ny61.g("Can only serialize SCT v1 for now.");
            return;
        }
        lr20.f(byteArrayOutputStream, r0.getNumber(), 1);
        lr20.f(byteArrayOutputStream, 0L, 1);
        lr20.f(byteArrayOutputStream, tbs0Var.c, 8);
    }

    public static byte[] d(Certificate certificate, tbs0 tbs0Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c(byteArrayOutputStream, tbs0Var);
            lr20.f(byteArrayOutputStream, 0L, 2);
            lr20.g(16777215, byteArrayOutputStream, certificate.getEncoded());
            lr20.g(65535, byteArrayOutputStream, tbs0Var.e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, tbs0 tbs0Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c(byteArrayOutputStream, tbs0Var);
            lr20.f(byteArrayOutputStream, 1L, 2);
            byteArrayOutputStream.write(bArr2);
            lr20.g(16777215, byteArrayOutputStream, bArr);
            lr20.g(65535, byteArrayOutputStream, tbs0Var.e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }

    public final g5b1 f(tbs0 tbs0Var, byte[] bArr) {
        String str;
        kfz kfzVar = this.a;
        PublicKey publicKey = kfzVar.a;
        PublicKey publicKey2 = kfzVar.a;
        if (jl40.l(publicKey.getAlgorithm(), "EC")) {
            str = JCP.SIGN_SHA256_ECDSA_NAME;
        } else {
            if (!jl40.l(publicKey2.getAlgorithm(), "RSA")) {
                return new j521(publicKey2.getAlgorithm(), null);
            }
            str = JCP.SIGN_SHA256_RSA_NAME;
        }
        try {
            Signature signature = Signature.getInstance(str);
            signature.initVerify(publicKey2);
            signature.update(bArr);
            return signature.verify(tbs0Var.d.c) ? klp0.a : flp0.b;
        } catch (InvalidKeyException e) {
            return new hfz(e);
        } catch (NoSuchAlgorithmException e2) {
            return new j521(str, e2);
        } catch (SignatureException e3) {
            return new rbs0(e3);
        }
    }

    public final g5b1 g(tbs0 tbs0Var, List list) {
        q0x q0xVar;
        List<String> extendedKeyUsage;
        Set<String> criticalExtensionOIDs;
        byte[] bArr = tbs0Var.b.a;
        long currentTimeMillis = System.currentTimeMillis();
        long j = tbs0Var.c;
        if (j > currentTimeMillis) {
            return new hlp0(j, currentTimeMillis);
        }
        kfz kfzVar = this.a;
        Long l = kfzVar.b;
        byte[] bArr2 = kfzVar.c;
        if (l != null && j > l.longValue()) {
            return new ilp0(j, kfzVar.b.longValue());
        }
        if (!Arrays.equals(bArr2, bArr)) {
            return new mez(Base64.encodeToString(bArr, 0), Base64.encodeToString(bArr2, 0));
        }
        Certificate certificate = (Certificate) list.get(0);
        if ((!(certificate instanceof X509Certificate) || (criticalExtensionOIDs = ((X509Certificate) certificate).getCriticalExtensionOIDs()) == null || !criticalExtensionOIDs.contains("1.3.6.1.4.1.11129.2.4.3")) && !vgb1.c(certificate)) {
            try {
                return f(tbs0Var, d(certificate, tbs0Var));
            } catch (IOException e) {
                return new k79(e);
            } catch (CertificateEncodingException e2) {
                return new k79(e2);
            }
        }
        if (list.size() < 2) {
            return ec60.a;
        }
        Certificate certificate2 = (Certificate) list.get(1);
        try {
            try {
                try {
                    if ((certificate2 instanceof X509Certificate) && (extendedKeyUsage = ((X509Certificate) certificate2).getExtendedKeyUsage()) != null) {
                        if (extendedKeyUsage.contains("1.3.6.1.4.1.11129.2.4.4")) {
                            if (list.size() < 3) {
                                return fc60.a;
                            }
                            try {
                                q0xVar = vgb1.e(certificate2, (Certificate) list.get(2));
                                return f(tbs0Var, e(a((X509Certificate) certificate, q0xVar).g(), q0xVar.b, tbs0Var));
                            } catch (IOException e3) {
                                return new z2(e3);
                            } catch (NoSuchAlgorithmException e4) {
                                return new j521(JCP.DIGEST_SHA_256, e4);
                            } catch (CertificateEncodingException e5) {
                                return new k79(e5);
                            }
                        }
                    }
                    return f(tbs0Var, e(a((X509Certificate) certificate, q0xVar).g(), q0xVar.b, tbs0Var));
                } catch (IOException e6) {
                    return new k79(e6);
                } catch (CertificateException e7) {
                    return new k79(e7);
                }
                q0xVar = new q0x(null, aba1.d(certificate2.getPublicKey()), null, false);
            } catch (NoSuchAlgorithmException e8) {
                return new j521(JCP.DIGEST_SHA_256, e8);
            }
        } catch (CertificateParsingException e9) {
            return new n79(e9);
        }
    }
}
