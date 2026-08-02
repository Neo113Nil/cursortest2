package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.mJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3584mJ {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f32716e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f32717f;

    /* renamed from: a, reason: collision with root package name */
    public Integer f32718a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f32719b = C3692oJ.f33677e;

    /* renamed from: c, reason: collision with root package name */
    public C3638nJ f32720c = null;

    /* renamed from: d, reason: collision with root package name */
    public C3579mE f32721d = C3579mE.f32704M;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f32716e = valueOf;
        f32717f = valueOf.pow(256);
    }

    public final void a(int i) {
        this.f32718a = Integer.valueOf(i);
    }

    public final C3692oJ b() {
        Integer num = this.f32718a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f32719b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f32720c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f32721d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f32718a));
        }
        BigInteger bigInteger = this.f32719b;
        int compareTo = bigInteger.compareTo(C3692oJ.f33677e);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f32716e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f32717f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C3692oJ(this.f32718a.intValue(), this.f32719b, this.f32721d, this.f32720c);
    }
}
