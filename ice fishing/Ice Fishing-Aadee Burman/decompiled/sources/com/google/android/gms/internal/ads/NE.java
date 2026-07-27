package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class NE extends AbstractC4257zE {

    /* renamed from: a, reason: collision with root package name */
    public final int f26476a;

    /* renamed from: b, reason: collision with root package name */
    public final C3933tE f26477b;

    public NE(int i, C3933tE c3933tE) {
        this.f26476a = i;
        this.f26477b = c3933tE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f26477b != C3933tE.f34236k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NE)) {
            return false;
        }
        NE ne = (NE) obj;
        return ne.f26476a == this.f26476a && ne.f26477b == this.f26477b;
    }

    public final int hashCode() {
        return Objects.hash(NE.class, Integer.valueOf(this.f26476a), 12, 16, this.f26477b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26477b);
        int length = valueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.f26476a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
