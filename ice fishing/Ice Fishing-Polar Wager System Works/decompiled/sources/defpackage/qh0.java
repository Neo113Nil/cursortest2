package defpackage;

/* loaded from: classes.dex */
public final class qh0 implements defpackage.m00 {
    public final /* synthetic */ defpackage.g00 AARZUJiTa;
    public final /* synthetic */ java.util.List adDC3e2L;
    public final /* synthetic */ defpackage.rh0 xiZrDbcSW0;

    public qh0(java.util.List list, defpackage.rh0 rh0Var, defpackage.g00 g00Var) {
        this.adDC3e2L = list;
        this.xiZrDbcSW0 = rh0Var;
        this.AARZUJiTa = g00Var;
    }

    @Override // defpackage.m00
    public final java.lang.Object riuEU0zW4(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i;
        defpackage.hb0 hb0Var = (defpackage.hb0) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        defpackage.t10 t10Var = (defpackage.t10) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (t10Var.xiZrDbcSW0(hb0Var) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= t10Var.F7NU4MC0GW(intValue) ? 32 : 16;
        }
        if (t10Var.lpprD5VAS(i & 1, (i & 147) != 146)) {
            defpackage.q80 q80Var = (defpackage.q80) this.adDC3e2L.get(intValue);
            t10Var.AsxAYCCkb3Hi(416350924);
            boolean z = this.xiZrDbcSW0.ez2rX8ReCYw;
            defpackage.g00 g00Var = this.AARZUJiTa;
            boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(g00Var) | t10Var.xiZrDbcSW0(q80Var);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (xiZrDbcSW0 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.ph0(g00Var, q80Var);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.h1.F7NU4MC0GW(q80Var, z, (defpackage.vz) mAr5m2L7gYDP, t10Var, 0);
            t10Var.QoRHpC4k(false);
        } else {
            t10Var.WLpAkxCo();
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
