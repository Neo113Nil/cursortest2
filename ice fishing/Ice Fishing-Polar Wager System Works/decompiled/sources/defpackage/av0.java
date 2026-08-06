package defpackage;

/* loaded from: classes.dex */
public abstract class av0 implements defpackage.qn {
    public boolean adDC3e2L;

    public static void DFo87pBq1E5(defpackage.av0 av0Var, defpackage.bv0 bv0Var, int i, int i2) {
        int i3 = defpackage.cv0.oh6vYeIP;
        defpackage.vs0 vs0Var = defpackage.vs0.EXtogiMhuM;
        long j = (i << 32) | (i2 & 4294967295L);
        if (av0Var.xiZrDbcSW0() == defpackage.w90.adDC3e2L || av0Var.AARZUJiTa() == 0) {
            IHQe1A4L2xu(av0Var, bv0Var);
            bv0Var.mL9sMlGfef(defpackage.z60.r1MBDhnF(j, bv0Var.riuEU0zW4), 0.0f, vs0Var);
        } else {
            int AARZUJiTa = (av0Var.AARZUJiTa() - bv0Var.adDC3e2L) - ((int) (j >> 32));
            IHQe1A4L2xu(av0Var, bv0Var);
            bv0Var.mL9sMlGfef(defpackage.z60.r1MBDhnF((AARZUJiTa << 32) | (((int) (j & 4294967295L)) & 4294967295L), bv0Var.riuEU0zW4), 0.0f, vs0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void IHQe1A4L2xu(defpackage.av0 av0Var, defpackage.bv0 bv0Var) {
        av0Var.getClass();
        if (bv0Var instanceof defpackage.yj0) {
            ((defpackage.yj0) bv0Var).QoRHpC4k(av0Var.adDC3e2L);
        }
    }

    public static void JlrlGoKF(defpackage.av0 av0Var, defpackage.bv0 bv0Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (av0Var.xiZrDbcSW0() == defpackage.w90.adDC3e2L || av0Var.AARZUJiTa() == 0) {
            IHQe1A4L2xu(av0Var, bv0Var);
            bv0Var.mL9sMlGfef(defpackage.z60.r1MBDhnF(j, bv0Var.riuEU0zW4), 0.0f, null);
        } else {
            int AARZUJiTa = (av0Var.AARZUJiTa() - bv0Var.adDC3e2L) - ((int) (j >> 32));
            IHQe1A4L2xu(av0Var, bv0Var);
            bv0Var.mL9sMlGfef(defpackage.z60.r1MBDhnF((AARZUJiTa << 32) | (((int) (j & 4294967295L)) & 4294967295L), bv0Var.riuEU0zW4), 0.0f, null);
        }
    }

    public static void QoRHpC4k(defpackage.av0 av0Var, defpackage.bv0 bv0Var, defpackage.g00 g00Var) {
        av0Var.getClass();
        IHQe1A4L2xu(av0Var, bv0Var);
        bv0Var.mL9sMlGfef(defpackage.z60.r1MBDhnF(0L, bv0Var.riuEU0zW4), 0.0f, g00Var);
    }

    public static void SH1y5HwkJhh(defpackage.av0 av0Var, defpackage.bv0 bv0Var, int i, int i2) {
        av0Var.getClass();
        IHQe1A4L2xu(av0Var, bv0Var);
        bv0Var.mL9sMlGfef(defpackage.z60.r1MBDhnF((i2 & 4294967295L) | (i << 32), bv0Var.riuEU0zW4), 0.0f, null);
    }

    public static void ez2rX8ReCYw(defpackage.av0 av0Var, defpackage.bv0 bv0Var, long j) {
        av0Var.getClass();
        IHQe1A4L2xu(av0Var, bv0Var);
        bv0Var.mL9sMlGfef(defpackage.z60.r1MBDhnF(j, bv0Var.riuEU0zW4), 0.0f, null);
    }

    public abstract int AARZUJiTa();

    public float F7NU4MC0GW(defpackage.i40 i40Var) {
        return Float.NaN;
    }

    public abstract defpackage.w90 xiZrDbcSW0();
}
