package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class f9i implements uap {
    public final long[] a;
    public final long[] b;
    public final long c;

    public f9i(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? dvt.Y(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        int e = dvt.e(jArr, j, true);
        long j2 = jArr[e];
        long j3 = jArr2[e];
        int i = e + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.uap
    public final long c(long j) {
        return dvt.Y(((Long) a(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        Pair a = a(dvt.m0(dvt.j(j, 0L, this.c)), this.b, this.a);
        iap iapVar = new iap(dvt.Y(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new eap(iapVar, iapVar);
    }

    @Override // defpackage.uap
    public final long f() {
        return -1L;
    }

    @Override // defpackage.fap
    public final boolean g() {
        return true;
    }

    @Override // defpackage.uap
    public final int j() {
        return -2147483647;
    }

    @Override // defpackage.fap
    public final long k() {
        return this.c;
    }
}
