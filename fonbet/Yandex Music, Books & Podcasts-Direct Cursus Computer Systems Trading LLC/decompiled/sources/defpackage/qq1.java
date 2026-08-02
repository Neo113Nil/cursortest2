package defpackage;

import androidx.compose.foundation.layout.a;

/* loaded from: classes.dex */
public final class qq1 extends xci implements epf {
    public float o;

    @Override // defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.o) : ffhVar.a(i);
    }

    @Override // defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.o) : ffhVar.G(i);
    }

    public final long S0(long j, boolean z) {
        int round;
        int h = ga6.h(j);
        if (h == Integer.MAX_VALUE || (round = Math.round(h * this.o)) <= 0) {
            return 0L;
        }
        if (!z || a.h(j, round, h)) {
            return (round << 32) | (h & 4294967295L);
        }
        return 0L;
    }

    public final long T0(long j, boolean z) {
        int round;
        int i = ga6.i(j);
        if (i == Integer.MAX_VALUE || (round = Math.round(i / this.o)) <= 0) {
            return 0L;
        }
        if (!z || a.h(j, i, round)) {
            return (i << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    public final long U0(long j, boolean z) {
        int j2 = ga6.j(j);
        int round = Math.round(j2 * this.o);
        if (round <= 0) {
            return 0L;
        }
        if (!z || a.h(j, round, j2)) {
            return (round << 32) | (j2 & 4294967295L);
        }
        return 0L;
    }

    public final long V0(long j, boolean z) {
        int k = ga6.k(j);
        int round = Math.round(k / this.o);
        if (round <= 0) {
            return 0L;
        }
        if (!z || a.h(j, k, round)) {
            return (k << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.o) : ffhVar.J(i);
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        long T0 = T0(j, true);
        if (hqe.a(T0, 0L)) {
            T0 = S0(j, true);
            if (hqe.a(T0, 0L)) {
                T0 = V0(j, true);
                if (hqe.a(T0, 0L)) {
                    T0 = U0(j, true);
                    if (hqe.a(T0, 0L)) {
                        T0 = T0(j, false);
                        if (hqe.a(T0, 0L)) {
                            T0 = S0(j, false);
                            if (hqe.a(T0, 0L)) {
                                T0 = V0(j, false);
                                if (hqe.a(T0, 0L)) {
                                    T0 = U0(j, false);
                                    if (hqe.a(T0, 0L)) {
                                        T0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!hqe.a(T0, 0L)) {
            int i = (int) (T0 >> 32);
            int i2 = (int) (T0 & 4294967295L);
            if (!((i2 >= 0) & (i >= 0))) {
                ume.a("width and height must be >= 0");
            }
            j = ia6.h(i, i, i2, i2);
        }
        ksk M = ffhVar.M(j);
        return mfh.m0(mfhVar, M.a, M.b, new ai0(M, 2));
    }

    @Override // defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.o) : ffhVar.z(i);
    }
}
