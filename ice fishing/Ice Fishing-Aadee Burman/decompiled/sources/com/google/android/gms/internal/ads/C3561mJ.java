package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.mJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3561mJ {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f31936e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f31937f;

    /* renamed from: a, reason: collision with root package name */
    public Integer f31938a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f31939b = C3669oJ.f32890e;

    /* renamed from: c, reason: collision with root package name */
    public C3615nJ f31940c = null;

    /* renamed from: d, reason: collision with root package name */
    public C3556mE f31941d = C3556mE.f31924M;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f31936e = valueOf;
        f31937f = valueOf.pow(256);
    }

    public final void a(int i) {
        this.f31938a = Integer.valueOf(i);
    }

    public final C3669oJ b() {
        Integer num = this.f31938a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f31939b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f31940c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f31941d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f31938a));
        }
        BigInteger bigInteger = this.f31939b;
        int compareTo = bigInteger.compareTo(C3669oJ.f32890e);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f31936e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f31937f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C3669oJ(this.f31938a.intValue(), this.f31939b, this.f31941d, this.f31940c);
    }
}
