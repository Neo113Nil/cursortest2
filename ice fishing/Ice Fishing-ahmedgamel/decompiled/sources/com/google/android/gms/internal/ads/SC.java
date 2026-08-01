package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class SC implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final SC f27422v = new SC(new long[0], 0);

    /* renamed from: n, reason: collision with root package name */
    public final long[] f27423n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27424u;

    public SC(long[] jArr, int i) {
        this.f27423n = jArr;
        this.f27424u = i;
    }

    public final long a(int i) {
        AbstractC2772Sd.K(i, this.f27424u);
        return this.f27423n[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SC)) {
            return false;
        }
        SC sc = (SC) obj;
        int i = sc.f27424u;
        int i6 = this.f27424u;
        if (i6 != i) {
            return false;
        }
        for (int i9 = 0; i9 < i6; i9++) {
            if (a(i9) != sc.a(i9)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i6 = 0; i6 < this.f27424u; i6++) {
            i = (i * 31) + Long.hashCode(this.f27423n[i6]);
        }
        return i;
    }

    public final String toString() {
        int i = this.f27424u;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.f27423n;
        sb.append(jArr[0]);
        for (int i6 = 1; i6 < i; i6++) {
            sb.append(", ");
            sb.append(jArr[i6]);
        }
        sb.append(']');
        return sb.toString();
    }
}
