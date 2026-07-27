package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class QE extends AbstractC4257zE {

    /* renamed from: a, reason: collision with root package name */
    public final int f27006a;

    /* renamed from: b, reason: collision with root package name */
    public final FE f27007b;

    public QE(int i, FE fe) {
        this.f27006a = i;
        this.f27007b = fe;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f27007b != FE.f24760C;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QE)) {
            return false;
        }
        QE qe = (QE) obj;
        return qe.f27006a == this.f27006a && qe.f27007b == this.f27007b;
    }

    public final int hashCode() {
        return Objects.hash(QE.class, Integer.valueOf(this.f27006a), this.f27007b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27007b);
        int length = valueOf.length();
        int i = this.f27006a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
