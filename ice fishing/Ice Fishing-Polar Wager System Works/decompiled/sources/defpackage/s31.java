package defpackage;

/* loaded from: classes.dex */
public final class s31 implements defpackage.r31 {
    public static final defpackage.F7NU4MC0GW riuEU0zW4 = new defpackage.F7NU4MC0GW(24, new defpackage.e6(17, 0), new defpackage.uc0(24));
    public defpackage.t31 AARZUJiTa;
    public final defpackage.DFo87pBq1E5 EXtogiMhuM;
    public final java.util.Map adDC3e2L;
    public final defpackage.nl0 xiZrDbcSW0;

    public s31(java.util.Map map) {
        this.adDC3e2L = map;
        long[] jArr = defpackage.z41.IHQe1A4L2xu;
        this.xiZrDbcSW0 = new defpackage.nl0();
        this.EXtogiMhuM = new defpackage.DFo87pBq1E5(23, this);
    }

    @Override // defpackage.r31
    public final void oh6vYeIP(java.lang.Object obj, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        int i2;
        t10Var.QUKZkWRtw6(533563200);
        int i3 = 4;
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
            t10Var.nVhUznk1t(obj);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
            if (mAr5m2L7gYDP == ad1Var) {
                defpackage.DFo87pBq1E5 dFo87pBq1E5 = this.EXtogiMhuM;
                if (!((java.lang.Boolean) dFo87pBq1E5.AARZUJiTa(obj)).booleanValue()) {
                    defpackage.db.QoRHpC4k("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                java.util.Map map = (java.util.Map) this.adDC3e2L.get(obj);
                defpackage.nc1 nc1Var = defpackage.w31.IHQe1A4L2xu;
                defpackage.x31 x31Var = new defpackage.x31(new defpackage.u31(map, dFo87pBq1E5));
                t10Var.OtkytngK3Mr(x31Var);
                mAr5m2L7gYDP = x31Var;
            }
            defpackage.x31 x31Var2 = (defpackage.x31) mAr5m2L7gYDP;
            defpackage.gq1.r1MBDhnF(new defpackage.ny0[]{defpackage.w31.IHQe1A4L2xu.IHQe1A4L2xu(x31Var2), defpackage.cf0.IHQe1A4L2xu.IHQe1A4L2xu(x31Var2)}, sfVar, t10Var, (i2 & 112) | 8);
            boolean EXtogiMhuM = t10Var.EXtogiMhuM(this) | t10Var.EXtogiMhuM(obj) | t10Var.EXtogiMhuM(x31Var2);
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM || mAr5m2L7gYDP2 == ad1Var) {
                mAr5m2L7gYDP2 = new defpackage.vi(this, obj, x31Var2, i3);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
            }
            defpackage.s21.oh6vYeIP(defpackage.ok1.IHQe1A4L2xu, (defpackage.g00) mAr5m2L7gYDP2, t10Var);
            if (t10Var.NHJTzaLwkd && t10Var.SiPhmbmu.riuEU0zW4 == t10Var.QQUzIjv3iOC5) {
                t10Var.QQUzIjv3iOC5 = -1;
                t10Var.NHJTzaLwkd = false;
            }
            t10Var.QoRHpC4k(false);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.qf((defpackage.r31) this, obj, sfVar, i, 4);
        }
    }

    @Override // defpackage.r31
    public final void r1MBDhnF(java.lang.Object obj) {
        if (this.xiZrDbcSW0.ez2rX8ReCYw(obj) == null) {
            this.adDC3e2L.remove(obj);
        }
    }
}
