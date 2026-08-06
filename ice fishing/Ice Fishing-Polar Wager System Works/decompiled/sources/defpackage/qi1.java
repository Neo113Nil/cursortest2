package defpackage;

/* loaded from: classes.dex */
public abstract class qi1 {
    public static final defpackage.r41 IHQe1A4L2xu = new defpackage.r41(10);
    public static final defpackage.eb0 oh6vYeIP = defpackage.c80.NHJTzaLwkd(defpackage.ed0.xiZrDbcSW0, new defpackage.v31(7));

    public static final void IHQe1A4L2xu(defpackage.li1 li1Var, defpackage.ji1 ji1Var, java.lang.Float f, java.lang.Float f2, defpackage.tv tvVar, defpackage.t10 t10Var, int i) {
        t10Var.QUKZkWRtw6(867041821);
        int i2 = (t10Var.xiZrDbcSW0(li1Var) ? 4 : 2) | i | (t10Var.xiZrDbcSW0(ji1Var) ? 32 : 16) | (t10Var.xiZrDbcSW0(f) ? 256 : 128) | (t10Var.xiZrDbcSW0(f2) ? 2048 : 1024) | (t10Var.xiZrDbcSW0(tvVar) ? 16384 : 8192);
        if (!t10Var.lpprD5VAS(i2 & 1, (i2 & 9363) != 9362)) {
            t10Var.WLpAkxCo();
        } else if (li1Var.AARZUJiTa()) {
            ji1Var.AARZUJiTa(f, f2, tvVar);
        } else {
            ji1Var.EXtogiMhuM(f2, tvVar);
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.nb(li1Var, ji1Var, f, f2, tvVar, i, 1);
        }
    }

    public static final defpackage.gi1 oh6vYeIP(defpackage.li1 li1Var, defpackage.F7NU4MC0GW f7nu4mc0gw, java.lang.String str, defpackage.t10 t10Var, int i, int i2) {
        defpackage.fi1 fi1Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(li1Var);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        java.lang.Object obj = defpackage.bh.IHQe1A4L2xu;
        if (xiZrDbcSW0 || mAr5m2L7gYDP == obj) {
            mAr5m2L7gYDP = new defpackage.gi1(li1Var, f7nu4mc0gw, str);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
        defpackage.gi1 gi1Var = (defpackage.gi1) mAr5m2L7gYDP;
        boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(li1Var) | t10Var.EXtogiMhuM(gi1Var);
        java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
        if (xiZrDbcSW02 || mAr5m2L7gYDP2 == obj) {
            mAr5m2L7gYDP2 = new defpackage.oi1(0, li1Var, gi1Var);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
        }
        defpackage.s21.oh6vYeIP(gi1Var, (defpackage.g00) mAr5m2L7gYDP2, t10Var);
        if (li1Var.AARZUJiTa() && (fi1Var = (defpackage.fi1) gi1Var.oh6vYeIP.getValue()) != null) {
            defpackage.li1 li1Var2 = gi1Var.r1MBDhnF;
            fi1Var.adDC3e2L.AARZUJiTa(fi1Var.AARZUJiTa.AARZUJiTa(li1Var2.xiZrDbcSW0().oh6vYeIP()), fi1Var.AARZUJiTa.AARZUJiTa(li1Var2.xiZrDbcSW0().r1MBDhnF()), (defpackage.tv) fi1Var.xiZrDbcSW0.AARZUJiTa(li1Var2.xiZrDbcSW0()));
        }
        return gi1Var;
    }

    public static final defpackage.li1 r1MBDhnF(java.lang.Object obj, java.lang.String str, defpackage.t10 t10Var, int i) {
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
        if (mAr5m2L7gYDP == ad1Var) {
            mAr5m2L7gYDP = new defpackage.li1(new defpackage.tl0(obj), null, str);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
        defpackage.li1 li1Var = (defpackage.li1) mAr5m2L7gYDP;
        li1Var.IHQe1A4L2xu(obj, t10Var, (i & 8) | 48 | (i & 14));
        java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
        if (mAr5m2L7gYDP2 == ad1Var) {
            mAr5m2L7gYDP2 = new defpackage.ni1(li1Var, 0);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
        }
        defpackage.s21.oh6vYeIP(li1Var, (defpackage.g00) mAr5m2L7gYDP2, t10Var);
        return li1Var;
    }
}
