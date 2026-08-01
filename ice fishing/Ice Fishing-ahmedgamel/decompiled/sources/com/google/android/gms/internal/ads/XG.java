package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class XG extends AbstractC3825rE {

    /* renamed from: a, reason: collision with root package name */
    public final int f28511a;

    public XG(int i) {
        this.f28511a = i;
    }

    public static XG b(int i) {
        if (i == 16 || i == 32) {
            return new XG(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof XG) && ((XG) obj).f28511a == this.f28511a;
    }

    public final int hashCode() {
        return Objects.hash(XG.class, Integer.valueOf(this.f28511a));
    }

    public final String toString() {
        int i = this.f28511a;
        return u1.h.d(i, "AesCmac PRF Parameters (", "-byte key)", new StringBuilder(String.valueOf(i).length() + 34));
    }
}
