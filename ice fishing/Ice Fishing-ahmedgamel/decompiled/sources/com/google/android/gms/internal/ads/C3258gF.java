package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.gF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3258gF extends AbstractC4280zE {

    /* renamed from: a, reason: collision with root package name */
    public final C3579mE f31315a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31316b;

    public C3258gF(C3579mE c3579mE, int i) {
        this.f31315a = c3579mE;
        this.f31316b = i;
    }

    public static C3258gF b(C3579mE c3579mE, int i) {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new C3258gF(c3579mE, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f31315a != C3579mE.f32698F;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3258gF)) {
            return false;
        }
        C3258gF c3258gF = (C3258gF) obj;
        return c3258gF.f31315a == this.f31315a && c3258gF.f31316b == this.f31316b;
    }

    public final int hashCode() {
        return Objects.hash(C3258gF.class, this.f31315a, Integer.valueOf(this.f31316b));
    }

    public final String toString() {
        String str = this.f31315a.f32711u;
        int length = str.length();
        int i = this.f31316b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(str);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
