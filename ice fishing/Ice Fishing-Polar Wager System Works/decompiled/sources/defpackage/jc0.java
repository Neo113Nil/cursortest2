package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class jc0 implements defpackage.vz {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.kc0 xiZrDbcSW0;

    public /* synthetic */ jc0(defpackage.kc0 kc0Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = kc0Var;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        int i = this.adDC3e2L;
        defpackage.kc0 kc0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.yc0 yc0Var = kc0Var.fnWB2E7cs.oh6vYeIP;
                return java.lang.Float.valueOf((((defpackage.nt0) yc0Var.adDC3e2L.oh6vYeIP).AARZUJiTa() * 500) + ((defpackage.nt0) yc0Var.adDC3e2L.r1MBDhnF).AARZUJiTa());
            case 1:
                defpackage.yc0 yc0Var2 = kc0Var.fnWB2E7cs.oh6vYeIP;
                int AARZUJiTa = ((defpackage.nt0) yc0Var2.adDC3e2L.oh6vYeIP).AARZUJiTa();
                int AARZUJiTa2 = ((defpackage.nt0) yc0Var2.adDC3e2L.r1MBDhnF).AARZUJiTa();
                return java.lang.Float.valueOf(yc0Var2.r1MBDhnF() ? (AARZUJiTa * 500) + AARZUJiTa2 + 100.0f : (AARZUJiTa * 500) + AARZUJiTa2);
            default:
                defpackage.yc0 yc0Var3 = kc0Var.fnWB2E7cs.oh6vYeIP;
                int AARZUJiTa3 = (int) (yc0Var3.AARZUJiTa().cnag84Bm == defpackage.ks0.adDC3e2L ? yc0Var3.AARZUJiTa().AARZUJiTa() & 4294967295L : yc0Var3.AARZUJiTa().AARZUJiTa() >> 32);
                defpackage.yc0 yc0Var4 = kc0Var.fnWB2E7cs.oh6vYeIP;
                return java.lang.Float.valueOf(AARZUJiTa3 - ((-yc0Var4.AARZUJiTa().JlrlGoKF) + yc0Var4.AARZUJiTa().QoRHpC4k));
        }
    }
}
