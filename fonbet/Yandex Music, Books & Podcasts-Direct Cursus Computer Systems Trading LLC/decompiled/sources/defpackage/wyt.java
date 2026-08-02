package defpackage;

/* loaded from: classes.dex */
public final class wyt implements uap {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public wyt(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.uap
    public final long c(long j) {
        return this.a[dvt.e(this.b, j, true)];
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        long[] jArr = this.a;
        int e = dvt.e(jArr, j, true);
        long j2 = jArr[e];
        long[] jArr2 = this.b;
        iap iapVar = new iap(j2, jArr2[e]);
        if (j2 >= j || e == jArr.length - 1) {
            return new eap(iapVar, iapVar);
        }
        int i = e + 1;
        return new eap(iapVar, new iap(jArr[i], jArr2[i]));
    }

    @Override // defpackage.uap
    public final long f() {
        return this.d;
    }

    @Override // defpackage.fap
    public final boolean g() {
        return true;
    }

    @Override // defpackage.uap
    public final int j() {
        return this.e;
    }

    @Override // defpackage.fap
    public final long k() {
        return this.c;
    }
}
