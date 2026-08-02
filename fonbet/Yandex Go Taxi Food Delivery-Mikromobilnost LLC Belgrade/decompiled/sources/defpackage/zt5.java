package defpackage;

/* loaded from: classes10.dex */
public final class zt5 {
    public static final zt5 d = new zt5(-3, -9223372036854775807L, -1);
    public static final zt5 e = new zt5(-3, -9223372036854775807L, -1);
    public static zt5 f;
    public int a;
    public long b;
    public long c;

    public /* synthetic */ zt5(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public void a(double d2, double d3, long j) {
        double d4 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d5 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.a = 1;
            this.b = -1L;
            this.c = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.a = 0;
                this.b = -1L;
                this.c = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.b = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.c = round;
            if (round >= j || this.b <= j) {
                this.a = 1;
            } else {
                this.a = 0;
            }
        }
    }
}
