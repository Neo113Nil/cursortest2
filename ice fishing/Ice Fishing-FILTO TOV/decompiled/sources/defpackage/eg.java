package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class eg {
    public final long GWasM1elztuh;

    public static final int AvO7iQsrTN(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final boolean EljAMC1QTz(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public static long GWasM1elztuh(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = JFJ3QoxA(j);
        }
        if ((i5 & 2) != 0) {
            i2 = encWxUiV2(j);
        }
        if ((i5 & 4) != 0) {
            i3 = mOu10nynGul(j);
        }
        if ((i5 & 8) != 0) {
            i4 = AvO7iQsrTN(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            v10.GWasM1elztuh("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return fg.AvO7iQsrTN(i, i2, i3, i4);
    }

    public static final int JFJ3QoxA(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static final boolean OOA6hdeuvCS(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final boolean X1lG3V04pd(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean Yi7zF1RB1(long j, long j2) {
        return j == j2;
    }

    public static final int encWxUiV2(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int mOu10nynGul(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static String rQPn8YBR(long j) {
        int encWxUiV2 = encWxUiV2(j);
        String valueOf = encWxUiV2 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(encWxUiV2);
        int AvO7iQsrTN = AvO7iQsrTN(j);
        return "Constraints(minWidth = " + JFJ3QoxA(j) + ", maxWidth = " + valueOf + ", minHeight = " + mOu10nynGul(j) + ", maxHeight = " + (AvO7iQsrTN != Integer.MAX_VALUE ? String.valueOf(AvO7iQsrTN) : "Infinity") + ')';
    }

    public static final boolean xqGvceK5x(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eg) {
            return this.GWasM1elztuh == ((eg) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return rQPn8YBR(this.GWasM1elztuh);
    }
}
