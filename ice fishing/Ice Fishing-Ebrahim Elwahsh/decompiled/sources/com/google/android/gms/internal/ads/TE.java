package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class TE extends AE {

    /* renamed from: a, reason: collision with root package name */
    public final int f27728a;

    /* renamed from: b, reason: collision with root package name */
    public final GE f27729b;

    public TE(int i, GE ge) {
        this.f27728a = i;
        this.f27729b = ge;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f27729b != GE.f25121j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TE)) {
            return false;
        }
        TE te = (TE) obj;
        return te.f27728a == this.f27728a && te.f27729b == this.f27729b;
    }

    public final int hashCode() {
        return Objects.hash(TE.class, Integer.valueOf(this.f27728a), this.f27729b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27729b);
        int length = valueOf.length();
        int i = this.f27728a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
