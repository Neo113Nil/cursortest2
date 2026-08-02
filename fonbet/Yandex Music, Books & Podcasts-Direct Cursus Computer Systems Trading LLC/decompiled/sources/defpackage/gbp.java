package defpackage;

/* loaded from: classes.dex */
public final class gbp implements oq3 {
    public final hka a;
    public final long b;
    public final int c;
    public long d;
    public int e;

    public gbp(hka hkaVar, long j, int i, long j2, int i2) {
        this.a = hkaVar;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = i2;
    }

    public final float a() {
        long j = this.b;
        if (j != -1 && j != 0) {
            return (this.d * 100.0f) / j;
        }
        int i = this.c;
        if (i != 0) {
            return (this.e * 100.0f) / i;
        }
        return -1.0f;
    }

    @Override // defpackage.oq3
    public final void d(long j, long j2, long j3) {
        long j4 = this.d + j3;
        this.d = j4;
        this.a.c(a(), j4);
    }
}
