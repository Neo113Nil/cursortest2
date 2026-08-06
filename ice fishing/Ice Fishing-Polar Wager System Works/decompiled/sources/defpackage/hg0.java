package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hg0 implements defpackage.k00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ com.corsair.ledger.MainActivity xiZrDbcSW0;

    public /* synthetic */ hg0(com.corsair.ledger.MainActivity mainActivity, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = mainActivity;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        com.corsair.ledger.MainActivity mainActivity = this.xiZrDbcSW0;
        int i2 = 1;
        defpackage.t10 t10Var = (defpackage.t10) obj;
        int intValue = ((java.lang.Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = com.corsair.ledger.MainActivity.nBH8hAHy;
                if (!t10Var.lpprD5VAS(intValue & 1, (intValue & 3) != 2)) {
                    t10Var.WLpAkxCo();
                    return ok1Var;
                }
                t10Var.RmCzwkUxICV(1890788296);
                defpackage.cn1 IHQe1A4L2xu = defpackage.df0.IHQe1A4L2xu(t10Var);
                if (IHQe1A4L2xu != null) {
                    defpackage.w30 G3OKOH3wZRC = defpackage.w70.G3OKOH3wZRC(IHQe1A4L2xu, t10Var);
                    t10Var.RmCzwkUxICV(1729797275);
                    defpackage.vm1 v5iciZok = defpackage.l80.v5iciZok(defpackage.lg0.class, IHQe1A4L2xu, G3OKOH3wZRC, IHQe1A4L2xu instanceof defpackage.h30 ? ((defpackage.h30) IHQe1A4L2xu).xiZrDbcSW0() : defpackage.dk.oh6vYeIP, t10Var);
                    t10Var.QoRHpC4k(false);
                    t10Var.QoRHpC4k(false);
                    defpackage.sl0 PAEGRtP0bX = defpackage.mj1.PAEGRtP0bX(((defpackage.lg0) v5iciZok).oh6vYeIP, t10Var);
                    int ordinal = ((defpackage.jg1) PAEGRtP0bX.getValue()).ordinal();
                    if (ordinal == 0) {
                        t10Var.AsxAYCCkb3Hi(2145326736);
                        boolean z = (((android.content.res.Configuration) t10Var.SH1y5HwkJhh(defpackage.j1.IHQe1A4L2xu)).uiMode & 48) == 32;
                        t10Var.QoRHpC4k(false);
                        r2 = z;
                    } else if (ordinal == 1) {
                        t10Var.AsxAYCCkb3Hi(2080715349);
                        t10Var.QoRHpC4k(false);
                    } else if (ordinal == 2) {
                        t10Var.AsxAYCCkb3Hi(2080675632);
                        t10Var.QoRHpC4k(false);
                        r2 = true;
                    } else {
                        t10Var.AsxAYCCkb3Hi(2145325125);
                        t10Var.QoRHpC4k(false);
                        defpackage.db.F7NU4MC0GW();
                    }
                    boolean EXtogiMhuM = t10Var.EXtogiMhuM(mainActivity) | t10Var.AARZUJiTa(r2);
                    java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
                    if (EXtogiMhuM || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                        mAr5m2L7gYDP = new defpackage.zh(1, mainActivity, r2);
                        t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
                    }
                    defpackage.s21.DFo87pBq1E5((defpackage.vz) mAr5m2L7gYDP, t10Var);
                    defpackage.ig1.IHQe1A4L2xu((defpackage.jg1) PAEGRtP0bX.getValue(), defpackage.h1.XZx205DYe(88030613, new defpackage.hg0(mainActivity, i2), t10Var), t10Var, 48);
                    return ok1Var;
                }
                defpackage.db.AARZUJiTa("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            default:
                int i4 = com.corsair.ledger.MainActivity.nBH8hAHy;
                if (t10Var.lpprD5VAS(intValue & 1, (intValue & 3) != 2)) {
                    defpackage.nc1 nc1Var = defpackage.cv.IHQe1A4L2xu;
                    defpackage.b10 b10Var = mainActivity.UsuH8pd5P;
                    if (b10Var == null) {
                        defpackage.x70.Ye0N2xE9Hc("feedback");
                        throw null;
                    }
                    defpackage.gq1.oh6vYeIP(nc1Var.IHQe1A4L2xu(b10Var), defpackage.gq1.IHQe1A4L2xu, t10Var, 56);
                } else {
                    t10Var.WLpAkxCo();
                }
                return ok1Var;
        }
    }
}
