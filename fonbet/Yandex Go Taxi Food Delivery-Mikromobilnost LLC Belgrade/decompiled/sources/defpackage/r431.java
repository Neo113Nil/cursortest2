package defpackage;

/* loaded from: classes10.dex */
public final class r431 implements j7q0 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public r431(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.f7q0
    public final e7q0 b(long j) {
        long[] jArr = this.a;
        int e = tw21.e(jArr, j, true);
        long j2 = jArr[e];
        long[] jArr2 = this.b;
        h7q0 h7q0Var = new h7q0(j2, jArr2[e]);
        if (j2 >= j || e == jArr.length - 1) {
            return new e7q0(h7q0Var, h7q0Var);
        }
        int i = e + 1;
        return new e7q0(h7q0Var, new h7q0(jArr[i], jArr2[i]));
    }

    @Override // defpackage.f7q0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.j7q0
    public final long f(long j) {
        return this.a[tw21.e(this.b, j, true)];
    }

    @Override // defpackage.j7q0
    public final long i() {
        return this.d;
    }

    @Override // defpackage.j7q0
    public final int j() {
        return this.e;
    }

    @Override // defpackage.f7q0
    public final long k() {
        return this.c;
    }
}
