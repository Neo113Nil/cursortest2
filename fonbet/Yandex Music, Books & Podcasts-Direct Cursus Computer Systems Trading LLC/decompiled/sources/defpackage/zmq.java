package defpackage;

/* loaded from: classes.dex */
public final class zmq extends xci implements epf {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    @Override // defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        long S0 = S0(twgVar);
        if (ga6.f(S0)) {
            return ga6.h(S0);
        }
        if (!this.s) {
            i = ia6.g(i, S0);
        }
        return ia6.f(ffhVar.a(i), S0);
    }

    @Override // defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        long S0 = S0(twgVar);
        if (ga6.g(S0)) {
            return ga6.i(S0);
        }
        if (!this.s) {
            i = ia6.f(i, S0);
        }
        return ia6.g(ffhVar.G(i), S0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long S0(mfh mfhVar) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (Float.isNaN(this.q)) {
            i = Integer.MAX_VALUE;
        } else {
            i = mfhVar.L(this.q);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.r)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = mfhVar.L(this.r);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!Float.isNaN(this.o)) {
            i3 = mfhVar.L(this.o);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.p)) {
            int L = mfhVar.L(this.p);
            if (L < 0) {
                L = 0;
            }
            if (L > i2) {
                L = i2;
            }
            if (L != Integer.MAX_VALUE) {
                i4 = L;
            }
        }
        return ia6.a(i3, i, i4, i2);
    }

    @Override // defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        long S0 = S0(twgVar);
        if (ga6.g(S0)) {
            return ga6.i(S0);
        }
        if (!this.s) {
            i = ia6.f(i, S0);
        }
        return ia6.g(ffhVar.J(i), S0);
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        int k;
        int i;
        int j2;
        int h;
        long a;
        long S0 = S0(mfhVar);
        if (this.s) {
            a = ia6.e(j, S0);
        } else {
            if (Float.isNaN(this.o)) {
                k = ga6.k(j);
                int i2 = ga6.i(S0);
                if (k > i2) {
                    k = i2;
                }
            } else {
                k = ga6.k(S0);
            }
            if (Float.isNaN(this.q)) {
                i = ga6.i(j);
                int k2 = ga6.k(S0);
                if (i < k2) {
                    i = k2;
                }
            } else {
                i = ga6.i(S0);
            }
            if (Float.isNaN(this.p)) {
                j2 = ga6.j(j);
                int h2 = ga6.h(S0);
                if (j2 > h2) {
                    j2 = h2;
                }
            } else {
                j2 = ga6.j(S0);
            }
            if (Float.isNaN(this.r)) {
                h = ga6.h(j);
                int j3 = ga6.j(S0);
                if (h < j3) {
                    h = j3;
                }
            } else {
                h = ga6.h(S0);
            }
            a = ia6.a(k, i, j2, h);
        }
        ksk M = ffhVar.M(a);
        return mfh.m0(mfhVar, M.a, M.b, new ai0(M, 15));
    }

    @Override // defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        long S0 = S0(twgVar);
        if (ga6.f(S0)) {
            return ga6.h(S0);
        }
        if (!this.s) {
            i = ia6.g(i, S0);
        }
        return ia6.f(ffhVar.z(i), S0);
    }
}
