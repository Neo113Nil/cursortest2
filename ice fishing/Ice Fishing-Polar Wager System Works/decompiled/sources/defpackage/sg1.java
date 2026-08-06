package defpackage;

/* loaded from: classes.dex */
public final class sg1 {
    public float[] AARZUJiTa;
    public long F7NU4MC0GW;
    public final defpackage.xk0 IHQe1A4L2xu;
    public long adDC3e2L;
    public defpackage.rg1 oh6vYeIP;
    public long r1MBDhnF;
    public long xiZrDbcSW0;

    public sg1() {
        defpackage.xk0 xk0Var = defpackage.y60.IHQe1A4L2xu;
        this.IHQe1A4L2xu = new defpackage.xk0();
        this.r1MBDhnF = -1L;
        this.F7NU4MC0GW = 0L;
        this.adDC3e2L = 0L;
    }

    public final void IHQe1A4L2xu(defpackage.rg1 rg1Var, long j, long j2, float[] fArr, long j3) {
        long j4 = rg1Var.AARZUJiTa;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            rg1Var.AARZUJiTa = j3;
            rg1Var.IHQe1A4L2xu(rg1Var.adDC3e2L, rg1Var.xiZrDbcSW0, j, j2, fArr);
        }
    }

    public final boolean oh6vYeIP(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (defpackage.z60.IHQe1A4L2xu(j2, this.F7NU4MC0GW)) {
            z = false;
        } else {
            this.F7NU4MC0GW = j2;
            z = true;
        }
        if (!defpackage.z60.IHQe1A4L2xu(j, this.adDC3e2L)) {
            this.adDC3e2L = j;
            z = true;
        }
        if (fArr != null) {
            this.AARZUJiTa = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.xiZrDbcSW0) {
            return z;
        }
        this.xiZrDbcSW0 = j3;
        return true;
    }
}
