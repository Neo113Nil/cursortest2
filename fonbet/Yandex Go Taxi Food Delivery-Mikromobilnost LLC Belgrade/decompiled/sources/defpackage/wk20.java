package defpackage;

import android.util.Pair;

/* loaded from: classes10.dex */
public final class wk20 implements j7q0 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public wk20(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? tw21.W(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        int e = tw21.e(jArr, j, true);
        long j2 = jArr[e];
        long j3 = jArr2[e];
        int i = e + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.f7q0
    public final e7q0 b(long j) {
        Pair a = a(tw21.l0(tw21.j(j, 0L, this.c)), this.b, this.a);
        h7q0 h7q0Var = new h7q0(tw21.W(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new e7q0(h7q0Var, h7q0Var);
    }

    @Override // defpackage.f7q0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.j7q0
    public final long f(long j) {
        return tw21.W(((Long) a(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.j7q0
    public final long i() {
        return -1L;
    }

    @Override // defpackage.j7q0
    public final int j() {
        return -2147483647;
    }

    @Override // defpackage.f7q0
    public final long k() {
        return this.c;
    }
}
