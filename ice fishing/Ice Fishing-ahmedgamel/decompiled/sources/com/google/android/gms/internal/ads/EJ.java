package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class EJ implements InterfaceC4010uE {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f25339a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static EJ a(C3208fJ c3208fJ) {
        Provider h3 = AbstractC3066cl.h();
        if (h3 == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        byte[] b9 = ((C3263gK) c3208fJ.f31029c.f30647u).b();
        c3208fJ.f31028b.f31524d.b();
        EJ ej = new EJ();
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (b9.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", h3).generatePrivate(new PKCS8EncodedKeySpec(AbstractC4117wD.d(f25339a, b9)));
        return ej;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ((!java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)).intValue() <= 23) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EJ b(C4069vJ c4069vJ) {
        Provider h3;
        int i = DG.f25122a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            h3 = null;
        }
        h3 = AbstractC3066cl.h();
        if (h3 == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", h3);
        C4015uJ c4015uJ = c4069vJ.f35443b.f35593b;
        C4123wJ c4123wJ = c4069vJ.f35443b;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(c4123wJ.f35594c, c4015uJ.f35286b, (BigInteger) c4069vJ.f35444c.f32643u, (BigInteger) c4069vJ.f35445d.f32643u, (BigInteger) c4069vJ.f35446e.f32643u, (BigInteger) c4069vJ.f35447f.f32643u, (BigInteger) c4069vJ.f35448g.f32643u, (BigInteger) c4069vJ.f35449h.f32643u));
        c4123wJ.f35595d.b();
        EJ ej = new EJ();
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3364iD.k(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC3364iD.n(rSAPrivateCrtKey.getPublicExponent());
        C3961tJ c3961tJ = c4015uJ.f35288d;
        MJ.b(c3961tJ);
        MJ.c(c3961tJ, c4015uJ.f35289e, c4015uJ.f35290f);
        return ej;
    }
}
