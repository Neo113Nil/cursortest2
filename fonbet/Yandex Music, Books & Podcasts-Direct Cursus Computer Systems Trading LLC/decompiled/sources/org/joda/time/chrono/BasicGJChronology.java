package org.joda.time.chrono;

/* loaded from: classes5.dex */
abstract class BasicGJChronology extends BasicChronology {
    public static final int[] H0 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] I0 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final long[] J0 = new long[12];
    public static final long[] K0 = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        long j = 0;
        int i = 0;
        long j2 = 0;
        while (i < 11) {
            j += H0[i] * 86400000;
            int i2 = i + 1;
            J0[i2] = j;
            j2 += I0[i] * 86400000;
            K0[i2] = j2;
            i = i2;
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public final long a0(int i, int i2) {
        return h0(i) ? K0[i2 - 1] : J0[i2 - 1];
    }

    public final int i0(int i, int i2) {
        return h0(i) ? I0[i2 - 1] : H0[i2 - 1];
    }

    public final int j0(int i, long j) {
        int f0 = (int) ((j - f0(i)) >> 10);
        if (h0(i)) {
            if (f0 < 15356250) {
                if (f0 < 7678125) {
                    if (f0 < 2615625) {
                        return 1;
                    }
                    return f0 < 5062500 ? 2 : 3;
                }
                if (f0 < 10209375) {
                    return 4;
                }
                return f0 < 12825000 ? 5 : 6;
            }
            if (f0 < 23118750) {
                if (f0 < 17971875) {
                    return 7;
                }
                return f0 < 20587500 ? 8 : 9;
            }
            if (f0 >= 25734375) {
                return f0 < 28265625 ? 11 : 12;
            }
        } else {
            if (f0 < 15271875) {
                if (f0 < 7593750) {
                    if (f0 < 2615625) {
                        return 1;
                    }
                    return f0 < 4978125 ? 2 : 3;
                }
                if (f0 < 10125000) {
                    return 4;
                }
                return f0 < 12740625 ? 5 : 6;
            }
            if (f0 < 23034375) {
                if (f0 < 17887500) {
                    return 7;
                }
                return f0 < 20503125 ? 8 : 9;
            }
            if (f0 >= 25650000) {
                return f0 < 28181250 ? 11 : 12;
            }
        }
        return 10;
    }

    public final boolean k0(long j) {
        return this.y.b(j) == 29 && this.D.r(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (h0(r6) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l0(int i, long j) {
        int e0 = e0(j);
        int f0 = (int) ((j - f0(e0)) / 86400000);
        int i2 = f0 + 1;
        int Y = BasicChronology.Y(j);
        if (i2 > 59) {
            if (!h0(e0)) {
                if (h0(i)) {
                    f0 += 2;
                }
            }
            return g0(i, 1, f0) + Y;
        }
        f0 = i2;
        return g0(i, 1, f0) + Y;
    }
}
