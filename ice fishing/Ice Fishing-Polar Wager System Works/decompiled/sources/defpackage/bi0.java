package defpackage;

/* loaded from: classes.dex */
public abstract class bi0 {
    public static final defpackage.nc1 IHQe1A4L2xu;

    static {
        defpackage.c80.QQUzIjv3iOC5(new defpackage.g(23));
        IHQe1A4L2xu = new defpackage.nc1(new defpackage.g(24));
    }

    public static final void IHQe1A4L2xu(defpackage.fe feVar, defpackage.zj0 zj0Var, defpackage.i91 i91Var, defpackage.bk1 bk1Var, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        int i2;
        t10Var.QUKZkWRtw6(904511636);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (t10Var.xiZrDbcSW0(feVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= t10Var.xiZrDbcSW0(zj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= t10Var.xiZrDbcSW0(i91Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= t10Var.xiZrDbcSW0(bk1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= t10Var.EXtogiMhuM(sfVar) ? 16384 : 8192;
        }
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 9363) != 9362)) {
            t10Var.Ye0N2xE9Hc();
            if ((i & 1) != 0 && !t10Var.NHJTzaLwkd()) {
                t10Var.WLpAkxCo();
            }
            t10Var.G3OKOH3wZRC();
            defpackage.k21 IHQe1A4L2xu2 = defpackage.i21.IHQe1A4L2xu(0.0f, 7);
            long j = feVar.IHQe1A4L2xu;
            boolean adDC3e2L = t10Var.adDC3e2L(j);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (adDC3e2L || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.xf1(j, defpackage.ae.oh6vYeIP(j, 0.4f));
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.gq1.r1MBDhnF(new defpackage.ny0[]{defpackage.he.IHQe1A4L2xu.IHQe1A4L2xu(feVar), IHQe1A4L2xu.IHQe1A4L2xu(zj0Var), defpackage.c50.IHQe1A4L2xu.IHQe1A4L2xu(IHQe1A4L2xu2), defpackage.j91.IHQe1A4L2xu.IHQe1A4L2xu(i91Var), defpackage.yf1.IHQe1A4L2xu.IHQe1A4L2xu((defpackage.xf1) mAr5m2L7gYDP), defpackage.dk1.IHQe1A4L2xu.IHQe1A4L2xu(bk1Var)}, defpackage.h1.XZx205DYe(-1750539308, new defpackage.ma(i3, bk1Var, sfVar), t10Var), t10Var, 56);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.kx(feVar, zj0Var, i91Var, bk1Var, sfVar, i, 1);
        }
    }

    public static final void oh6vYeIP(defpackage.fe feVar, defpackage.i91 i91Var, defpackage.bk1 bk1Var, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        int i2;
        defpackage.i91 i91Var2;
        int i3;
        t10Var.QUKZkWRtw6(-449719819);
        if ((i & 6) == 0) {
            i2 = (t10Var.xiZrDbcSW0(feVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= t10Var.xiZrDbcSW0(bk1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= t10Var.EXtogiMhuM(sfVar) ? 2048 : 1024;
        }
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 1171) != 1170)) {
            t10Var.Ye0N2xE9Hc();
            if ((i & 1) == 0 || t10Var.NHJTzaLwkd()) {
                i91Var2 = (defpackage.i91) t10Var.SH1y5HwkJhh(defpackage.j91.IHQe1A4L2xu);
                i3 = i2 & (-113);
            } else {
                t10Var.WLpAkxCo();
                i3 = i2 & (-113);
                i91Var2 = i91Var;
            }
            t10Var.G3OKOH3wZRC();
            int i4 = i3 & 14;
            int i5 = i3 << 3;
            IHQe1A4L2xu(feVar, (defpackage.zj0) t10Var.SH1y5HwkJhh(IHQe1A4L2xu), i91Var2, bk1Var, sfVar, t10Var, (i5 & 57344) | i4 | (i5 & 7168));
        } else {
            t10Var.WLpAkxCo();
            i91Var2 = i91Var;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.d(feVar, i91Var2, bk1Var, sfVar, i, 2);
        }
    }
}
