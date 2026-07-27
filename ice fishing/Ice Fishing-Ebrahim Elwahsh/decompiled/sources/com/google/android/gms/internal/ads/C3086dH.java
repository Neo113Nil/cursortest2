package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.dH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3086dH extends AbstractC4000uE {

    /* renamed from: a, reason: collision with root package name */
    public final int f29995a;

    public C3086dH(int i) {
        this.f29995a = i;
    }

    public static C3086dH b(int i) {
        if (i == 16 || i == 32) {
            return new C3086dH(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3086dH) && ((C3086dH) obj).f29995a == this.f29995a;
    }

    public final int hashCode() {
        return Objects.hash(C3086dH.class, Integer.valueOf(this.f29995a));
    }

    public final String toString() {
        int i = this.f29995a;
        return AbstractC5051n.d(i, "AesCmac PRF Parameters (", "-byte key)", new StringBuilder(String.valueOf(i).length() + 34));
    }
}
