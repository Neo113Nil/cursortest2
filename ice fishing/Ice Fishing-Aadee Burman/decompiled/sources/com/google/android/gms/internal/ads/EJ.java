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
public final class EJ implements InterfaceC3987uE {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f24578a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static EJ a(C3185fJ c3185fJ) {
        Provider h9 = AbstractC3043cl.h();
        if (h9 == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        byte[] b9 = ((C3240gK) c3185fJ.f30242c.f29859u).b();
        c3185fJ.f30241b.f30758d.b();
        EJ ej = new EJ();
        if (!WC.c(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (b9.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", h9).generatePrivate(new PKCS8EncodedKeySpec(AbstractC4094wD.d(f24578a, b9)));
        return ej;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ((!java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)).intValue() <= 23) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EJ b(C4046vJ c4046vJ) {
        Provider h9;
        int i = DG.f24377a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            h9 = null;
        }
        h9 = AbstractC3043cl.h();
        if (h9 == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", h9);
        C3992uJ c3992uJ = c4046vJ.f34680b.f34824b;
        C4100wJ c4100wJ = c4046vJ.f34680b;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(c4100wJ.f34825c, c3992uJ.f34512b, (BigInteger) c4046vJ.f34681c.f31863u, (BigInteger) c4046vJ.f34682d.f31863u, (BigInteger) c4046vJ.f34683e.f31863u, (BigInteger) c4046vJ.f34684f.f31863u, (BigInteger) c4046vJ.f34685g.f31863u, (BigInteger) c4046vJ.f34686h.f31863u));
        c4100wJ.f34826d.b();
        EJ ej = new EJ();
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3341iD.k(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC3341iD.n(rSAPrivateCrtKey.getPublicExponent());
        C3938tJ c3938tJ = c3992uJ.f34514d;
        MJ.b(c3938tJ);
        MJ.c(c3938tJ, c3992uJ.f34515e, c3992uJ.f34516f);
        return ej;
    }
}
