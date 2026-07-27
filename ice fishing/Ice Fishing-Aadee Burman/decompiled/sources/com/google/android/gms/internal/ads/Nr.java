package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Nr {

    /* renamed from: c, reason: collision with root package name */
    public static final Nr f26557c = new Nr(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f26558a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26559b;

    static {
        new Nr(0, 0);
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public Nr(int i, int i6) {
        boolean z3 = false;
        if ((i == -1 || i >= 0) && (i6 == -1 || i6 >= 0)) {
            z3 = true;
        }
        AbstractC2772Sd.i(z3);
        this.f26558a = i;
        this.f26559b = i6;
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
            if (this.f26558a == nr.f26558a && this.f26559b == nr.f26559b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f26558a;
        return ((i >>> 16) | (i << 16)) ^ this.f26559b;
    }

    public final String toString() {
        int i = this.f26558a;
        int length = String.valueOf(i).length();
        int i6 = this.f26559b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i6).length());
        sb.append(i);
        sb.append("x");
        sb.append(i6);
        return sb.toString();
    }
}
