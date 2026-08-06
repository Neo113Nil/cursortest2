package defpackage;

/* loaded from: classes.dex */
public final class n1 extends defpackage.p90 implements defpackage.k00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(defpackage.mj0 mj0Var, defpackage.k00 k00Var, int i) {
        super(2);
        this.xiZrDbcSW0 = 3;
        this.AARZUJiTa = mj0Var;
        this.EXtogiMhuM = k00Var;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.xiZrDbcSW0;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj3 = this.EXtogiMhuM;
        java.lang.Object obj4 = this.AARZUJiTa;
        switch (i) {
            case 0:
                int intValue = ((java.lang.Number) obj).intValue();
                defpackage.f71 f71Var = (defpackage.f71) obj2;
                defpackage.o1 o1Var = (defpackage.o1) obj3;
                if (!((defpackage.g71) obj4).oh6vYeIP.oh6vYeIP(f71Var.xiZrDbcSW0)) {
                    o1Var.JlrlGoKF(intValue, f71Var);
                    o1Var.JlrlGoKF.riuEU0zW4(ok1Var);
                    break;
                }
                break;
            case 1:
                defpackage.t10 t10Var = (defpackage.t10) obj;
                int intValue2 = ((java.lang.Number) obj2).intValue();
                if (!t10Var.lpprD5VAS(intValue2 & 1, (intValue2 & 3) != 2)) {
                    t10Var.WLpAkxCo();
                    break;
                } else {
                    java.lang.Boolean bool = (java.lang.Boolean) ((defpackage.sa0) obj4).AARZUJiTa.getValue();
                    boolean booleanValue = bool.booleanValue();
                    defpackage.k00 k00Var = (defpackage.k00) obj3;
                    t10Var.nVhUznk1t(bool);
                    boolean AARZUJiTa = t10Var.AARZUJiTa(booleanValue);
                    if (booleanValue) {
                        k00Var.adDC3e2L(t10Var, 0);
                    } else {
                        if (t10Var.JlrlGoKF != 0) {
                            defpackage.dh.IHQe1A4L2xu("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!t10Var.QPwENk36pDC) {
                            if (AARZUJiTa) {
                                defpackage.ea1 ea1Var = t10Var.SiPhmbmu;
                                int i2 = ea1Var.AARZUJiTa;
                                int i3 = ea1Var.EXtogiMhuM;
                                defpackage.ch chVar = t10Var.hyxIchWRW;
                                chVar.getClass();
                                chVar.F7NU4MC0GW(false);
                                chVar.oh6vYeIP.C0U8sNJm.p4kuH6PDtgom(defpackage.fr0.r1MBDhnF);
                                defpackage.x70.DFo87pBq1E5(t10Var.EgCjBq0SZwJ, i2, i3);
                                t10Var.SiPhmbmu.fnWB2E7cs();
                            } else {
                                t10Var.TFRaUu83X3E();
                            }
                        }
                    }
                    if (t10Var.NHJTzaLwkd && t10Var.SiPhmbmu.riuEU0zW4 == t10Var.QQUzIjv3iOC5) {
                        t10Var.QQUzIjv3iOC5 = -1;
                        t10Var.NHJTzaLwkd = false;
                    }
                    t10Var.QoRHpC4k(false);
                    break;
                }
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.hb hbVar = (defpackage.hb) obj;
                defpackage.q20 q20Var = (defpackage.q20) obj2;
                defpackage.ip0 ip0Var = (defpackage.ip0) obj4;
                defpackage.ma0 ma0Var = ip0Var.EgCjBq0SZwJ;
                if (!ma0Var.yIx6ChFVk()) {
                    ip0Var.lpprD5VAS = true;
                    break;
                } else {
                    ip0Var.mAr5m2L7gYDP = hbVar;
                    ip0Var.XZx205DYe = q20Var;
                    defpackage.ws0 snapshotObserver = ((defpackage.v0) defpackage.pa0.IHQe1A4L2xu(ma0Var)).getSnapshotObserver();
                    defpackage.w11 w11Var = defpackage.ip0.TFRaUu83X3E;
                    snapshotObserver.IHQe1A4L2xu.oh6vYeIP(ip0Var, defpackage.q0.UsuH8pd5P, (defpackage.hp0) obj3);
                    ip0Var.lpprD5VAS = false;
                    break;
                }
            default:
                ((java.lang.Number) obj2).intValue();
                defpackage.h1.SH1y5HwkJhh((defpackage.mj0) obj4, (defpackage.k00) obj3, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(1));
                break;
        }
        return ok1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(int i, java.lang.Object obj, java.lang.Object obj2) {
        super(2);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = obj;
        this.EXtogiMhuM = obj2;
    }
}
