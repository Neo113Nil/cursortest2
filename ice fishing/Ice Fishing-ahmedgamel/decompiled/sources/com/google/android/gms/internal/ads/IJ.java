package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* loaded from: classes2.dex */
public final class IJ implements InterfaceC4010uE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f26223g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f26224h = {0};
    public static final byte[] i = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f26225a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26226b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f26227c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26228d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4064vE f26229e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f26230f;

    public IJ(RSAPrivateCrtKey rSAPrivateCrtKey, C3638nJ c3638nJ, byte[] bArr, byte[] bArr2, InterfaceC4064vE interfaceC4064vE, Provider provider) {
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (c3638nJ != C3638nJ.f33494b && c3638nJ != C3638nJ.f33495c && c3638nJ != C3638nJ.f33496d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(c3638nJ)));
        }
        AbstractC3364iD.k(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC3364iD.n(rSAPrivateCrtKey.getPublicExponent());
        this.f26225a = rSAPrivateCrtKey;
        this.f26226b = JJ.b(c3638nJ);
        this.f26227c = bArr;
        this.f26228d = bArr2;
        this.f26229e = interfaceC4064vE;
        this.f26230f = provider;
    }
}
