package defpackage;

/* loaded from: classes.dex */
public final class bd0 implements defpackage.t31, defpackage.r31 {
    public final defpackage.ol0 AARZUJiTa;
    public final defpackage.u31 adDC3e2L;
    public final defpackage.r31 xiZrDbcSW0;

    public bd0(defpackage.t31 t31Var, java.util.Map map, defpackage.r31 r31Var) {
        defpackage.DFo87pBq1E5 dFo87pBq1E5 = new defpackage.DFo87pBq1E5(13, t31Var);
        defpackage.nc1 nc1Var = defpackage.w31.IHQe1A4L2xu;
        this.adDC3e2L = new defpackage.u31(map, dFo87pBq1E5);
        this.xiZrDbcSW0 = r31Var;
        defpackage.ol0 ol0Var = defpackage.a51.IHQe1A4L2xu;
        this.AARZUJiTa = new defpackage.ol0();
    }

    @Override // defpackage.t31
    public final boolean F7NU4MC0GW(java.lang.Object obj) {
        return this.adDC3e2L.F7NU4MC0GW(obj);
    }

    @Override // defpackage.t31
    public final defpackage.v5 IHQe1A4L2xu(java.lang.String str, defpackage.vz vzVar) {
        return this.adDC3e2L.IHQe1A4L2xu(str, vzVar);
    }

    @Override // defpackage.t31
    public final java.util.Map adDC3e2L() {
        defpackage.ol0 ol0Var = this.AARZUJiTa;
        java.lang.Object[] objArr = ol0Var.oh6vYeIP;
        long[] jArr = ol0Var.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.xiZrDbcSW0.r1MBDhnF(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.adDC3e2L.adDC3e2L();
    }

    @Override // defpackage.r31
    public final void oh6vYeIP(java.lang.Object obj, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        int i2;
        t10Var.QUKZkWRtw6(-858296452);
        if ((i & 6) == 0) {
            i2 = (t10Var.EXtogiMhuM(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= t10Var.EXtogiMhuM(sfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= t10Var.EXtogiMhuM(this) ? 256 : 128;
        }
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 147) != 146)) {
            this.xiZrDbcSW0.oh6vYeIP(obj, sfVar, t10Var, i2 & 126);
            boolean EXtogiMhuM = t10Var.EXtogiMhuM(this) | t10Var.EXtogiMhuM(obj);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.r1MBDhnF(10, this, obj);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.s21.oh6vYeIP(obj, (defpackage.g00) mAr5m2L7gYDP, t10Var);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.qf((defpackage.r31) this, obj, sfVar, i, 2);
        }
    }

    @Override // defpackage.r31
    public final void r1MBDhnF(java.lang.Object obj) {
        this.xiZrDbcSW0.r1MBDhnF(obj);
    }

    @Override // defpackage.t31
    public final java.lang.Object xiZrDbcSW0(java.lang.String str) {
        return this.adDC3e2L.xiZrDbcSW0(str);
    }
}
