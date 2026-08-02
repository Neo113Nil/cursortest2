package ru.CryptoPro.ssl;

import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Collection;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLHandshakeException;
import ru.CryptoPro.JCP.Key.MasterSecretInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.ssl.util.ParamUtil;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
final class cl_50 extends cl_47 {
    public final byte[] b;
    public final cl_84 c;
    public final cl_109 d;
    public final boolean e;

    public cl_50(cl_84 cl_84Var, cl_45 cl_45Var, PrivateKey privateKey, SecretKey secretKey, SecureRandom secureRandom, cl_109 cl_109Var) {
        Signature e;
        this.d = null;
        this.c = cl_84Var;
        boolean z = secretKey instanceof MasterSecretInterface;
        this.e = z;
        String resolveSignatureAlgorithmByKey = z ? ParamUtil.resolveSignatureAlgorithmByKey(privateKey) : privateKey.getAlgorithm();
        if (cl_84Var.n >= cl_84.z.n) {
            this.d = cl_109Var;
            e = cl_73.e(cl_109Var.c);
        } else {
            e = e(resolveSignatureAlgorithmByKey);
        }
        e.initSign(privateKey, secureRandom);
        privateKey.getAlgorithm();
        if (z) {
            byte[] byteArray = cl_45Var.b.toByteArray();
            e.update(byteArray, 0, byteArray.length);
        }
        try {
            byte[] sign = e.sign();
            this.b = sign;
            if (z) {
                Array.invByteOrder(sign);
            }
        } catch (Exception e2) {
            if (ParamUtil.isCSPLicenseExpired(e2)) {
                throw new GeneralSecurityException("Invalid CSP license.", e2);
            }
            if (ParamUtil.isCSPUserCancelled(e2)) {
                throw new GeneralSecurityException("User cancelled operation.", e2);
            }
            if (!(e2 instanceof GeneralSecurityException)) {
                throw new GeneralSecurityException(e2);
            }
            throw e2;
        }
    }

    public static Signature e(String str) {
        if (str.equals("RSA")) {
            int i = cl_86.e;
            return Signature.getInstance("MD5andSHA1withRSA", "JTLS");
        }
        if (str.equals("DSA")) {
            return cl_73.e("RawDSA");
        }
        if (str.equals("EC")) {
            return cl_73.e("NONEwithECDSA");
        }
        if (str.contains("GOST3410")) {
            return cl_73.e(str);
        }
        throw new SignatureException("Unrecognized algorithm: ".concat(str));
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        cl_84 cl_84Var = this.c;
        int i = cl_84Var.n;
        cl_84 cl_84Var2 = cl_84.z;
        if (i >= cl_84Var2.n) {
            cl_109 cl_109Var = this.d;
            cl_62Var.a(cl_109Var.a());
            cl_62Var.a(cl_109Var.b & 255);
        }
        boolean z = this.e;
        byte[] bArr = this.b;
        if (!z) {
            cl_62Var.b(bArr);
        } else if (TLSSettings.getTlsClientStrictCertVerify() || cl_84Var.n >= cl_84Var2.n) {
            cl_62Var.b(bArr);
        } else {
            cl_62Var.write(bArr);
        }
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        int i;
        cl_84 cl_84Var = this.c;
        int i2 = cl_84Var.n;
        cl_84 cl_84Var2 = cl_84.z;
        if (i2 >= cl_84Var2.n) {
            Set set = cl_109.e;
            i = 4;
        } else {
            i = 2;
        }
        if (this.e && !TLSSettings.getTlsClientStrictCertVerify() && cl_84Var.n < cl_84Var2.n) {
            i -= 2;
        }
        return i + this.b.length;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** CertificateVerify\n");
        if (this.c.n >= cl_84.z.n) {
            stringBuffer.append("Signature Algorithm ");
            stringBuffer.append(this.d.c);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public final boolean g(cl_84 cl_84Var, cl_45 cl_45Var, PublicKey publicKey) {
        String algorithm = publicKey.getAlgorithm();
        boolean z = this.e;
        if (z) {
            algorithm = ParamUtil.resolveSignatureAlgorithmByKey(publicKey);
        }
        Signature e = cl_84Var.n >= cl_84.z.n ? cl_73.e(this.d.c) : e(algorithm);
        e.initVerify(publicKey);
        publicKey.getAlgorithm();
        if (z) {
            byte[] byteArray = cl_45Var.b.toByteArray();
            e.update(byteArray, 0, byteArray.length);
        }
        return e.verify(this.b);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int a() {
        return 15;
    }

    public cl_50(cl_46 cl_46Var, int i, boolean z, Collection collection, cl_84 cl_84Var) {
        this.d = null;
        this.c = cl_84Var;
        this.e = z;
        int i2 = cl_84Var.n;
        cl_84 cl_84Var2 = cl_84.z;
        if (i2 >= cl_84Var2.n) {
            cl_109 c = cl_109.c(cl_46Var.c(), cl_46Var.c(), 0);
            this.d = c;
            if (!collection.contains(c)) {
                throw new SSLHandshakeException("Unsupported SignatureAndHashAlgorithm in CertificateVerify message: " + c);
            }
        }
        if (!z) {
            this.b = cl_46Var.g();
            return;
        }
        if (cl_84Var.n >= cl_84Var2.n) {
            this.b = cl_46Var.g();
        } else {
            this.b = cl_46Var.b(i);
        }
        Array.invByteOrder(this.b);
    }
}
