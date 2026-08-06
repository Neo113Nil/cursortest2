package defpackage;

/* loaded from: classes.dex */
public final class xz0 {
    public final defpackage.i7 AARZUJiTa;
    public final long F7NU4MC0GW;
    public final long IHQe1A4L2xu;
    public final long adDC3e2L;
    public final long oh6vYeIP;
    public final long r1MBDhnF;
    public final float[] xiZrDbcSW0;

    public xz0(long j, long j2, long j3, long j4, long j5, float[] fArr, defpackage.i7 i7Var) {
        this.IHQe1A4L2xu = j;
        this.oh6vYeIP = j2;
        this.r1MBDhnF = j3;
        this.F7NU4MC0GW = j4;
        this.adDC3e2L = j5;
        this.xiZrDbcSW0 = fArr;
        this.AARZUJiTa = i7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj != null && defpackage.xz0.class == obj.getClass()) {
            defpackage.xz0 xz0Var = (defpackage.xz0) obj;
            if (this.IHQe1A4L2xu == xz0Var.IHQe1A4L2xu && this.oh6vYeIP == xz0Var.oh6vYeIP && this.adDC3e2L == xz0Var.adDC3e2L && defpackage.z60.IHQe1A4L2xu(this.r1MBDhnF, xz0Var.r1MBDhnF) && defpackage.z60.IHQe1A4L2xu(this.F7NU4MC0GW, xz0Var.F7NU4MC0GW)) {
                float[] fArr = xz0Var.xiZrDbcSW0;
                float[] fArr2 = this.xiZrDbcSW0;
                if (fArr2 == null) {
                    if (fArr == null) {
                        equals = true;
                        return equals && this.AARZUJiTa == xz0Var.AARZUJiTa;
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (fArr != null) {
                        equals = fArr2.equals(fArr);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int r1MBDhnF = defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(java.lang.Long.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP), 31, this.adDC3e2L), 31, this.r1MBDhnF), 31, this.F7NU4MC0GW);
        float[] fArr = this.xiZrDbcSW0;
        return this.AARZUJiTa.hashCode() + ((r1MBDhnF + (fArr != null ? java.util.Arrays.hashCode(fArr) : 0)) * 31);
    }
}
