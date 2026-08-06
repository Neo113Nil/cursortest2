package defpackage;

/* loaded from: classes.dex */
public final class o4 extends defpackage.ga0 {
    public defpackage.gi1 EgCjBq0SZwJ;
    public long V7bD7b8KA;
    public defpackage.sl0 fnWB2E7cs;
    public defpackage.p4 kNAkVymC;

    @Override // defpackage.lj0
    public final void juTJww2r() {
        this.V7bD7b8KA = -9223372034707292160L;
    }

    @Override // defpackage.da0
    public final defpackage.ji0 nVhUznk1t(defpackage.ki0 ki0Var, defpackage.di0 di0Var, long j) {
        long j2;
        defpackage.bv0 xiZrDbcSW0 = di0Var.xiZrDbcSW0(j);
        if (ki0Var.cnag84Bm()) {
            j2 = (xiZrDbcSW0.adDC3e2L << 32) | (xiZrDbcSW0.xiZrDbcSW0 & 4294967295L);
        } else {
            defpackage.gi1 gi1Var = this.EgCjBq0SZwJ;
            int i = xiZrDbcSW0.adDC3e2L;
            if (gi1Var == null) {
                j2 = (i << 32) | (xiZrDbcSW0.xiZrDbcSW0 & 4294967295L);
                this.V7bD7b8KA = j2;
            } else {
                long j3 = (xiZrDbcSW0.xiZrDbcSW0 & 4294967295L) | (i << 32);
                defpackage.fi1 IHQe1A4L2xu = gi1Var.IHQe1A4L2xu(new defpackage.n4(this, j3, 0), new defpackage.n4(this, j3, 1));
                this.kNAkVymC.getClass();
                j2 = ((defpackage.i70) IHQe1A4L2xu.getValue()).IHQe1A4L2xu;
                this.V7bD7b8KA = ((defpackage.i70) IHQe1A4L2xu.getValue()).IHQe1A4L2xu;
            }
        }
        return ki0Var.EoOhNTTfIN7K((int) (j2 >> 32), (int) (4294967295L & j2), defpackage.ot.adDC3e2L, new defpackage.m4(this, xiZrDbcSW0, j2));
    }
}
