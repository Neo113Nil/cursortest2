package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class nk {
    public static /* synthetic */ long GE9mJIPrb8gP(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return e6mdH7fiFuta(i, i2, j);
    }

    public static final long JhCgjQRTAOCT(long j, long j2) {
        int i = (int) (j2 >> 32);
        int GE9mJIPrb8gP = defpackage.mk.GE9mJIPrb8gP(j);
        int P05cfTpS5W5L = defpackage.mk.P05cfTpS5W5L(j);
        if (i < GE9mJIPrb8gP) {
            i = GE9mJIPrb8gP;
        }
        if (i <= P05cfTpS5W5L) {
            P05cfTpS5W5L = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int e6mdH7fiFuta = defpackage.mk.e6mdH7fiFuta(j);
        int QiMR8OkAhezm = defpackage.mk.QiMR8OkAhezm(j);
        if (i2 < e6mdH7fiFuta) {
            i2 = e6mdH7fiFuta;
        }
        if (i2 <= QiMR8OkAhezm) {
            QiMR8OkAhezm = i2;
        }
        return (P05cfTpS5W5L << 32) | (QiMR8OkAhezm & 4294967295L);
    }

    public static final void Ns0WNyEWdPsk(int i, int i2) {
        throw new java.lang.IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final long P05cfTpS5W5L(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int fWTAfUmVKrZq = fWTAfUmVKrZq(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int fWTAfUmVKrZq2 = fWTAfUmVKrZq(i6);
        if (fWTAfUmVKrZq + fWTAfUmVKrZq2 > 31) {
            Ns0WNyEWdPsk(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = fWTAfUmVKrZq2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (fWTAfUmVKrZq2 + 2)) | ((i8 & (~(i8 >> 31))) << (fWTAfUmVKrZq2 + 33));
    }

    public static final int QiMR8OkAhezm(int i, long j) {
        int GE9mJIPrb8gP = defpackage.mk.GE9mJIPrb8gP(j);
        int P05cfTpS5W5L = defpackage.mk.P05cfTpS5W5L(j);
        if (i < GE9mJIPrb8gP) {
            i = GE9mJIPrb8gP;
        }
        return i > P05cfTpS5W5L ? P05cfTpS5W5L : i;
    }

    public static final long WDYagTQQm9ns(long j, long j2) {
        int GE9mJIPrb8gP = defpackage.mk.GE9mJIPrb8gP(j);
        int P05cfTpS5W5L = defpackage.mk.P05cfTpS5W5L(j);
        int e6mdH7fiFuta = defpackage.mk.e6mdH7fiFuta(j);
        int QiMR8OkAhezm = defpackage.mk.QiMR8OkAhezm(j);
        int GE9mJIPrb8gP2 = defpackage.mk.GE9mJIPrb8gP(j2);
        if (GE9mJIPrb8gP2 < GE9mJIPrb8gP) {
            GE9mJIPrb8gP2 = GE9mJIPrb8gP;
        }
        if (GE9mJIPrb8gP2 > P05cfTpS5W5L) {
            GE9mJIPrb8gP2 = P05cfTpS5W5L;
        }
        int P05cfTpS5W5L2 = defpackage.mk.P05cfTpS5W5L(j2);
        if (P05cfTpS5W5L2 >= GE9mJIPrb8gP) {
            GE9mJIPrb8gP = P05cfTpS5W5L2;
        }
        if (GE9mJIPrb8gP <= P05cfTpS5W5L) {
            P05cfTpS5W5L = GE9mJIPrb8gP;
        }
        int e6mdH7fiFuta2 = defpackage.mk.e6mdH7fiFuta(j2);
        if (e6mdH7fiFuta2 < e6mdH7fiFuta) {
            e6mdH7fiFuta2 = e6mdH7fiFuta;
        }
        if (e6mdH7fiFuta2 > QiMR8OkAhezm) {
            e6mdH7fiFuta2 = QiMR8OkAhezm;
        }
        int QiMR8OkAhezm2 = defpackage.mk.QiMR8OkAhezm(j2);
        if (QiMR8OkAhezm2 >= e6mdH7fiFuta) {
            e6mdH7fiFuta = QiMR8OkAhezm2;
        }
        if (e6mdH7fiFuta <= QiMR8OkAhezm) {
            QiMR8OkAhezm = e6mdH7fiFuta;
        }
        return ZpBGe2uQfcn8(GE9mJIPrb8gP2, P05cfTpS5W5L, e6mdH7fiFuta2, QiMR8OkAhezm);
    }

    public static final long ZpBGe2uQfcn8(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            defpackage.g80.ZpBGe2uQfcn8("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return P05cfTpS5W5L(i, i2, i3, i4);
    }

    public static final long e6mdH7fiFuta(int i, int i2, long j) {
        int GE9mJIPrb8gP = defpackage.mk.GE9mJIPrb8gP(j) + i;
        if (GE9mJIPrb8gP < 0) {
            GE9mJIPrb8gP = 0;
        }
        int P05cfTpS5W5L = defpackage.mk.P05cfTpS5W5L(j);
        if (P05cfTpS5W5L != Integer.MAX_VALUE && (P05cfTpS5W5L = P05cfTpS5W5L + i) < 0) {
            P05cfTpS5W5L = 0;
        }
        int e6mdH7fiFuta = defpackage.mk.e6mdH7fiFuta(j) + i2;
        if (e6mdH7fiFuta < 0) {
            e6mdH7fiFuta = 0;
        }
        int QiMR8OkAhezm = defpackage.mk.QiMR8OkAhezm(j);
        return ZpBGe2uQfcn8(GE9mJIPrb8gP, P05cfTpS5W5L, e6mdH7fiFuta, (QiMR8OkAhezm == Integer.MAX_VALUE || (QiMR8OkAhezm = QiMR8OkAhezm + i2) >= 0) ? QiMR8OkAhezm : 0);
    }

    public static final java.lang.Void fNwYGHIYeJcR(int i) {
        throw new java.lang.IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }

    public static final int fWTAfUmVKrZq(int i) {
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

    public static /* synthetic */ long giKS3J6vZuNy(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return ZpBGe2uQfcn8(i, i2, i3, i4);
    }

    public static final int oh71FJcDz6S2(int i, long j) {
        int e6mdH7fiFuta = defpackage.mk.e6mdH7fiFuta(j);
        int QiMR8OkAhezm = defpackage.mk.QiMR8OkAhezm(j);
        if (i < e6mdH7fiFuta) {
            i = e6mdH7fiFuta;
        }
        return i > QiMR8OkAhezm ? QiMR8OkAhezm : i;
    }
}
