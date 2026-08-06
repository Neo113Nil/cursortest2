package defpackage;

/* loaded from: classes.dex */
public abstract class zr implements java.lang.Comparable {
    public static final defpackage.ad1 adDC3e2L = new defpackage.ad1(26);
    public static final long xiZrDbcSW0 = defpackage.x70.NHJTzaLwkd(4611686018427387903L);
    public static final long AARZUJiTa = defpackage.x70.NHJTzaLwkd(-4611686018427387903L);

    public static final long IHQe1A4L2xu(long j, long j2) {
        long j3 = j2 / 1000000;
        long JlrlGoKF = defpackage.x70.JlrlGoKF(j, j3);
        if (-4611686018426L > JlrlGoKF || JlrlGoKF >= 4611686018427L) {
            return defpackage.x70.NHJTzaLwkd(JlrlGoKF);
        }
        long j4 = ((JlrlGoKF * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = defpackage.as.IHQe1A4L2xu;
        return j4;
    }

    public static final long oh6vYeIP(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? IHQe1A4L2xu(j >> 1, j2 >> 1) : IHQe1A4L2xu(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return defpackage.x70.NHJTzaLwkd(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = defpackage.as.IHQe1A4L2xu;
            return j4;
        }
        long JlrlGoKF = defpackage.x70.JlrlGoKF(j >> 1, j2 >> 1);
        if (JlrlGoKF == 9223372036854759646L) {
            defpackage.db.fnWB2E7cs("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (JlrlGoKF == 4611686018427387903L || JlrlGoKF == -4611686018427387903L) {
            return defpackage.x70.NHJTzaLwkd(JlrlGoKF);
        }
        if (-4611686018426L > JlrlGoKF || JlrlGoKF >= 4611686018427L) {
            return defpackage.x70.NHJTzaLwkd(defpackage.x80.DFo87pBq1E5(JlrlGoKF, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (JlrlGoKF * 1000000) << 1;
        int i3 = defpackage.as.IHQe1A4L2xu;
        return j5;
    }
}
