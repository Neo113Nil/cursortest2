package defpackage;

/* loaded from: classes.dex */
public abstract class xd1 {
    public static final defpackage.qh IHQe1A4L2xu = new defpackage.qh(new defpackage.v31(4));

    public static final void IHQe1A4L2xu(defpackage.mj0 mj0Var, defpackage.e91 e91Var, long j, long j2, float f, defpackage.sf sfVar, defpackage.t10 t10Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            e91Var = defpackage.gq1.DFo87pBq1E5;
        }
        defpackage.e91 e91Var2 = e91Var;
        long oh6vYeIP = (i2 & 8) != 0 ? defpackage.he.oh6vYeIP(j, t10Var) : j2;
        float f2 = (i2 & 32) != 0 ? 0.0f : f;
        defpackage.qh qhVar = IHQe1A4L2xu;
        float f3 = ((defpackage.uq) t10Var.SH1y5HwkJhh(qhVar)).adDC3e2L + 0.0f;
        defpackage.gq1.r1MBDhnF(new defpackage.ny0[]{defpackage.ti.IHQe1A4L2xu.IHQe1A4L2xu(new defpackage.ae(oh6vYeIP)), qhVar.IHQe1A4L2xu(new defpackage.uq(f3))}, defpackage.h1.XZx205DYe(421772006, new defpackage.ud1(mj0Var, e91Var2, j, f3, null, f2, sfVar), t10Var), t10Var, 56);
    }

    public static final defpackage.mj0 oh6vYeIP(defpackage.mj0 mj0Var, defpackage.e91 e91Var, long j, defpackage.s8 s8Var, float f) {
        defpackage.mj0 mj0Var2;
        defpackage.mj0 mj0Var3 = defpackage.jj0.IHQe1A4L2xu;
        if (f > 0.0f) {
            long j2 = defpackage.ci1.oh6vYeIP;
            long j3 = defpackage.u20.IHQe1A4L2xu;
            mj0Var2 = defpackage.ci0.SiPhmbmu(mj0Var3, 1.0f, 1.0f, f, j2, e91Var, false, j3, j3);
        } else {
            mj0Var2 = mj0Var3;
        }
        defpackage.mj0 r1MBDhnF = mj0Var.r1MBDhnF(mj0Var2);
        if (s8Var != null) {
            mj0Var3 = new defpackage.r8(s8Var.IHQe1A4L2xu, s8Var.oh6vYeIP, e91Var);
        }
        return defpackage.mj1.V7bD7b8KA(defpackage.h1.DFo87pBq1E5(r1MBDhnF.r1MBDhnF(mj0Var3), j, e91Var), e91Var);
    }

    public static final long r1MBDhnF(long j, float f, defpackage.t10 t10Var) {
        defpackage.fe feVar = (defpackage.fe) t10Var.SH1y5HwkJhh(defpackage.he.IHQe1A4L2xu);
        boolean booleanValue = ((java.lang.Boolean) t10Var.SH1y5HwkJhh(defpackage.he.oh6vYeIP)).booleanValue();
        long j2 = feVar.QoRHpC4k;
        if (!defpackage.ae.r1MBDhnF(j, j2) || !booleanValue) {
            return j;
        }
        if (defpackage.uq.oh6vYeIP(f, 0.0f)) {
            return j2;
        }
        return defpackage.w70.QoRHpC4k(defpackage.ae.oh6vYeIP(feVar.fnWB2E7cs, ((((float) java.lang.Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}
