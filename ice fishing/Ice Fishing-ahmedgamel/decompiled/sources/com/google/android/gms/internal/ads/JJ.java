package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class JJ implements InterfaceC4064vE {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f26421f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f26422g = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f26423a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26424b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f26425c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26426d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f26427e;

    public JJ(RSAPublicKey rSAPublicKey, C3638nJ c3638nJ, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3364iD.k(rSAPublicKey.getModulus().bitLength());
        AbstractC3364iD.n(rSAPublicKey.getPublicExponent());
        this.f26423a = rSAPublicKey;
        this.f26424b = b(c3638nJ);
        this.f26425c = bArr;
        this.f26426d = bArr2;
        this.f26427e = provider;
    }

    public static String b(C3638nJ c3638nJ) {
        if (c3638nJ == C3638nJ.f33494b) {
            return "SHA256withRSA";
        }
        if (c3638nJ == C3638nJ.f33495c) {
            return "SHA384withRSA";
        }
        if (c3638nJ == C3638nJ.f33496d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static JJ c(C3800qJ c3800qJ, Provider provider) {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = c3800qJ.f34015c;
        C3692oJ c3692oJ = c3800qJ.f34014b;
        return new JJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c3692oJ.f33679b)), c3692oJ.f33681d, c3800qJ.f34016d.b(), c3692oJ.f33680c.equals(C3579mE.f32703L) ? f26422g : f26421f, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4064vE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f26425c;
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f26424b, this.f26427e);
        signature.initVerify(this.f26423a);
        signature.update(bArr2);
        byte[] bArr4 = this.f26426d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
