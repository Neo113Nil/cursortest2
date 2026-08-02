package defpackage;

import java.util.Random;

/* loaded from: classes5.dex */
public final class lzb {
    public Random a;
    public long b;
    public double c;
    public double d;
    public long e;

    public final long a() {
        long j = this.e;
        double d = j;
        this.e = Math.min((long) (this.c * d), this.b);
        double d2 = this.d;
        double d3 = (-d2) * d;
        double d4 = d2 * d;
        o2g.L(d4 >= d3);
        return j + ((long) ((this.a.nextDouble() * (d4 - d3)) + d3));
    }
}
