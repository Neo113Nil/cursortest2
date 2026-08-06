package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class jo implements Comparable {
    public static final k61 OOA6hdeuvCS = new k61(27);
    public static final long EljAMC1QTz = n30.lv06NcmrQ(4611686018427387903L);
    public static final long AvO7iQsrTN = n30.lv06NcmrQ(-4611686018427387903L);

    public static final long GWasM1elztuh(long j, long j2) {
        long j3 = j2 / 1000000;
        long AvO7iQsrTN2 = n30.AvO7iQsrTN(j, j3);
        if (-4611686018426L > AvO7iQsrTN2 || AvO7iQsrTN2 >= 4611686018427L) {
            return n30.lv06NcmrQ(AvO7iQsrTN2);
        }
        long j4 = ((AvO7iQsrTN2 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = lo.GWasM1elztuh;
        return j4;
    }

    public static final long X1lG3V04pd(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = lo.GWasM1elztuh;
        return j2;
    }

    public static final long Yi7zF1RB1(long j, mo moVar) {
        if (j == EljAMC1QTz) {
            return Long.MAX_VALUE;
        }
        if (j == AvO7iQsrTN) {
            return Long.MIN_VALUE;
        }
        return moVar.OOA6hdeuvCS.convert(j >> 1, ((((int) j) & 1) == 0 ? mo.NANOSECONDS : mo.MILLISECONDS).OOA6hdeuvCS);
    }
}
