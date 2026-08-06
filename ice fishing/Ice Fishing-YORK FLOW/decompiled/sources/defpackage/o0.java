package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o0 extends defpackage.lc0 implements defpackage.c20 {
    public final /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i, java.lang.Object obj, java.lang.Object obj2) {
        super(2);
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = obj;
        this.P05cfTpS5W5L = obj2;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.oh71FJcDz6S2;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj3 = this.P05cfTpS5W5L;
        java.lang.Object obj4 = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                int intValue = ((java.lang.Number) obj).intValue();
                defpackage.jb1 jb1Var = (defpackage.jb1) obj2;
                defpackage.p0 p0Var = (defpackage.p0) obj3;
                if (!((defpackage.kb1) obj4).giKS3J6vZuNy.giKS3J6vZuNy(jb1Var.oh71FJcDz6S2)) {
                    p0Var.fNwYGHIYeJcR(intValue, jb1Var);
                    p0Var.fNwYGHIYeJcR.fWTAfUmVKrZq(gs1Var);
                    break;
                }
                break;
            case 1:
                defpackage.e30 e30Var = (defpackage.e30) obj;
                int intValue2 = ((java.lang.Number) obj2).intValue();
                if (!e30Var.zJPqDeoF0Os1(intValue2 & 1, (intValue2 & 3) != 2)) {
                    e30Var.Jkfc0NcwyPL8();
                    break;
                } else {
                    java.lang.Boolean bool = (java.lang.Boolean) ((defpackage.pd0) obj4).QiMR8OkAhezm.getValue();
                    boolean booleanValue = bool.booleanValue();
                    defpackage.c20 c20Var = (defpackage.c20) obj3;
                    e30Var.GoIRkIe1iwj6(bool);
                    boolean QiMR8OkAhezm = e30Var.QiMR8OkAhezm(booleanValue);
                    if (booleanValue) {
                        c20Var.QiMR8OkAhezm(e30Var, 0);
                    } else {
                        if (e30Var.fNwYGHIYeJcR != 0) {
                            defpackage.ej.ZpBGe2uQfcn8("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!e30Var.Fu5WBEia9jBo) {
                            if (QiMR8OkAhezm) {
                                defpackage.fe1 fe1Var = e30Var.frSwwKIlbUhK;
                                int i2 = fe1Var.QiMR8OkAhezm;
                                int i3 = fe1Var.P05cfTpS5W5L;
                                defpackage.dj djVar = e30Var.xahdJg25P1Bv;
                                djVar.getClass();
                                djVar.JhCgjQRTAOCT(false);
                                djVar.giKS3J6vZuNy.ZVVdXbWmyCSK.w6IV1lieBIux(defpackage.au0.fWTAfUmVKrZq);
                                defpackage.nq1.w7APNrr0aGRc(e30Var.BHfvd2J71qpO, i2, i3);
                                e30Var.frSwwKIlbUhK.ZVVdXbWmyCSK();
                            } else {
                                e30Var.OVwOqzUGHcCU();
                            }
                        }
                    }
                    if (e30Var.oCu53ZX2v4Ju && e30Var.frSwwKIlbUhK.e6mdH7fiFuta == e30Var.dG7RjM6DqYVL) {
                        e30Var.dG7RjM6DqYVL = -1;
                        e30Var.oCu53ZX2v4Ju = false;
                    }
                    e30Var.XntWc4eZSQ8j(false);
                    break;
                }
                break;
            default:
                defpackage.id idVar = (defpackage.id) obj;
                defpackage.b40 b40Var = (defpackage.b40) obj2;
                defpackage.sr0 sr0Var = (defpackage.sr0) obj4;
                defpackage.jd0 jd0Var = sr0Var.BHfvd2J71qpO;
                if (!jd0Var.IBvW5fLsPuHy()) {
                    sr0Var.zJPqDeoF0Os1 = true;
                    break;
                } else {
                    sr0Var.GcLuU6pT9wO9 = idVar;
                    sr0Var.hH0RRJrNssvh = b40Var;
                    defpackage.rv0 snapshotObserver = ((defpackage.u) defpackage.md0.ZpBGe2uQfcn8(jd0Var)).getSnapshotObserver();
                    defpackage.m51 m51Var = defpackage.sr0.OVwOqzUGHcCU;
                    snapshotObserver.ZpBGe2uQfcn8.JhCgjQRTAOCT(sr0Var, defpackage.n.jjTN4uUnoyEn, (defpackage.rr0) obj3);
                    sr0Var.zJPqDeoF0Os1 = false;
                    break;
                }
        }
        return gs1Var;
    }
}
