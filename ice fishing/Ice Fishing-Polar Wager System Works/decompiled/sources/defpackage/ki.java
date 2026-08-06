package defpackage;

/* loaded from: classes.dex */
public final class ki {
    public final long IHQe1A4L2xu;

    public /* synthetic */ ki(long j) {
        this.IHQe1A4L2xu = j;
    }

    public static final int AARZUJiTa(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int EXtogiMhuM(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final boolean F7NU4MC0GW(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static long IHQe1A4L2xu(long j, int i, int i2, int i3) {
        int SH1y5HwkJhh = (i3 & 1) != 0 ? SH1y5HwkJhh(j) : 0;
        if ((i3 & 2) != 0) {
            i = EXtogiMhuM(j);
        }
        int riuEU0zW4 = (i3 & 4) != 0 ? riuEU0zW4(j) : 0;
        if ((i3 & 8) != 0) {
            i2 = AARZUJiTa(j);
        }
        if (i < SH1y5HwkJhh || i2 < riuEU0zW4 || SH1y5HwkJhh < 0 || riuEU0zW4 < 0) {
            defpackage.z50.IHQe1A4L2xu("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return defpackage.li.AARZUJiTa(SH1y5HwkJhh, i, riuEU0zW4, i2);
    }

    public static final int SH1y5HwkJhh(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static final boolean adDC3e2L(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static java.lang.String ez2rX8ReCYw(long j) {
        int EXtogiMhuM = EXtogiMhuM(j);
        java.lang.String valueOf = EXtogiMhuM == Integer.MAX_VALUE ? "Infinity" : java.lang.String.valueOf(EXtogiMhuM);
        int AARZUJiTa = AARZUJiTa(j);
        return "Constraints(minWidth = " + SH1y5HwkJhh(j) + ", maxWidth = " + valueOf + ", minHeight = " + riuEU0zW4(j) + ", maxHeight = " + (AARZUJiTa != Integer.MAX_VALUE ? java.lang.String.valueOf(AARZUJiTa) : "Infinity") + ')';
    }

    public static final boolean oh6vYeIP(long j, long j2) {
        return j == j2;
    }

    public static final boolean r1MBDhnF(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final int riuEU0zW4(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final boolean xiZrDbcSW0(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ki) {
            return this.IHQe1A4L2xu == ((defpackage.ki) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return ez2rX8ReCYw(this.IHQe1A4L2xu);
    }
}
