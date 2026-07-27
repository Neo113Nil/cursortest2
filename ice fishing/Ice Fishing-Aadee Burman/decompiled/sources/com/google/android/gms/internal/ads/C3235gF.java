package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.gF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3235gF extends AbstractC4257zE {

    /* renamed from: a, reason: collision with root package name */
    public final C3556mE f30549a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30550b;

    public C3235gF(C3556mE c3556mE, int i) {
        this.f30549a = c3556mE;
        this.f30550b = i;
    }

    public static C3235gF b(C3556mE c3556mE, int i) {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new C3235gF(c3556mE, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f30549a != C3556mE.f31918F;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3235gF)) {
            return false;
        }
        C3235gF c3235gF = (C3235gF) obj;
        return c3235gF.f30549a == this.f30549a && c3235gF.f30550b == this.f30550b;
    }

    public final int hashCode() {
        return Objects.hash(C3235gF.class, this.f30549a, Integer.valueOf(this.f30550b));
    }

    public final String toString() {
        String str = this.f30549a.f31931u;
        int length = str.length();
        int i = this.f30550b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(str);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
