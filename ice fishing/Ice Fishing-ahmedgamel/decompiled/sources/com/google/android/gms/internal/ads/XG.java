package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class XG extends AbstractC3848rE {

    /* renamed from: a, reason: collision with root package name */
    public final int f29291a;

    public XG(int i) {
        this.f29291a = i;
    }

    public static XG b(int i) {
        if (i == 16 || i == 32) {
            return new XG(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof XG) && ((XG) obj).f29291a == this.f29291a;
    }

    public final int hashCode() {
        return Objects.hash(XG.class, Integer.valueOf(this.f29291a));
    }

    public final String toString() {
        int i = this.f29291a;
        return AbstractC5128c.d(i, "AesCmac PRF Parameters (", "-byte key)", new StringBuilder(String.valueOf(i).length() + 34));
    }
}
