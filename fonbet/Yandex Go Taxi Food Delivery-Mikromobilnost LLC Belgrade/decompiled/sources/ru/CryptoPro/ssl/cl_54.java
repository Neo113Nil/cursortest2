package ru.CryptoPro.ssl;

import defpackage.ds61;
import defpackage.oyr;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Collection;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
final class cl_54 extends cl_61 {
    public final int b;
    public final byte[] c;
    public final byte[] d;
    public final ECPublicKey e;
    public final cl_84 f;
    public final cl_109 g;

    public cl_54(cl_46 cl_46Var, PublicKey publicKey, byte[] bArr, byte[] bArr2, Collection collection, cl_84 cl_84Var) {
        this.f = cl_84Var;
        int c = cl_46Var.c();
        if (c != 3) {
            throw new SSLHandshakeException(oyr.i(c, "Unsupported ECCurveType: "));
        }
        int d = cl_46Var.d();
        this.b = d;
        if (!cl_26.d(d)) {
            throw new SSLHandshakeException(oyr.i(d, "Unsupported curveId: "));
        }
        String str = (String) cl_26.h.get(Integer.valueOf(d));
        if (str == null) {
            throw new SSLHandshakeException(oyr.i(d, "Unknown named curve: "));
        }
        boolean z = cl_73.a;
        ECParameterSpec a = ds61.a(str);
        if (a == null) {
            throw new SSLHandshakeException("Unsupported curve: ".concat(str));
        }
        byte[] n = cl_46Var.n();
        this.c = n;
        this.e = (ECPublicKey) KeyFactory.getInstance("EC", cl_73.g("EC")).generatePublic(new ECPublicKeySpec(cl_73.b(n, a.getCurve()), a));
        if (publicKey == null) {
            return;
        }
        int i = cl_84Var.n;
        cl_84 cl_84Var2 = cl_84.z;
        if (i >= cl_84Var2.n) {
            cl_109 c2 = cl_109.c(cl_46Var.c(), cl_46Var.c(), 0);
            this.g = c2;
            if (!collection.contains(c2)) {
                throw new SSLHandshakeException("Unsupported SignatureAndHashAlgorithm in ServerKeyExchange message: " + c2);
            }
        }
        byte[] g = cl_46Var.g();
        this.d = g;
        Signature e = cl_84Var.n >= cl_84Var2.n ? cl_73.e(this.g.c) : e(publicKey.getAlgorithm());
        e.initVerify(publicKey);
        g(e, bArr, bArr2);
        if (!e.verify(g)) {
            throw new SSLKeyException("Invalid signature on ECDH server key exchange message");
        }
    }

    public static Signature e(String str) {
        str.getClass();
        if (str.equals("EC")) {
            return cl_73.e(JCP.SIGN_SHA1_ECDSA_NAME);
        }
        if (!str.equals("RSA")) {
            throw new NoSuchAlgorithmException("neither an RSA or a EC key : ".concat(str));
        }
        int i = cl_86.e;
        return cl_73.e("MD5andSHA1withRSA");
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        cl_62Var.a(3);
        cl_62Var.e(this.b);
        cl_62Var.d(this.c);
        byte[] bArr = this.d;
        if (bArr != null) {
            if (this.f.n >= cl_84.z.n) {
                cl_109 cl_109Var = this.g;
                cl_62Var.a(cl_109Var.a());
                cl_62Var.a(cl_109Var.b & 255);
            }
            cl_62Var.b(bArr);
        }
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        int i;
        byte[] bArr = this.d;
        if (bArr != null) {
            int length = bArr.length;
            i = length + 2;
            if (this.f.n >= cl_84.z.n) {
                Set set = cl_109.e;
                i = length + 4;
            }
        } else {
            i = 0;
        }
        return this.c.length + 4 + i;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** ECDH ServerKeyExchange\n");
        if (this.d == null) {
            stringBuffer.append("Anonymous\n");
        } else if (this.f.n >= cl_84.z.n) {
            stringBuffer.append("Signature Algorithm ");
            stringBuffer.append(this.g.c);
            stringBuffer.append("\n");
        }
        stringBuffer.append("Server key: ");
        stringBuffer.append(this.e);
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public final void g(Signature signature, byte[] bArr, byte[] bArr2) {
        signature.update(bArr);
        signature.update(bArr2);
        signature.update((byte) 3);
        int i = this.b;
        signature.update((byte) (i >> 8));
        signature.update((byte) i);
        byte[] bArr3 = this.c;
        signature.update((byte) bArr3.length);
        signature.update(bArr3);
    }

    public cl_54(cl_25 cl_25Var, PrivateKey privateKey, byte[] bArr, byte[] bArr2, SecureRandom secureRandom, cl_109 cl_109Var, cl_84 cl_84Var) {
        Signature e;
        this.f = cl_84Var;
        ECPublicKey eCPublicKey = cl_25Var.b;
        this.e = eCPublicKey;
        ECParameterSpec params = eCPublicKey.getParams();
        this.c = cl_73.d(eCPublicKey.getW(), params.getCurve());
        this.b = cl_26.c(params);
        if (privateKey == null) {
            return;
        }
        if (cl_84Var.n >= cl_84.z.n) {
            this.g = cl_109Var;
            e = cl_73.e(cl_109Var.c);
        } else {
            e = e(privateKey.getAlgorithm());
        }
        e.initSign(privateKey, secureRandom);
        g(e, bArr, bArr2);
        this.d = e.sign();
    }
}
