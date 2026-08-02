package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Nr {

    /* renamed from: c, reason: collision with root package name */
    public static final Nr f27339c = new Nr(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f27340a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27341b;

    static {
        new Nr(0, 0);
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public Nr(int i, int i4) {
        boolean z6 = false;
        if ((i == -1 || i >= 0) && (i4 == -1 || i4 >= 0)) {
            z6 = true;
        }
        AbstractC2792Sd.i(z6);
        this.f27340a = i;
        this.f27341b = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Nr) {
            Nr nr = (Nr) obj;
            if (this.f27340a == nr.f27340a && this.f27341b == nr.f27341b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f27340a;
        return ((i >>> 16) | (i << 16)) ^ this.f27341b;
    }

    public final String toString() {
        int i = this.f27340a;
        int length = String.valueOf(i).length();
        int i4 = this.f27341b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i4).length());
        sb.append(i);
        sb.append("x");
        sb.append(i4);
        return sb.toString();
    }
}
