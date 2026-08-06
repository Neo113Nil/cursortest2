package defpackage;

/* loaded from: classes.dex */
public final class ho implements defpackage.k00 {
    public final /* synthetic */ defpackage.r31 AARZUJiTa;
    public final /* synthetic */ defpackage.gb1 EXtogiMhuM;
    public final /* synthetic */ defpackage.nm0 adDC3e2L;
    public final /* synthetic */ defpackage.mo riuEU0zW4;
    public final /* synthetic */ defpackage.no xiZrDbcSW0;

    public ho(defpackage.nm0 nm0Var, defpackage.no noVar, defpackage.s31 s31Var, defpackage.gb1 gb1Var, defpackage.mo moVar) {
        this.adDC3e2L = nm0Var;
        this.xiZrDbcSW0 = noVar;
        this.AARZUJiTa = s31Var;
        this.EXtogiMhuM = gb1Var;
        this.riuEU0zW4 = moVar;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.t10 t10Var = (defpackage.t10) obj;
        if ((((java.lang.Number) obj2).intValue() & 3) == 2 && t10Var.C0U8sNJm()) {
            t10Var.WLpAkxCo();
        } else {
            defpackage.nm0 nm0Var = this.adDC3e2L;
            boolean EXtogiMhuM = t10Var.EXtogiMhuM(nm0Var);
            defpackage.no noVar = this.xiZrDbcSW0;
            boolean EXtogiMhuM2 = EXtogiMhuM | t10Var.EXtogiMhuM(noVar);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            int i = 1;
            if (EXtogiMhuM2 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.vi(this.EXtogiMhuM, nm0Var, noVar, 1);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.s21.oh6vYeIP(nm0Var, (defpackage.g00) mAr5m2L7gYDP, t10Var);
            defpackage.s70.oh6vYeIP(nm0Var, this.AARZUJiTa, defpackage.h1.XZx205DYe(-497631156, new defpackage.ma(i, this.riuEU0zW4, nm0Var), t10Var), t10Var, 384);
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
