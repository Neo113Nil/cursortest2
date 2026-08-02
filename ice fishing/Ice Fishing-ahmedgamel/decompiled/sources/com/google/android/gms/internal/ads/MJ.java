package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class MJ implements InterfaceC4064vE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f27072g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f27073h = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f27074a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27075b;

    /* renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f27076c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f27077d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f27078e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f27079f;

    public MJ(RSAPublicKey rSAPublicKey, C3961tJ c3961tJ, C3961tJ c3961tJ2, int i, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!c3961tJ.equals(c3961tJ2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        AbstractC3364iD.k(rSAPublicKey.getModulus().bitLength());
        AbstractC3364iD.n(rSAPublicKey.getPublicExponent());
        this.f27074a = rSAPublicKey;
        this.f27075b = b(c3961tJ);
        this.f27076c = c(c3961tJ, c3961tJ2, i);
        this.f27077d = bArr;
        this.f27078e = bArr2;
        this.f27079f = provider;
    }

    public static String b(C3961tJ c3961tJ) {
        if (c3961tJ == C3961tJ.f35045b) {
            return "SHA256withRSA/PSS";
        }
        if (c3961tJ == C3961tJ.f35046c) {
            return "SHA384withRSA/PSS";
        }
        if (c3961tJ == C3961tJ.f35047d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(c3961tJ)));
    }

    public static PSSParameterSpec c(C3961tJ c3961tJ, C3961tJ c3961tJ2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        C3961tJ c3961tJ3 = C3961tJ.f35045b;
        C3961tJ c3961tJ4 = C3961tJ.f35047d;
        C3961tJ c3961tJ5 = C3961tJ.f35046c;
        if (c3961tJ == c3961tJ3) {
            str = "SHA-256";
        } else if (c3961tJ == c3961tJ5) {
            str = "SHA-384";
        } else {
            if (c3961tJ != c3961tJ4) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(c3961tJ)));
            }
            str = "SHA-512";
        }
        if (c3961tJ2 == c3961tJ3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (c3961tJ2 == c3961tJ5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (c3961tJ2 != c3961tJ4) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(c3961tJ2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ((!java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)).intValue() <= 23) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MJ d(C4123wJ c4123wJ) {
        Provider h3;
        int i = DG.f25122a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            h3 = null;
        }
        h3 = AbstractC3066cl.h();
        Provider provider = h3;
        if (provider == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = c4123wJ.f35594c;
        C4015uJ c4015uJ = c4123wJ.f35593b;
        return new MJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c4015uJ.f35286b)), c4015uJ.f35288d, c4015uJ.f35289e, c4015uJ.f35290f, c4123wJ.f35595d.b(), c4015uJ.f35287c.equals(C3902sE.f34693t) ? f27073h : f27072g, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4064vE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f27077d;
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f27075b, this.f27079f);
        signature.initVerify(this.f27074a);
        signature.setParameter(this.f27076c);
        signature.update(bArr2);
        byte[] bArr4 = this.f27078e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
