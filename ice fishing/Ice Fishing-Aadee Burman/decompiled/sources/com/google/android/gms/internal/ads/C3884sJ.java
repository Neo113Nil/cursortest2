package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.sJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3884sJ {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f33960g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f33961h;

    /* renamed from: a, reason: collision with root package name */
    public Integer f33962a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f33963b = C3992uJ.f34510g;

    /* renamed from: c, reason: collision with root package name */
    public C3938tJ f33964c = null;

    /* renamed from: d, reason: collision with root package name */
    public C3938tJ f33965d = null;

    /* renamed from: e, reason: collision with root package name */
    public Integer f33966e = null;

    /* renamed from: f, reason: collision with root package name */
    public C3879sE f33967f = C3879sE.f33926u;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f33960g = valueOf;
        f33961h = valueOf.pow(256);
    }

    public final void a(int i) {
        this.f33962a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.f33966e = Integer.valueOf(i);
    }

    public final C3992uJ c() {
        Integer num = this.f33962a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f33963b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f33964c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f33965d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f33967f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f33966e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f33962a, 2048));
        }
        if (this.f33964c != this.f33965d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f33963b;
        int compareTo = bigInteger.compareTo(C3992uJ.f34510g);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f33960g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f33961h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C3992uJ(this.f33962a.intValue(), this.f33963b, this.f33967f, this.f33964c, this.f33965d, this.f33966e.intValue());
    }
}
