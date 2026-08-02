package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class SC implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final SC f28136v = new SC(new long[0], 0);

    /* renamed from: n, reason: collision with root package name */
    public final long[] f28137n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28138u;

    public SC(long[] jArr, int i) {
        this.f28137n = jArr;
        this.f28138u = i;
    }

    public final long a(int i) {
        AbstractC2792Sd.K(i, this.f28138u);
        return this.f28137n[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SC)) {
            return false;
        }
        SC sc = (SC) obj;
        int i = sc.f28138u;
        int i4 = this.f28138u;
        if (i4 != i) {
            return false;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            if (a(i6) != sc.a(i6)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f28138u; i4++) {
            i = (i * 31) + Long.hashCode(this.f28137n[i4]);
        }
        return i;
    }

    public final String toString() {
        int i = this.f28138u;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.f28137n;
        sb.append(jArr[0]);
        for (int i4 = 1; i4 < i; i4++) {
            sb.append(", ");
            sb.append(jArr[i4]);
        }
        sb.append(']');
        return sb.toString();
    }
}
