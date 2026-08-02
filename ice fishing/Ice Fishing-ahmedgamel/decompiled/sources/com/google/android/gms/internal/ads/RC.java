package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class RC implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final RC f27934v = new RC(new int[0], 0);

    /* renamed from: n, reason: collision with root package name */
    public final int[] f27935n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27936u;

    public RC(int[] iArr, int i) {
        this.f27935n = iArr;
        this.f27936u = i;
    }

    public final int a(int i) {
        AbstractC2792Sd.K(i, this.f27936u);
        return this.f27935n[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RC)) {
            return false;
        }
        RC rc = (RC) obj;
        int i = rc.f27936u;
        int i4 = this.f27936u;
        if (i4 != i) {
            return false;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            if (a(i6) != rc.a(i6)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f27936u; i4++) {
            i = (i * 31) + Integer.hashCode(this.f27935n[i4]);
        }
        return i;
    }

    public final String toString() {
        int i = this.f27936u;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f27935n;
        sb.append(iArr[0]);
        for (int i4 = 1; i4 < i; i4++) {
            sb.append(", ");
            sb.append(iArr[i4]);
        }
        sb.append(']');
        return sb.toString();
    }
}
