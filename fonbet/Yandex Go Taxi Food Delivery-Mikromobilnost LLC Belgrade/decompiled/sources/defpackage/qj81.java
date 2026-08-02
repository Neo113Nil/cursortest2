package defpackage;

import android.util.Pair;

/* loaded from: classes7.dex */
public final class qj81 implements zk71 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public qj81(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? rf71.g(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair b(long j, long[] jArr, long[] jArr2) {
        int t = rf71.t(jArr, j, true);
        long j2 = jArr[t];
        long j3 = jArr2[t];
        int i = t + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.zk71
    public final long a(long j) {
        return rf71.g(((Long) b(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.a871
    public final long c() {
        return this.c;
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        int i = rf71.a;
        Pair b = b(rf71.u(Math.max(0L, Math.min(j, this.c))), this.b, this.a);
        oe71 oe71Var = new oe71(rf71.g(((Long) b.first).longValue()), ((Long) b.second).longValue());
        return new v171(oe71Var, oe71Var);
    }

    @Override // defpackage.zk71
    public final long a() {
        return -1L;
    }

    @Override // defpackage.a871
    public final boolean b() {
        return true;
    }
}
