package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class je0 {
    public static je0 wxUZMvaN;
    public int MdtA4re8;
    public long NCTxEWno;
    public long qoPGr6Ce;

    public final void qoPGr6Ce(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.MdtA4re8 = 1;
            this.qoPGr6Ce = -1L;
            this.NCTxEWno = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.MdtA4re8 = 0;
                this.qoPGr6Ce = -1L;
                this.NCTxEWno = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.qoPGr6Ce = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.NCTxEWno = round;
            if (round >= j || this.qoPGr6Ce <= j) {
                this.MdtA4re8 = 1;
            } else {
                this.MdtA4re8 = 0;
            }
        }
    }
}
