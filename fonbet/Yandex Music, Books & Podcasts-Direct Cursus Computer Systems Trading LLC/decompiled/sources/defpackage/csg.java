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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class csg {
    public final urg a;

    public csg(urg urgVar) {
        urgVar.getClass();
        this.a = urgVar;
    }

    public static i0s a(X509Certificate x509Certificate, yye yyeVar) {
        p0c p0cVar = yyeVar.c;
        if (x509Certificate.getVersion() < 3) {
            xq0.x("Failed requirement.");
            return null;
        }
        i0 i0Var = new i0(x509Certificate.getEncoded());
        try {
            da4 t = da4.t(i0Var.z());
            t.getClass();
            i0s i0sVar = t.b;
            l1c l1cVar = i0sVar.l;
            if (((p0c) l1cVar.a.get(new n0("2.5.29.35"))) != null && yyeVar.d && p0cVar == null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            l1c l1cVar2 = i0sVar.l;
            l1cVar2.getClass();
            ArrayList b = b(l1cVar2, p0cVar);
            nwh nwhVar = new nwh();
            nwhVar.b = new ki2(true, 0, new j0(2L), 1);
            nwhVar.c = i0sVar.c;
            nwhVar.d = i0sVar.d;
            q6w q6wVar = yyeVar.a;
            if (q6wVar == null) {
                q6wVar = i0sVar.e;
            }
            nwhVar.e = q6wVar;
            nwhVar.f = i0sVar.f;
            nwhVar.g = i0sVar.g;
            nwhVar.h = i0sVar.h;
            nwhVar.i = i0sVar.i;
            nwhVar.k = i0sVar.j;
            nwhVar.l = i0sVar.k;
            l1c l1cVar3 = new l1c((p0c[]) b.toArray(new p0c[0]));
            nwhVar.j = l1cVar3;
            p0c p0cVar2 = (p0c) l1cVar3.a.get(p0c.d);
            if (p0cVar2 != null && p0cVar2.b) {
                nwhVar.a = true;
            }
            i0s o = nwhVar.o();
            i0Var.close();
            o.getClass();
            return o;
        } finally {
        }
    }

    public static ArrayList b(l1c l1cVar, p0c p0cVar) {
        Vector vector = l1cVar.b;
        int size = vector.size();
        n0[] n0VarArr = new n0[size];
        for (int i = 0; i != size; i++) {
            n0VarArr[i] = (n0) vector.elementAt(i);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            n0 n0Var = n0VarArr[i2];
            if (!Intrinsics.d(n0Var.a, "1.3.6.1.4.1.11129.2.4.3")) {
                arrayList.add(n0Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!Intrinsics.d(((n0) next).a, "1.3.6.1.4.1.11129.2.4.2")) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            n0 n0Var2 = (n0) it2.next();
            arrayList3.add((!Intrinsics.d(n0Var2.a, "2.5.29.35") || p0cVar == null) ? (p0c) l1cVar.a.get(n0Var2) : p0cVar);
        }
        return arrayList3;
    }

    public static void c(ByteArrayOutputStream byteArrayOutputStream, yfq yfqVar) {
        if (yfqVar.a != r0u.V1) {
            xq0.x("Can only serialize SCT v1 for now.");
            return;
        }
        gdg.O(byteArrayOutputStream, r0.a, 1);
        gdg.O(byteArrayOutputStream, 0L, 1);
        gdg.O(byteArrayOutputStream, yfqVar.c, 8);
    }

    public static byte[] d(Certificate certificate, yfq yfqVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c(byteArrayOutputStream, yfqVar);
            gdg.O(byteArrayOutputStream, 0L, 2);
            byte[] encoded = certificate.getEncoded();
            encoded.getClass();
            gdg.P(byteArrayOutputStream, encoded, 16777215);
            gdg.P(byteArrayOutputStream, yfqVar.e, 65535);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            byteArray.getClass();
            return byteArray;
        } finally {
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, yfq yfqVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c(byteArrayOutputStream, yfqVar);
            gdg.O(byteArrayOutputStream, 1L, 2);
            byteArrayOutputStream.write(bArr2);
            gdg.P(byteArrayOutputStream, bArr, 16777215);
            gdg.P(byteArrayOutputStream, yfqVar.e, 65535);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            byteArray.getClass();
            return byteArray;
        } finally {
        }
    }

    public final avf f(yfq yfqVar, byte[] bArr) {
        String str;
        urg urgVar = this.a;
        PublicKey publicKey = urgVar.a;
        PublicKey publicKey2 = urgVar.a;
        if (Intrinsics.d(publicKey.getAlgorithm(), "EC")) {
            str = "SHA256withECDSA";
        } else {
            if (!Intrinsics.d(publicKey2.getAlgorithm(), "RSA")) {
                String algorithm = publicKey2.getAlgorithm();
                algorithm.getClass();
                return new mmt(algorithm, null);
            }
            str = "SHA256withRSA";
        }
        try {
            Signature signature = Signature.getInstance(str);
            signature.initVerify(publicKey2);
            signature.update(bArr);
            return signature.verify(yfqVar.d.c) ? ryo.c : nyo.d;
        } catch (InvalidKeyException e) {
            return new srg(e);
        } catch (NoSuchAlgorithmException e2) {
            return new mmt(str, e2);
        } catch (SignatureException e3) {
            return new vfq(e3);
        }
    }

    public final avf g(yfq yfqVar, List list) {
        Set<String> nonCriticalExtensionOIDs;
        yye yyeVar;
        List<String> extendedKeyUsage;
        Set<String> criticalExtensionOIDs;
        yfqVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j = yfqVar.c;
        byte[] bArr = yfqVar.b.a;
        if (j > currentTimeMillis) {
            return new oyo(j, currentTimeMillis);
        }
        urg urgVar = this.a;
        Long l = urgVar.b;
        byte[] bArr2 = urgVar.c;
        if (l != null && j > l.longValue()) {
            return new pyo(j, urgVar.b.longValue());
        }
        if (!Arrays.equals(bArr2, bArr)) {
            String encodeToString = Base64.encodeToString(bArr, 0);
            encodeToString.getClass();
            String encodeToString2 = Base64.encodeToString(bArr2, 0);
            encodeToString2.getClass();
            return new frg(encodeToString, encodeToString2);
        }
        Certificate certificate = (Certificate) list.get(0);
        certificate.getClass();
        boolean z = certificate instanceof X509Certificate;
        if ((!z || (criticalExtensionOIDs = ((X509Certificate) certificate).getCriticalExtensionOIDs()) == null || !criticalExtensionOIDs.contains("1.3.6.1.4.1.11129.2.4.3")) && (!z || (nonCriticalExtensionOIDs = ((X509Certificate) certificate).getNonCriticalExtensionOIDs()) == null || !nonCriticalExtensionOIDs.contains("1.3.6.1.4.1.11129.2.4.2"))) {
            try {
                return f(yfqVar, d(certificate, yfqVar));
            } catch (IOException e) {
                return new fa4(e);
            } catch (CertificateEncodingException e2) {
                return new fa4(e2);
            }
        }
        if (list.size() < 2) {
            return u6j.d;
        }
        Certificate certificate2 = (Certificate) list.get(1);
        try {
            certificate2.getClass();
            try {
                try {
                    if ((certificate2 instanceof X509Certificate) && (extendedKeyUsage = ((X509Certificate) certificate2).getExtendedKeyUsage()) != null) {
                        if (extendedKeyUsage.contains("1.3.6.1.4.1.11129.2.4.4")) {
                            if (list.size() < 3) {
                                return u6j.e;
                            }
                            try {
                                yyeVar = ltg.G(certificate2, (Certificate) list.get(2));
                                byte[] r = a((X509Certificate) certificate, yyeVar).r();
                                r.getClass();
                                return f(yfqVar, e(r, yyeVar.b, yfqVar));
                            } catch (IOException e3) {
                                return new r0(e3);
                            } catch (NoSuchAlgorithmException e4) {
                                return new mmt("SHA-256", e4);
                            } catch (CertificateEncodingException e5) {
                                return new fa4(e5);
                            }
                        }
                    }
                    byte[] r2 = a((X509Certificate) certificate, yyeVar).r();
                    r2.getClass();
                    return f(yfqVar, e(r2, yyeVar.b, yfqVar));
                } catch (IOException e6) {
                    return new fa4(e6);
                } catch (CertificateException e7) {
                    return new fa4(e7);
                }
                PublicKey publicKey = certificate2.getPublicKey();
                publicKey.getClass();
                byte[] encoded = publicKey.getEncoded();
                int length = publicKey.getEncoded().length;
                pn3 pn3Var = pn3.d;
                yyeVar = new yye(null, ovn.L(length, encoded).c("SHA-256").t(), null, false);
            } catch (NoSuchAlgorithmException e8) {
                return new mmt("SHA-256", e8);
            }
        } catch (CertificateParsingException e9) {
            return new ga4(e9);
        }
    }
}
