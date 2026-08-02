package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class JE extends AbstractC4280zE {

    /* renamed from: a, reason: collision with root package name */
    public final int f26411a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26412b;

    /* renamed from: c, reason: collision with root package name */
    public final C3902sE f26413c;

    public JE(int i, int i4, C3902sE c3902sE) {
        this.f26411a = i;
        this.f26412b = i4;
        this.f26413c = c3902sE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f26413c != C3902sE.f34683j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof JE)) {
            return false;
        }
        JE je = (JE) obj;
        return je.f26411a == this.f26411a && je.f26412b == this.f26412b && je.f26413c == this.f26413c;
    }

    public final int hashCode() {
        return Objects.hash(JE.class, Integer.valueOf(this.f26411a), Integer.valueOf(this.f26412b), 16, this.f26413c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26413c);
        int length = valueOf.length();
        int i = this.f26412b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i4 = this.f26411a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i4).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        return AbstractC5128c.d(i4, "-byte IV, 16-byte tag, and ", "-byte key)", sb);
    }
}
