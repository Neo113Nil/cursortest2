package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class EQ {

    /* renamed from: a, reason: collision with root package name */
    public final int f25380a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25381b;

    public EQ(int i, boolean z6) {
        this.f25380a = i;
        this.f25381b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EQ.class != obj.getClass()) {
            return false;
        }
        EQ eq = (EQ) obj;
        return this.f25380a == eq.f25380a && this.f25381b == eq.f25381b;
    }

    public final int hashCode() {
        return (this.f25380a * 31) + (this.f25381b ? 1 : 0);
    }
}
