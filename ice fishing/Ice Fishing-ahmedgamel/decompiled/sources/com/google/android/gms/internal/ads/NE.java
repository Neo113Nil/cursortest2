package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class NE extends AbstractC4280zE {

    /* renamed from: a, reason: collision with root package name */
    public final int f27260a;

    /* renamed from: b, reason: collision with root package name */
    public final C3956tE f27261b;

    public NE(int i, C3956tE c3956tE) {
        this.f27260a = i;
        this.f27261b = c3956tE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f27261b != C3956tE.f35022k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NE)) {
            return false;
        }
        NE ne = (NE) obj;
        return ne.f27260a == this.f27260a && ne.f27261b == this.f27261b;
    }

    public final int hashCode() {
        return Objects.hash(NE.class, Integer.valueOf(this.f27260a), 12, 16, this.f27261b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27261b);
        int length = valueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.f27260a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
