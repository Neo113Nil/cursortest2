package defpackage;

/* loaded from: classes.dex */
public abstract class li {
    public static final long AARZUJiTa(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int r1MBDhnF = r1MBDhnF(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int r1MBDhnF2 = r1MBDhnF(i6);
        if (r1MBDhnF + r1MBDhnF2 > 31) {
            riuEU0zW4(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = r1MBDhnF2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (r1MBDhnF2 + 2)) | ((i8 & (~(i8 >> 31))) << (r1MBDhnF2 + 33));
    }

    public static final long EXtogiMhuM(int i, int i2, long j) {
        int SH1y5HwkJhh = defpackage.ki.SH1y5HwkJhh(j) + i;
        if (SH1y5HwkJhh < 0) {
            SH1y5HwkJhh = 0;
        }
        int EXtogiMhuM = defpackage.ki.EXtogiMhuM(j);
        if (EXtogiMhuM != Integer.MAX_VALUE && (EXtogiMhuM = EXtogiMhuM + i) < 0) {
            EXtogiMhuM = 0;
        }
        int riuEU0zW4 = defpackage.ki.riuEU0zW4(j) + i2;
        if (riuEU0zW4 < 0) {
            riuEU0zW4 = 0;
        }
        int AARZUJiTa = defpackage.ki.AARZUJiTa(j);
        return IHQe1A4L2xu(SH1y5HwkJhh, EXtogiMhuM, riuEU0zW4, (AARZUJiTa == Integer.MAX_VALUE || (AARZUJiTa = AARZUJiTa + i2) >= 0) ? AARZUJiTa : 0);
    }

    public static final long F7NU4MC0GW(long j, long j2) {
        int i = (int) (j2 >> 32);
        int SH1y5HwkJhh = defpackage.ki.SH1y5HwkJhh(j);
        int EXtogiMhuM = defpackage.ki.EXtogiMhuM(j);
        if (i < SH1y5HwkJhh) {
            i = SH1y5HwkJhh;
        }
        if (i <= EXtogiMhuM) {
            EXtogiMhuM = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int riuEU0zW4 = defpackage.ki.riuEU0zW4(j);
        int AARZUJiTa = defpackage.ki.AARZUJiTa(j);
        if (i2 < riuEU0zW4) {
            i2 = riuEU0zW4;
        }
        if (i2 <= AARZUJiTa) {
            AARZUJiTa = i2;
        }
        return (EXtogiMhuM << 32) | (AARZUJiTa & 4294967295L);
    }

    public static final long IHQe1A4L2xu(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            defpackage.z50.IHQe1A4L2xu("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AARZUJiTa(i, i2, i3, i4);
    }

    public static final java.lang.Void SH1y5HwkJhh(int i) {
        throw new java.lang.IllegalArgumentException(defpackage.fx0.riuEU0zW4(i, "Can't represent a size of ", " in Constraints"));
    }

    public static final int adDC3e2L(int i, long j) {
        int riuEU0zW4 = defpackage.ki.riuEU0zW4(j);
        int AARZUJiTa = defpackage.ki.AARZUJiTa(j);
        if (i < riuEU0zW4) {
            i = riuEU0zW4;
        }
        return i > AARZUJiTa ? AARZUJiTa : i;
    }

    public static /* synthetic */ long oh6vYeIP(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return IHQe1A4L2xu(0, i, 0, i2);
    }

    public static final int r1MBDhnF(int i) {
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

    public static final void riuEU0zW4(int i, int i2) {
        throw new java.lang.IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final int xiZrDbcSW0(int i, long j) {
        int SH1y5HwkJhh = defpackage.ki.SH1y5HwkJhh(j);
        int EXtogiMhuM = defpackage.ki.EXtogiMhuM(j);
        if (i < SH1y5HwkJhh) {
            i = SH1y5HwkJhh;
        }
        return i > EXtogiMhuM ? EXtogiMhuM : i;
    }
}
