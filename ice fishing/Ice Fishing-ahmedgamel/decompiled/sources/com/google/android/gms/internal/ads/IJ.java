package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* loaded from: classes2.dex */
public final class IJ implements InterfaceC3987uE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f25480g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f25481h = {0};
    public static final byte[] i = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f25482a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25483b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f25484c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f25485d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4041vE f25486e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f25487f;

    public IJ(RSAPrivateCrtKey rSAPrivateCrtKey, C3615nJ c3615nJ, byte[] bArr, byte[] bArr2, InterfaceC4041vE interfaceC4041vE, Provider provider) {
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (c3615nJ != C3615nJ.f32716b && c3615nJ != C3615nJ.f32717c && c3615nJ != C3615nJ.f32718d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(c3615nJ)));
        }
        AbstractC3341iD.k(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC3341iD.n(rSAPrivateCrtKey.getPublicExponent());
        this.f25482a = rSAPrivateCrtKey;
        this.f25483b = JJ.b(c3615nJ);
        this.f25484c = bArr;
        this.f25485d = bArr2;
        this.f25486e = interfaceC4041vE;
        this.f25487f = provider;
    }
}
