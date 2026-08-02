package defpackage;

import java.util.List;

/* loaded from: classes7.dex */
public abstract class tt71 extends ea81 {
    public final long d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;

    public tt71(of81 of81Var, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(of81Var, j, j2);
        this.d = j3;
        this.e = j4;
        this.f = list;
        this.i = j5;
        this.g = j6;
        this.h = j7;
    }

    public abstract long b(long j);

    public final long c(long j, long j2) {
        long b = b(j);
        long j3 = this.d;
        if (b == -1) {
            long j4 = this.g;
            if (j4 != -9223372036854775807L) {
                return Math.max(j3, h((j2 - this.h) - j4, j));
            }
        }
        return j3;
    }

    public abstract of81 d(jw71 jw71Var, long j);

    public boolean e() {
        return this.f != null;
    }

    public final long f(long j) {
        List list = this.f;
        long j2 = this.d;
        return rf71.h(list != null ? ((q381) list.get((int) (j - j2))).a - this.c : (j - j2) * this.e, 1000000L, this.b);
    }

    public final long g(long j, long j2) {
        long j3 = this.b;
        long j4 = this.d;
        List list = this.f;
        if (list != null) {
            return (((q381) list.get((int) (j - j4))).b * 1000000) / j3;
        }
        long b = b(j2);
        return (b == -1 || j != (j4 + b) - 1) ? (this.e * 1000000) / j3 : j2 - f(j);
    }

    public final long h(long j, long j2) {
        long b = b(j2);
        long j3 = this.d;
        if (b != 0) {
            if (this.f != null) {
                long j4 = (b + j3) - 1;
                long j5 = j3;
                while (j5 <= j4) {
                    long j6 = ((j4 - j5) / 2) + j5;
                    long f = f(j6);
                    if (f < j) {
                        j5 = j6 + 1;
                    } else {
                        if (f <= j) {
                            return j6;
                        }
                        j4 = j6 - 1;
                    }
                }
                return j5 == j3 ? j5 : j4;
            }
            long j7 = (j / ((this.e * 1000000) / this.b)) + j3;
            if (j7 >= j3) {
                return b == -1 ? j7 : Math.min(j7, (j3 + b) - 1);
            }
        }
        return j3;
    }
}
