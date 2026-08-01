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
public final class MJ implements InterfaceC4041vE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f26281g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f26282h = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f26283a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26284b;

    /* renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f26285c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26286d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f26287e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f26288f;

    public MJ(RSAPublicKey rSAPublicKey, C3938tJ c3938tJ, C3938tJ c3938tJ2, int i, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!c3938tJ.equals(c3938tJ2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        AbstractC3341iD.k(rSAPublicKey.getModulus().bitLength());
        AbstractC3341iD.n(rSAPublicKey.getPublicExponent());
        this.f26283a = rSAPublicKey;
        this.f26284b = b(c3938tJ);
        this.f26285c = c(c3938tJ, c3938tJ2, i);
        this.f26286d = bArr;
        this.f26287e = bArr2;
        this.f26288f = provider;
    }

    public static String b(C3938tJ c3938tJ) {
        if (c3938tJ == C3938tJ.f34259b) {
            return "SHA256withRSA/PSS";
        }
        if (c3938tJ == C3938tJ.f34260c) {
            return "SHA384withRSA/PSS";
        }
        if (c3938tJ == C3938tJ.f34261d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(c3938tJ)));
    }

    public static PSSParameterSpec c(C3938tJ c3938tJ, C3938tJ c3938tJ2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        C3938tJ c3938tJ3 = C3938tJ.f34259b;
        C3938tJ c3938tJ4 = C3938tJ.f34261d;
        C3938tJ c3938tJ5 = C3938tJ.f34260c;
        if (c3938tJ == c3938tJ3) {
            str = "SHA-256";
        } else if (c3938tJ == c3938tJ5) {
            str = "SHA-384";
        } else {
            if (c3938tJ != c3938tJ4) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(c3938tJ)));
            }
            str = "SHA-512";
        }
        if (c3938tJ2 == c3938tJ3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (c3938tJ2 == c3938tJ5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (c3938tJ2 != c3938tJ4) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(c3938tJ2)));
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
    public static MJ d(C4100wJ c4100wJ) {
        Provider h9;
        int i = DG.f24377a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            h9 = null;
        }
        h9 = AbstractC3043cl.h();
        Provider provider = h9;
        if (provider == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = c4100wJ.f34825c;
        C3992uJ c3992uJ = c4100wJ.f34824b;
        return new MJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c3992uJ.f34512b)), c3992uJ.f34514d, c3992uJ.f34515e, c3992uJ.f34516f, c4100wJ.f34826d.b(), c3992uJ.f34513c.equals(C3879sE.f33925t) ? f26282h : f26281g, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4041vE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f26286d;
        if (!DG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f26284b, this.f26288f);
        signature.initVerify(this.f26283a);
        signature.setParameter(this.f26285c);
        signature.update(bArr2);
        byte[] bArr4 = this.f26287e;
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
