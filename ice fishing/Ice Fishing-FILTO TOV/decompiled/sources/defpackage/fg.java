package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class fg {
    public static final long AvO7iQsrTN(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int X1lG3V04pd = X1lG3V04pd(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int X1lG3V04pd2 = X1lG3V04pd(i6);
        if (X1lG3V04pd + X1lG3V04pd2 > 31) {
            mOu10nynGul(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = X1lG3V04pd2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (X1lG3V04pd2 + 2)) | ((i8 & (~(i8 >> 31))) << (X1lG3V04pd2 + 33));
    }

    public static final int EljAMC1QTz(int i, long j) {
        int JFJ3QoxA = eg.JFJ3QoxA(j);
        int encWxUiV2 = eg.encWxUiV2(j);
        if (i < JFJ3QoxA) {
            i = JFJ3QoxA;
        }
        return i > encWxUiV2 ? encWxUiV2 : i;
    }

    public static final long GWasM1elztuh(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            v10.GWasM1elztuh("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AvO7iQsrTN(i, i2, i3, i4);
    }

    public static final Void JFJ3QoxA(int i) {
        throw new IllegalArgumentException(mr0.encWxUiV2("Can't represent a size of ", i, " in Constraints"));
    }

    public static final int OOA6hdeuvCS(int i, long j) {
        int mOu10nynGul = eg.mOu10nynGul(j);
        int AvO7iQsrTN = eg.AvO7iQsrTN(j);
        if (i < mOu10nynGul) {
            i = mOu10nynGul;
        }
        return i > AvO7iQsrTN ? AvO7iQsrTN : i;
    }

    public static final int X1lG3V04pd(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static /* synthetic */ long Yi7zF1RB1(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return GWasM1elztuh(0, i, 0, i2);
    }

    public static final long encWxUiV2(int i, int i2, long j) {
        int JFJ3QoxA = eg.JFJ3QoxA(j) + i;
        if (JFJ3QoxA < 0) {
            JFJ3QoxA = 0;
        }
        int encWxUiV2 = eg.encWxUiV2(j);
        if (encWxUiV2 != Integer.MAX_VALUE && (encWxUiV2 = encWxUiV2 + i) < 0) {
            encWxUiV2 = 0;
        }
        int mOu10nynGul = eg.mOu10nynGul(j) + i2;
        if (mOu10nynGul < 0) {
            mOu10nynGul = 0;
        }
        int AvO7iQsrTN = eg.AvO7iQsrTN(j);
        return GWasM1elztuh(JFJ3QoxA, encWxUiV2, mOu10nynGul, (AvO7iQsrTN == Integer.MAX_VALUE || (AvO7iQsrTN = AvO7iQsrTN + i2) >= 0) ? AvO7iQsrTN : 0);
    }

    public static final void mOu10nynGul(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final long xqGvceK5x(long j, long j2) {
        int i = (int) (j2 >> 32);
        int JFJ3QoxA = eg.JFJ3QoxA(j);
        int encWxUiV2 = eg.encWxUiV2(j);
        if (i < JFJ3QoxA) {
            i = JFJ3QoxA;
        }
        if (i <= encWxUiV2) {
            encWxUiV2 = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int mOu10nynGul = eg.mOu10nynGul(j);
        int AvO7iQsrTN = eg.AvO7iQsrTN(j);
        if (i2 < mOu10nynGul) {
            i2 = mOu10nynGul;
        }
        if (i2 <= AvO7iQsrTN) {
            AvO7iQsrTN = i2;
        }
        return (encWxUiV2 << 32) | (AvO7iQsrTN & 4294967295L);
    }
}
