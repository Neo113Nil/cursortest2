package s2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f6381a;

    public static long a(long j3, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = j(j3);
        }
        if ((i14 & 2) != 0) {
            i11 = h(j3);
        }
        if ((i14 & 4) != 0) {
            i12 = i(j3);
        }
        if ((i14 & 8) != 0) {
            i13 = g(j3);
        }
        if (i11 < i10 || i13 < i12 || i10 < 0 || i12 < 0) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.g(i10, i11, i12, i13);
    }

    public static final boolean b(long j3, long j6) {
        return j3 == j6;
    }

    public static final boolean c(long j3) {
        int i10 = (int) (3 & j3);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j3 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean d(long j3) {
        int i10 = (int) (3 & j3);
        return (((int) (j3 >> 33)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j3) {
        int i10 = (int) (3 & j3);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j3 >> (i11 + 15))) & i12;
        int i14 = ((int) (j3 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    public static final boolean f(long j3) {
        int i10 = (int) (3 & j3);
        int i11 = (1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1;
        int i12 = ((int) (j3 >> 2)) & i11;
        int i13 = ((int) (j3 >> 33)) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final int g(long j3) {
        int i10 = (int) (3 & j3);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j3 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int h(long j3) {
        int i10 = (int) (3 & j3);
        int i11 = (int) (j3 >> 33);
        int i12 = i11 & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int i(long j3) {
        int i10 = (int) (3 & j3);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j3 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int j(long j3) {
        int i10 = (int) (3 & j3);
        return ((int) (j3 >> 2)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j3) {
        int h10 = h(j3);
        String valueOf = h10 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h10);
        int g8 = g(j3);
        return "Constraints(minWidth = " + j(j3) + ", maxWidth = " + valueOf + ", minHeight = " + i(j3) + ", maxHeight = " + (g8 != Integer.MAX_VALUE ? String.valueOf(g8) : "Infinity") + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f6381a == ((a) obj).f6381a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6381a);
    }

    public final String toString() {
        return k(this.f6381a);
    }
}
