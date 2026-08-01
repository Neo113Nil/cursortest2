package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class BQ {

    /* renamed from: a, reason: collision with root package name */
    public final int f23903a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23904b;

    public BQ(int i, boolean z3) {
        this.f23903a = i;
        this.f23904b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BQ.class != obj.getClass()) {
            return false;
        }
        BQ bq = (BQ) obj;
        return this.f23903a == bq.f23903a && this.f23904b == bq.f23904b;
    }

    public final int hashCode() {
        return (this.f23903a * 31) + (this.f23904b ? 1 : 0);
    }
}
