package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class QE extends AE {

    /* renamed from: a, reason: collision with root package name */
    public final int f27130a;

    /* renamed from: b, reason: collision with root package name */
    public final C3731pE f27131b;

    public QE(int i, C3731pE c3731pE) {
        this.f27130a = i;
        this.f27131b = c3731pE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f27131b != C3731pE.f33353A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QE)) {
            return false;
        }
        QE qe = (QE) obj;
        return qe.f27130a == this.f27130a && qe.f27131b == this.f27131b;
    }

    public final int hashCode() {
        return Objects.hash(QE.class, Integer.valueOf(this.f27130a), 12, 16, this.f27131b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27131b);
        int length = valueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.f27130a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
