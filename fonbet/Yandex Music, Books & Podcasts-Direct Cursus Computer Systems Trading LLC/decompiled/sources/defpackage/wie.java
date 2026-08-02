package defpackage;

/* loaded from: classes.dex */
public final class wie implements fap {
    public final nug a;
    public final nug b;
    public long c;

    public wie(long j, long[] jArr, long[] jArr2) {
        vq1.v(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new nug(length);
            this.b = new nug(length);
        } else {
            int i = length + 1;
            nug nugVar = new nug(i);
            this.a = nugVar;
            nug nugVar2 = new nug(i);
            this.b = nugVar2;
            nugVar.a(0L);
            nugVar2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        nug nugVar = this.b;
        if (nugVar.b == 0) {
            iap iapVar = iap.c;
            return new eap(iapVar, iapVar);
        }
        int b = dvt.b(nugVar, j);
        long d = nugVar.d(b);
        nug nugVar2 = this.a;
        iap iapVar2 = new iap(d, nugVar2.d(b));
        if (d == j || b == nugVar.b - 1) {
            return new eap(iapVar2, iapVar2);
        }
        int i = b + 1;
        return new eap(iapVar2, new iap(nugVar.d(i), nugVar2.d(i)));
    }

    @Override // defpackage.fap
    public final boolean g() {
        return this.b.b > 0;
    }

    @Override // defpackage.fap
    public final long k() {
        return this.c;
    }
}
