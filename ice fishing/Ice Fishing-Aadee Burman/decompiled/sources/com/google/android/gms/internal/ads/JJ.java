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
public final class JJ implements InterfaceC4041vE {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f25668f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f25669g = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f25670a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25671b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f25672c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f25673d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f25674e;

    public JJ(RSAPublicKey rSAPublicKey, C3615nJ c3615nJ, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3341iD.k(rSAPublicKey.getModulus().bitLength());
        AbstractC3341iD.n(rSAPublicKey.getPublicExponent());
        this.f25670a = rSAPublicKey;
        this.f25671b = b(c3615nJ);
        this.f25672c = bArr;
        this.f25673d = bArr2;
        this.f25674e = provider;
    }

    public static String b(C3615nJ c3615nJ) {
        if (c3615nJ == C3615nJ.f32716b) {
            return "SHA256withRSA";
        }
        if (c3615nJ == C3615nJ.f32717c) {
            return "SHA384withRSA";
        }
        if (c3615nJ == C3615nJ.f32718d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static JJ c(C3777qJ c3777qJ, Provider provider) {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = c3777qJ.f33231c;
        C3669oJ c3669oJ = c3777qJ.f33230b;
        return new JJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c3669oJ.f32892b)), c3669oJ.f32894d, c3777qJ.f33232d.b(), c3669oJ.f32893c.equals(C3556mE.f31923L) ? f25669g : f25668f, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4041vE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f25672c;
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f25671b, this.f25674e);
        signature.initVerify(this.f25670a);
        signature.update(bArr2);
        byte[] bArr4 = this.f25673d;
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
