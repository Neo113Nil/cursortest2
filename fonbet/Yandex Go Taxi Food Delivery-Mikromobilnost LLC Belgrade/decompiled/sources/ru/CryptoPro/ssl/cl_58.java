package ru.CryptoPro.ssl;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes4.dex */
final class cl_58 extends cl_61 {
    public byte[] b;
    public byte[] c;
    public Signature d;
    public byte[] e;

    public cl_58(PublicKey publicKey, PrivateKey privateKey, cl_87 cl_87Var, cl_87 cl_87Var2, SecureRandom secureRandom) {
        RSAPublicKeySpec f = cl_73.f(publicKey);
        this.b = cl_47.b(f.getModulus());
        this.c = cl_47.b(f.getPublicExponent());
        int i = cl_86.e;
        Signature e = cl_73.e("MD5andSHA1withRSA");
        this.d = e;
        e.initSign(privateKey, secureRandom);
        e(cl_87Var.a, cl_87Var2.a);
        this.e = e.sign();
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final void a(cl_62 cl_62Var) {
        cl_62Var.b(this.b);
        cl_62Var.b(this.c);
        cl_62Var.b(this.e);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final int c() {
        return this.b.length + 6 + this.c.length + this.e.length;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public final String d() {
        StringBuffer stringBuffer = new StringBuffer("*** RSA ServerKeyExchange\n");
        stringBuffer.append(cl_47.a("RSA Modulus", this.b));
        stringBuffer.append(cl_47.a("RSA Public Exponent", this.c));
        return stringBuffer.toString();
    }

    public final void e(byte[] bArr, byte[] bArr2) {
        Signature signature = this.d;
        signature.update(bArr);
        signature.update(bArr2);
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        signature.update((byte) (length >> 8));
        signature.update((byte) (length & 255));
        signature.update(bArr3);
        byte[] bArr4 = this.c;
        int length2 = bArr4.length;
        signature.update((byte) (length2 >> 8));
        signature.update((byte) (length2 & 255));
        signature.update(bArr4);
    }
}
