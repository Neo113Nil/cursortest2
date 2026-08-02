package defpackage;

/* loaded from: classes.dex */
public final class fbc extends xci implements epf {
    public k48 o;
    public float p;

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        int k;
        int i;
        int h;
        int i2;
        if (!ga6.e(j) || this.o == k48.a) {
            k = ga6.k(j);
            i = ga6.i(j);
        } else {
            int round = Math.round(ga6.i(j) * this.p);
            int k2 = ga6.k(j);
            k = ga6.i(j);
            if (round < k2) {
                round = k2;
            }
            if (round <= k) {
                k = round;
            }
            i = k;
        }
        if (!ga6.d(j) || this.o == k48.b) {
            int j2 = ga6.j(j);
            h = ga6.h(j);
            i2 = j2;
        } else {
            int round2 = Math.round(ga6.h(j) * this.p);
            int j3 = ga6.j(j);
            i2 = ga6.h(j);
            if (round2 < j3) {
                round2 = j3;
            }
            if (round2 <= i2) {
                i2 = round2;
            }
            h = i2;
        }
        ksk M = ffhVar.M(ia6.a(k, i, i2, h));
        return mfh.m0(mfhVar, M.a, M.b, new ai0(M, 8));
    }
}
