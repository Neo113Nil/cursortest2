package defpackage;

/* loaded from: classes7.dex */
public final class ug81 implements zk71, a871 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;

    public ug81(long j, long j2, nd81 nd81Var) {
        int i = nd81Var.f;
        int i2 = nd81Var.c;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = j - j2;
            this.f = b(i, j, j2);
        }
    }

    public static long b(int i, long j, long j2) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // defpackage.zk71
    public final long a(long j) {
        return b(this.e, j, this.b);
    }

    @Override // defpackage.a871
    public final long c() {
        return this.f;
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1) {
            oe71 oe71Var = new oe71(0L, j3);
            return new v171(oe71Var, oe71Var);
        }
        int i = this.e;
        long j4 = this.c;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long b = b(i, max, j3);
        oe71 oe71Var2 = new oe71(b, max);
        if (j2 != -1 && b < j) {
            long j6 = max + j4;
            if (j6 < this.a) {
                return new v171(oe71Var2, new oe71(b(i, j6, j3), j6));
            }
        }
        return new v171(oe71Var2, oe71Var2);
    }

    @Override // defpackage.zk71
    public final long a() {
        return -1L;
    }

    @Override // defpackage.a871
    public final boolean b() {
        return this.d != -1;
    }
}
