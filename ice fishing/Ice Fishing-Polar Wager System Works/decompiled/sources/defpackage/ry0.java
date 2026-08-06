package defpackage;

/* loaded from: classes.dex */
public abstract class ry0 {
    public static final defpackage.frpfPPIgqM9O adDC3e2L;

    static {
        java.lang.Integer num = defpackage.s80.IHQe1A4L2xu;
        adDC3e2L = (num == null || num.intValue() >= 34) ? new defpackage.mv0() : new defpackage.zu();
    }

    public abstract int IHQe1A4L2xu(int i);

    public abstract int oh6vYeIP();

    public int r1MBDhnF(int i, int i2) {
        int oh6vYeIP;
        int i3;
        int i4;
        if (i2 <= i) {
            defpackage.db.ez2rX8ReCYw("Random range is empty: [", java.lang.Integer.valueOf(i), ", ", java.lang.Integer.valueOf(i2), ").");
            return 0;
        }
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = IHQe1A4L2xu(31 - java.lang.Integer.numberOfLeadingZeros(i5));
            } else {
                do {
                    oh6vYeIP = oh6vYeIP() >>> 1;
                    i3 = oh6vYeIP % i5;
                } while ((i5 - 1) + (oh6vYeIP - i3) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int oh6vYeIP2 = oh6vYeIP();
            if (i <= oh6vYeIP2 && oh6vYeIP2 < i2) {
                return oh6vYeIP2;
            }
        }
    }
}
