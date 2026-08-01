package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class RC implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final RC f27178v = new RC(new int[0], 0);

    /* renamed from: n, reason: collision with root package name */
    public final int[] f27179n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27180u;

    public RC(int[] iArr, int i) {
        this.f27179n = iArr;
        this.f27180u = i;
    }

    public final int a(int i) {
        AbstractC2772Sd.K(i, this.f27180u);
        return this.f27179n[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RC)) {
            return false;
        }
        RC rc = (RC) obj;
        int i = rc.f27180u;
        int i6 = this.f27180u;
        if (i6 != i) {
            return false;
        }
        for (int i9 = 0; i9 < i6; i9++) {
            if (a(i9) != rc.a(i9)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i6 = 0; i6 < this.f27180u; i6++) {
            i = (i * 31) + Integer.hashCode(this.f27179n[i6]);
        }
        return i;
    }

    public final String toString() {
        int i = this.f27180u;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f27179n;
        sb.append(iArr[0]);
        for (int i6 = 1; i6 < i; i6++) {
            sb.append(", ");
            sb.append(iArr[i6]);
        }
        sb.append(']');
        return sb.toString();
    }
}
