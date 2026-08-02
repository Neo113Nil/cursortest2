package ru.CryptoPro.ssl;

import defpackage.dy31;
import java.security.DigestException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.SignatureSpi;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class cl_86 extends SignatureSpi {
    public static final /* synthetic */ int e = 0;
    public MessageDigest b;
    public MessageDigest c;
    public final Signature a = cl_73.e(JCP.SIGN_RAW_RSA_NAME);
    public boolean d = true;

    public final void a() {
        if (this.b == null) {
            this.b = cl_73.i("MD5");
            this.c = cl_73.i("SHA");
        }
    }

    public final byte[] b() {
        try {
            a();
            byte[] bArr = new byte[36];
            this.b.digest(bArr, 0, 16);
            this.c.digest(bArr, 16, 20);
            this.d = true;
            return bArr;
        } catch (DigestException e2) {
            throw new SignatureException(e2);
        }
    }

    @Override // java.security.SignatureSpi
    public final Object engineGetParameter(String str) {
        throw new InvalidParameterException("Parameters not supported");
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        if (privateKey == null) {
            dy31.v("Key must not be null");
            return;
        }
        if (!this.d) {
            this.b.reset();
            this.c.reset();
            this.d = true;
        }
        this.a.initSign(privateKey, secureRandom);
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) {
        if (publicKey == null) {
            dy31.v("Key must not be null");
            return;
        }
        if (!this.d) {
            this.b.reset();
            this.c.reset();
            this.d = true;
        }
        this.a.initVerify(publicKey);
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) {
        if (!str.equals("hashes")) {
            throw new InvalidParameterException("Parameter not supported: ".concat(str));
        }
        if (!(obj instanceof MessageDigest[])) {
            throw new InvalidParameterException("value must be MessageDigest[]");
        }
        MessageDigest[] messageDigestArr = (MessageDigest[]) obj;
        this.b = messageDigestArr[0];
        this.c = messageDigestArr[1];
    }

    @Override // java.security.SignatureSpi
    public final byte[] engineSign() {
        byte[] b = b();
        Signature signature = this.a;
        signature.update(b);
        return signature.sign();
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b) {
        a();
        this.d = false;
        this.b.update(b);
        this.c.update(b);
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr, int i, int i2) {
        byte[] b = b();
        Signature signature = this.a;
        signature.update(b);
        return signature.verify(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr) {
        return engineVerify(bArr, 0, bArr.length);
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        a();
        this.d = false;
        this.b.update(bArr, i, i2);
        this.c.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey) {
        engineInitSign(privateKey, null);
    }
}
