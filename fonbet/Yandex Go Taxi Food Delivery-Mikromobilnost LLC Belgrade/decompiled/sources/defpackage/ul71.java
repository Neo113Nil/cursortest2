package defpackage;

/* loaded from: classes7.dex */
public final class ul71 implements a871 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public ul71(long j, long[] jArr, long[] jArr2) {
        if (jArr.length != jArr2.length) {
            w511.q();
            throw null;
        }
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // defpackage.a871
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.a871
    public final long c() {
        return this.c;
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        if (!this.d) {
            oe71 oe71Var = oe71.c;
            return new v171(oe71Var, oe71Var);
        }
        long[] jArr = this.b;
        int t = rf71.t(jArr, j, true);
        long j2 = jArr[t];
        long[] jArr2 = this.a;
        oe71 oe71Var2 = new oe71(j2, jArr2[t]);
        if (j2 == j || t == jArr.length - 1) {
            return new v171(oe71Var2, oe71Var2);
        }
        int i = t + 1;
        return new v171(oe71Var2, new oe71(jArr[i], jArr2[i]));
    }
}
