package defpackage;

/* loaded from: classes7.dex */
public final class tc81 implements a871 {
    public final lhc0 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public tc81(lhc0 lhc0Var, int i, long j, long j2) {
        this.a = lhc0Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / lhc0Var.d;
        this.d = j3;
        this.e = rf71.h(j3 * i, 1000000L, lhc0Var.c);
    }

    @Override // defpackage.a871
    public final boolean b() {
        return true;
    }

    @Override // defpackage.a871
    public final long c() {
        return this.e;
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        lhc0 lhc0Var = this.a;
        int i = lhc0Var.c;
        long j2 = this.b;
        long j3 = this.d - 1;
        int i2 = rf71.a;
        long max = Math.max(0L, Math.min((i * j) / (1000000 * j2), j3));
        int i3 = lhc0Var.d;
        long j4 = this.c;
        long h = rf71.h(max * j2, 1000000L, i);
        oe71 oe71Var = new oe71(h, (i3 * max) + j4);
        if (h >= j || max == j3) {
            return new v171(oe71Var, oe71Var);
        }
        long j5 = max + 1;
        return new v171(oe71Var, new oe71(rf71.h(j5 * j2, 1000000L, i), (i3 * j5) + j4));
    }
}
