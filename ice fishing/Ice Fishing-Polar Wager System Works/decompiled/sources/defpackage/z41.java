package defpackage;

/* loaded from: classes.dex */
public abstract class z41 {
    public static final long[] IHQe1A4L2xu = {-9187201950435737345L, -1};

    static {
        new defpackage.nl0(0);
    }

    public static final int F7NU4MC0GW(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }

    public static final int IHQe1A4L2xu(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int oh6vYeIP(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int r1MBDhnF(int i) {
        if (i > 0) {
            return (-1) >>> java.lang.Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }
}
