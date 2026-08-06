package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mk {
    public final long ZpBGe2uQfcn8;

    public /* synthetic */ mk(long j) {
        this.ZpBGe2uQfcn8 = j;
    }

    public static final int GE9mJIPrb8gP(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static final boolean JhCgjQRTAOCT(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static java.lang.String Ns0WNyEWdPsk(long j) {
        int P05cfTpS5W5L = P05cfTpS5W5L(j);
        java.lang.String valueOf = P05cfTpS5W5L == Integer.MAX_VALUE ? "Infinity" : java.lang.String.valueOf(P05cfTpS5W5L);
        int QiMR8OkAhezm = QiMR8OkAhezm(j);
        java.lang.String valueOf2 = QiMR8OkAhezm != Integer.MAX_VALUE ? java.lang.String.valueOf(QiMR8OkAhezm) : "Infinity";
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Constraints(minWidth = ");
        sb.append(GE9mJIPrb8gP(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(e6mdH7fiFuta(j));
        sb.append(", maxHeight = ");
        return defpackage.pVQOaWB9QMo4.fNwYGHIYeJcR(sb, valueOf2, ')');
    }

    public static final int P05cfTpS5W5L(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int QiMR8OkAhezm(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final boolean WDYagTQQm9ns(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static long ZpBGe2uQfcn8(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = GE9mJIPrb8gP(j);
        }
        if ((i5 & 2) != 0) {
            i2 = P05cfTpS5W5L(j);
        }
        if ((i5 & 4) != 0) {
            i3 = e6mdH7fiFuta(j);
        }
        if ((i5 & 8) != 0) {
            i4 = QiMR8OkAhezm(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            defpackage.g80.ZpBGe2uQfcn8("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return defpackage.nk.P05cfTpS5W5L(i, i2, i3, i4);
    }

    public static final int e6mdH7fiFuta(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final boolean fWTAfUmVKrZq(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean giKS3J6vZuNy(long j, long j2) {
        return j == j2;
    }

    public static final boolean oh71FJcDz6S2(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.mk) {
            return this.ZpBGe2uQfcn8 == ((defpackage.mk) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return Ns0WNyEWdPsk(this.ZpBGe2uQfcn8);
    }
}
