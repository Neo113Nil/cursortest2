package defpackage;

/* loaded from: classes7.dex */
public final class wf71 implements zk71 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public wf71(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.zk71
    public final long a(long j) {
        return this.a[rf71.t(this.b, j, true)];
    }

    @Override // defpackage.a871
    public final boolean b() {
        return true;
    }

    @Override // defpackage.a871
    public final long c() {
        return this.c;
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        long[] jArr = this.a;
        int t = rf71.t(jArr, j, true);
        long j2 = jArr[t];
        long[] jArr2 = this.b;
        oe71 oe71Var = new oe71(j2, jArr2[t]);
        if (j2 >= j || t == jArr.length - 1) {
            return new v171(oe71Var, oe71Var);
        }
        int i = t + 1;
        return new v171(oe71Var, new oe71(jArr[i], jArr2[i]));
    }

    @Override // defpackage.zk71
    public final long a() {
        return this.d;
    }
}
