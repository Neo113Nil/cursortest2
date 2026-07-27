package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* loaded from: classes2.dex */
public final class SJ implements InterfaceC4054vE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f27521g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f27522h = {0};
    public static final byte[] i = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f27523a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27524b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f27525c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f27526d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4108wE f27527e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f27528f;

    public SJ(RSAPrivateCrtKey rSAPrivateCrtKey, C4005uJ c4005uJ, byte[] bArr, byte[] bArr2, InterfaceC4108wE interfaceC4108wE, Provider provider) {
        if (!XC.e(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (c4005uJ != C4005uJ.f34578b && c4005uJ != C4005uJ.f34579c && c4005uJ != C4005uJ.f34580d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(c4005uJ)));
        }
        AbstractC3137eE.i(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC3137eE.k(rSAPrivateCrtKey.getPublicExponent());
        this.f27523a = rSAPrivateCrtKey;
        this.f27524b = TJ.b(c4005uJ);
        this.f27525c = bArr;
        this.f27526d = bArr2;
        this.f27527e = interfaceC4108wE;
        this.f27528f = provider;
    }
}
