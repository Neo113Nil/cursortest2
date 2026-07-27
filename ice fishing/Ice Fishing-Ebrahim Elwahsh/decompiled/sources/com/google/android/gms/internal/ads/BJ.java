package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class BJ {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f24018g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f24019h;

    /* renamed from: a, reason: collision with root package name */
    public Integer f24020a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f24021b = EJ.f24693g;

    /* renamed from: c, reason: collision with root package name */
    public CJ f24022c = null;

    /* renamed from: d, reason: collision with root package name */
    public CJ f24023d = null;

    /* renamed from: e, reason: collision with root package name */
    public Integer f24024e = null;

    /* renamed from: f, reason: collision with root package name */
    public DJ f24025f = DJ.f24415e;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f24018g = valueOf;
        f24019h = valueOf.pow(256);
    }

    public final void a(int i) {
        this.f24020a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.f24024e = Integer.valueOf(i);
    }

    public final EJ c() {
        Integer num = this.f24020a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f24021b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f24022c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f24023d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f24025f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f24024e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f24020a, 2048));
        }
        if (this.f24022c != this.f24023d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f24021b;
        int compareTo = bigInteger.compareTo(EJ.f24693g);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f24018g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f24019h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new EJ(this.f24020a.intValue(), this.f24021b, this.f24025f, this.f24022c, this.f24023d, this.f24024e.intValue());
    }
}
