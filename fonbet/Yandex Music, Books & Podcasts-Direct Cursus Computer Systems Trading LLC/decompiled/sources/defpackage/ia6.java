package defpackage;

import kotlin.KotlinVersion;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class ia6 {
    public static final long a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            ume.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return a(0, i, 0, i2);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i < 262143) {
            return 18;
        }
        return KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int k = ga6.k(j);
        int i2 = ga6.i(j);
        if (i < k) {
            i = k;
        }
        if (i <= i2) {
            i2 = i;
        }
        int i3 = (int) (j2 & 4294967295L);
        int j3 = ga6.j(j);
        int h = ga6.h(j);
        if (i3 < j3) {
            i3 = j3;
        }
        if (i3 <= h) {
            h = i3;
        }
        return (i2 << 32) | (h & 4294967295L);
    }

    public static final long e(long j, long j2) {
        int k = ga6.k(j);
        int i = ga6.i(j);
        int j3 = ga6.j(j);
        int h = ga6.h(j);
        int k2 = ga6.k(j2);
        if (k2 < k) {
            k2 = k;
        }
        if (k2 > i) {
            k2 = i;
        }
        int i2 = ga6.i(j2);
        if (i2 >= k) {
            k = i2;
        }
        if (k <= i) {
            i = k;
        }
        int j4 = ga6.j(j2);
        if (j4 < j3) {
            j4 = j3;
        }
        if (j4 > h) {
            j4 = h;
        }
        int h2 = ga6.h(j2);
        if (h2 >= j3) {
            j3 = h2;
        }
        if (j3 <= h) {
            h = j3;
        }
        return a(k2, i, j4, h);
    }

    public static final int f(int i, long j) {
        int j2 = ga6.j(j);
        int h = ga6.h(j);
        if (i < j2) {
            i = j2;
        }
        return i > h ? h : i;
    }

    public static final int g(int i, long j) {
        int k = ga6.k(j);
        int i2 = ga6.i(j);
        if (i < k) {
            i = k;
        }
        return i > i2 ? i2 : i;
    }

    public static final long h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int c = c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int c2 = c(i6);
        if (c + c2 > 31) {
            j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = c2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (c2 + 2)) | ((i8 & (~(i8 >> 31))) << (c2 + 33));
    }

    public static final long i(long j, int i, int i2) {
        int k = ga6.k(j) + i;
        if (k < 0) {
            k = 0;
        }
        int i3 = ga6.i(j);
        if (i3 != Integer.MAX_VALUE && (i3 = i3 + i) < 0) {
            i3 = 0;
        }
        int j2 = ga6.j(j) + i2;
        if (j2 < 0) {
            j2 = 0;
        }
        int h = ga6.h(j);
        return a(k, i3, j2, (h == Integer.MAX_VALUE || (h = h + i2) >= 0) ? h : 0);
    }

    public static final void j(int i, int i2) {
        throw new IllegalArgumentException(dfi.f("Can't represent a width of ", i, i2, " and height of ", " in Constraints"));
    }

    @NotNull
    public static final Void k(int i) {
        throw new IllegalArgumentException(dfi.c(i, "Can't represent a size of ", " in Constraints"));
    }
}
