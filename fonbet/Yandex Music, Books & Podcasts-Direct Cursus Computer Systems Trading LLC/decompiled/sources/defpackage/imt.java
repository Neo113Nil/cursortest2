package defpackage;

/* loaded from: classes.dex */
public final class imt extends xci implements epf {
    public float o;
    public float p;

    @Override // defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        int a = ffhVar.a(i);
        int L = !Float.isNaN(this.p) ? twgVar.L(this.p) : 0;
        return a < L ? L : a;
    }

    @Override // defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        int G = ffhVar.G(i);
        int L = !Float.isNaN(this.o) ? twgVar.L(this.o) : 0;
        return G < L ? L : G;
    }

    @Override // defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        int J = ffhVar.J(i);
        int L = !Float.isNaN(this.o) ? twgVar.L(this.o) : 0;
        return J < L ? L : J;
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        int k;
        int j2;
        if (Float.isNaN(this.o) || ga6.k(j) != 0) {
            k = ga6.k(j);
        } else {
            int L = mfhVar.L(this.o);
            k = ga6.i(j);
            if (L < 0) {
                L = 0;
            }
            if (L <= k) {
                k = L;
            }
        }
        int i = ga6.i(j);
        if (Float.isNaN(this.p) || ga6.j(j) != 0) {
            j2 = ga6.j(j);
        } else {
            int L2 = mfhVar.L(this.p);
            j2 = ga6.h(j);
            int i2 = L2 >= 0 ? L2 : 0;
            if (i2 <= j2) {
                j2 = i2;
            }
        }
        ksk M = ffhVar.M(ia6.a(k, i, j2, ga6.h(j)));
        return mfh.m0(mfhVar, M.a, M.b, new ai0(M, 19));
    }

    @Override // defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        int z = ffhVar.z(i);
        int L = !Float.isNaN(this.p) ? twgVar.L(this.p) : 0;
        return z < L ? L : z;
    }
}
