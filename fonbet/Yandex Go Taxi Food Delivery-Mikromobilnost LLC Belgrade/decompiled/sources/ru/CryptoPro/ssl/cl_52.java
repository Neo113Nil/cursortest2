package ru.CryptoPro.ssl;

import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.Collection;
import java.util.Set;
import javax.crypto.spec.DHPublicKeySpec;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.ssl.util.KeyUtil;

/* loaded from: classes4.dex */
final class cl_52 extends cl_61 {
    public static final boolean h = GetProperty.getBooleanProperty("com.sun.net.ssl.dhKeyExchangeFix", true);
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public cl_84 f;
    public cl_109 g;

    public cl_52(cl_46 cl_46Var, PublicKey publicKey, byte[] bArr, byte[] bArr2, int i, Collection collection, cl_84 cl_84Var) {
        byte[] bArr3;
        Signature e;
        this.f = cl_84Var;
        this.b = cl_46Var.g();
        this.c = cl_46Var.g();
        this.d = cl_46Var.g();
        KeyUtil.validate(new DHPublicKeySpec(new BigInteger(1, this.d), new BigInteger(1, this.b), new BigInteger(1, this.c)));
        int i2 = cl_84Var.n;
        cl_84 cl_84Var2 = cl_84.z;
        if (i2 >= cl_84Var2.n) {
            cl_109 c = cl_109.c(cl_46Var.c(), cl_46Var.c(), 0);
            this.g = c;
            if (!collection.contains(c)) {
                throw new SSLHandshakeException("Unsupported SignatureAndHashAlgorithm in ServerKeyExchange message: " + c);
            }
        } else {
            this.g = null;
        }
        if (h) {
            bArr3 = cl_46Var.g();
        } else {
            byte[] bArr4 = new byte[((i - (this.b.length + 2)) - (this.c.length + 2)) - (this.d.length + 2)];
            cl_46Var.read(bArr4);
            bArr3 = bArr4;
        }
        String algorithm = publicKey.getAlgorithm();
        if (cl_84Var.n >= cl_84Var2.n) {
            e = cl_73.e(this.g.c);
        } else {
            algorithm.getClass();
            if (algorithm.equals("DSA")) {
                e = cl_73.e("DSA");
            } else {
                if (!algorithm.equals("RSA")) {
                    throw new SSLKeyException("neither an RSA or a DSA key: ".concat(algorithm));
                }
                int i3 = cl_86.e;
                e = cl_73.e("MD5andSHA1withRSA");
            }
        }
        e.initVerify(publicKey);
        e(e, bArr, bArr2);
        if (!e.verify(bArr3)) {
            throw new SSLKeyException("Server D-H key verification failed");
        }
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        cl_109 cl_109Var = this.g;
        cl_62Var.b(this.b);
        cl_62Var.b(this.c);
        cl_62Var.b(this.d);
        byte[] bArr = this.e;
        if (bArr != null) {
            if (this.f.n >= cl_84.z.n) {
                cl_62Var.a(cl_109Var.a());
                cl_62Var.a(cl_109Var.b & 255);
            }
            if (h) {
                cl_62Var.b(bArr);
            } else {
                cl_62Var.write(bArr);
            }
        }
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        int length = this.b.length + 6 + this.c.length + this.d.length;
        byte[] bArr = this.e;
        if (bArr == null) {
            return length;
        }
        if (this.f.n >= cl_84.z.n) {
            Set set = cl_109.e;
            length += 2;
        }
        int length2 = length + bArr.length;
        return h ? length2 + 2 : length2;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** Diffie-Hellman ServerKeyExchange\n");
        stringBuffer.append(cl_47.a("DH Modulus", this.b));
        stringBuffer.append(cl_47.a("DH Base", this.c));
        stringBuffer.append(cl_47.a("Server DH Public Key", this.d));
        if (this.e == null) {
            stringBuffer.append("Anonymous\n");
        } else {
            if (this.f.n >= cl_84.z.n) {
                stringBuffer.append("Signature Algorithm ");
                stringBuffer.append(this.g.c);
                stringBuffer.append("\n");
            }
            stringBuffer.append("Signed with a DSA or RSA public key\n");
        }
        return stringBuffer.toString();
    }

    public final void e(Signature signature, byte[] bArr, byte[] bArr2) {
        signature.update(bArr);
        signature.update(bArr2);
        int length = this.b.length;
        signature.update((byte) (length >> 8));
        signature.update((byte) (length & 255));
        signature.update(this.b);
        int length2 = this.c.length;
        signature.update((byte) (length2 >> 8));
        signature.update((byte) (length2 & 255));
        signature.update(this.c);
        int length3 = this.d.length;
        signature.update((byte) (length3 >> 8));
        signature.update((byte) (length3 & 255));
        signature.update(this.d);
    }

    public cl_52(cl_21 cl_21Var, PrivateKey privateKey, byte[] bArr, byte[] bArr2, SecureRandom secureRandom, cl_109 cl_109Var, cl_84 cl_84Var) {
        Signature e;
        this.f = cl_84Var;
        this.b = cl_47.b(cl_21Var.a);
        this.c = cl_47.b(cl_21Var.b);
        this.d = cl_47.b(cl_21Var.d);
        if (cl_84Var.n >= cl_84.z.n) {
            this.g = cl_109Var;
            e = cl_73.e(cl_109Var.c);
        } else {
            this.g = null;
            if (privateKey.getAlgorithm().equals("DSA")) {
                e = cl_73.e("DSA");
            } else {
                int i = cl_86.e;
                e = cl_73.e("MD5andSHA1withRSA");
            }
        }
        e.initSign(privateKey, secureRandom);
        e(e, bArr, bArr2);
        this.e = e.sign();
    }

    public cl_52(cl_46 cl_46Var, cl_84 cl_84Var) {
        this.f = cl_84Var;
        this.g = null;
        this.b = cl_46Var.g();
        this.c = cl_46Var.g();
        this.d = cl_46Var.g();
        KeyUtil.validate(new DHPublicKeySpec(new BigInteger(1, this.d), new BigInteger(1, this.b), new BigInteger(1, this.c)));
        this.e = null;
    }
}
