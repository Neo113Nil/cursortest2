package s2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {
    public static final long a(int i10, int i11, int i12, int i13) {
        if (!((i12 >= 0) & (i11 >= i10) & (i13 >= i12) & (i10 >= 0))) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(0, i10, 0, i11);
    }

    public static final int c(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    public static final long d(long j3, long j6) {
        int i10 = (int) (j6 >> 32);
        int j10 = a.j(j3);
        int h10 = a.h(j3);
        if (i10 < j10) {
            i10 = j10;
        }
        if (i10 <= h10) {
            h10 = i10;
        }
        int i11 = (int) (j6 & 4294967295L);
        int i12 = a.i(j3);
        int g8 = a.g(j3);
        if (i11 < i12) {
            i11 = i12;
        }
        if (i11 <= g8) {
            g8 = i11;
        }
        return (h10 << 32) | (g8 & 4294967295L);
    }

    public static final int e(int i10, long j3) {
        int i11 = a.i(j3);
        int g8 = a.g(j3);
        if (i10 < i11) {
            i10 = i11;
        }
        return i10 > g8 ? g8 : i10;
    }

    public static final int f(int i10, long j3) {
        int j6 = a.j(j3);
        int h10 = a.h(j3);
        if (i10 < j6) {
            i10 = j6;
        }
        return i10 > h10 ? h10 : i10;
    }

    public static final long g(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int c3 = c(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int c7 = c(i15);
        if (c3 + c7 > 31) {
            i(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i13 + 1;
        int i18 = c7 - 13;
        return ((i16 & (~(i16 >> 31))) << 33) | ((i18 >> 1) + (i18 & 1)) | (i10 << 2) | (i12 << (c7 + 2)) | ((i17 & (~(i17 >> 31))) << (c7 + 33));
    }

    public static final long h(int i10, int i11, long j3) {
        int j6 = a.j(j3) + i10;
        if (j6 < 0) {
            j6 = 0;
        }
        int h10 = a.h(j3);
        if (h10 != Integer.MAX_VALUE && (h10 = h10 + i10) < 0) {
            h10 = 0;
        }
        int i12 = a.i(j3) + i11;
        if (i12 < 0) {
            i12 = 0;
        }
        int g8 = a.g(j3);
        return a(j6, h10, i12, (g8 == Integer.MAX_VALUE || (g8 = g8 + i11) >= 0) ? g8 : 0);
    }

    public static final void i(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    public static final Void j(int i10) {
        throw new IllegalArgumentException(a4.d.h("Can't represent a size of ", i10, " in Constraints"));
    }
}
