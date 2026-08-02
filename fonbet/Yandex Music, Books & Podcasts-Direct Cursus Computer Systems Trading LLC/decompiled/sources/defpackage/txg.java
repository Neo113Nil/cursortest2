package defpackage;

/* loaded from: classes.dex */
public final class txg extends xci implements epf {
    public int o;
    public int p;

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        long a;
        ffhVar.getClass();
        long d = ia6.d(j, nt0.p(this.o, this.p));
        if (ga6.h(j) == Integer.MAX_VALUE && ga6.i(j) != Integer.MAX_VALUE) {
            int i = (int) (d >> 32);
            int i2 = (this.p * i) / this.o;
            a = ia6.a(i, i, i2, i2);
        } else if (ga6.i(j) != Integer.MAX_VALUE || ga6.h(j) == Integer.MAX_VALUE) {
            int i3 = (int) (d >> 32);
            int i4 = (int) (d & 4294967295L);
            a = ia6.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (d & 4294967295L);
            int i6 = (this.o * i5) / this.p;
            a = ia6.a(i6, i6, i5, i5);
        }
        ksk M = ffhVar.M(a);
        return mfh.m0(mfhVar, M.a, M.b, new ai0(M, 11));
    }
}
