package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class JE extends AbstractC4257zE {

    /* renamed from: a, reason: collision with root package name */
    public final int f25658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25659b;

    /* renamed from: c, reason: collision with root package name */
    public final C3879sE f25660c;

    public JE(int i, int i6, C3879sE c3879sE) {
        this.f25658a = i;
        this.f25659b = i6;
        this.f25660c = c3879sE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f25660c != C3879sE.f33915j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof JE)) {
            return false;
        }
        JE je = (JE) obj;
        return je.f25658a == this.f25658a && je.f25659b == this.f25659b && je.f25660c == this.f25660c;
    }

    public final int hashCode() {
        return Objects.hash(JE.class, Integer.valueOf(this.f25658a), Integer.valueOf(this.f25659b), 16, this.f25660c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25660c);
        int length = valueOf.length();
        int i = this.f25659b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i6 = this.f25658a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i6).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        return u1.h.d(i6, "-byte IV, 16-byte tag, and ", "-byte key)", sb);
    }
}
