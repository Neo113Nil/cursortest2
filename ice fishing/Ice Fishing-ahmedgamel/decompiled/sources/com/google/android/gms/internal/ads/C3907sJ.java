package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.sJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3907sJ {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f34728g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f34729h;

    /* renamed from: a, reason: collision with root package name */
    public Integer f34730a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f34731b = C4015uJ.f35284g;

    /* renamed from: c, reason: collision with root package name */
    public C3961tJ f34732c = null;

    /* renamed from: d, reason: collision with root package name */
    public C3961tJ f34733d = null;

    /* renamed from: e, reason: collision with root package name */
    public Integer f34734e = null;

    /* renamed from: f, reason: collision with root package name */
    public C3902sE f34735f = C3902sE.f34694u;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f34728g = valueOf;
        f34729h = valueOf.pow(256);
    }

    public final void a(int i) {
        this.f34730a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.f34734e = Integer.valueOf(i);
    }

    public final C4015uJ c() {
        Integer num = this.f34730a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f34731b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f34732c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f34733d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f34735f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f34734e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f34730a, 2048));
        }
        if (this.f34732c != this.f34733d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f34731b;
        int compareTo = bigInteger.compareTo(C4015uJ.f35284g);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f34728g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f34729h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C4015uJ(this.f34730a.intValue(), this.f34731b, this.f34735f, this.f34732c, this.f34733d, this.f34734e.intValue());
    }
}
