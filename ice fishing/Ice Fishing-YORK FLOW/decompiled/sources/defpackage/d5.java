package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class d5 extends defpackage.lc0 implements defpackage.y10 {
    public final /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ java.lang.Object e6mdH7fiFuta;
    public final /* synthetic */ int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        super(1);
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = obj;
        this.P05cfTpS5W5L = obj2;
        this.e6mdH7fiFuta = obj3;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        boolean booleanValue;
        int i = this.oh71FJcDz6S2;
        int i2 = 1;
        defpackage.zo1 zo1Var = null;
        java.lang.Object obj2 = this.P05cfTpS5W5L;
        java.lang.Object obj3 = this.e6mdH7fiFuta;
        java.lang.Object obj4 = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                return new defpackage.pf0OXpZQoaz3((defpackage.ff1) obj4, obj2, (defpackage.q5) obj3, i2);
            case 1:
                defpackage.rp1 rp1Var = (defpackage.rp1) obj;
                defpackage.vr vrVar = (defpackage.vr) rp1Var;
                if (!((defpackage.h1) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA((defpackage.vr) obj2)).m16getDragAndDropManager()).giKS3J6vZuNy.contains(vrVar) || !defpackage.ma0.JhCgjQRTAOCT(vrVar, defpackage.ok0.KrtOTfE6jiS2((defpackage.k0) obj3))) {
                    return defpackage.qp1.WDYagTQQm9ns;
                }
                ((defpackage.z31) obj4).WDYagTQQm9ns = rp1Var;
                return defpackage.qp1.QiMR8OkAhezm;
            case 2:
                defpackage.m51 m51Var = (defpackage.m51) obj;
                defpackage.dg1 dg1Var = (defpackage.dg1) obj2;
                defpackage.dg1 dg1Var2 = (defpackage.dg1) obj4;
                m51Var.fWTAfUmVKrZq(dg1Var2 != null ? ((java.lang.Number) dg1Var2.getValue()).floatValue() : 1.0f);
                m51Var.QiMR8OkAhezm(dg1Var != null ? ((java.lang.Number) dg1Var.getValue()).floatValue() : 1.0f);
                m51Var.e6mdH7fiFuta(dg1Var != null ? ((java.lang.Number) dg1Var.getValue()).floatValue() : 1.0f);
                defpackage.dg1 dg1Var3 = (defpackage.dg1) obj3;
                m51Var.gUjdnLbkVAaA(dg1Var3 != null ? ((defpackage.zo1) dg1Var3.getValue()).ZpBGe2uQfcn8 : defpackage.zo1.giKS3J6vZuNy);
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 3:
                defpackage.ew ewVar = (defpackage.ew) obj3;
                int ordinal = ((defpackage.fv) obj).ordinal();
                if (ordinal == 0) {
                    defpackage.kp1 kp1Var = ewVar.ZpBGe2uQfcn8;
                } else if (ordinal == 1) {
                    zo1Var = (defpackage.zo1) obj4;
                } else {
                    if (ordinal != 2) {
                        defpackage.h7.T1fB7bDYiVJQ();
                        return null;
                    }
                    defpackage.kp1 kp1Var2 = ewVar.ZpBGe2uQfcn8;
                }
                return new defpackage.zo1(zo1Var != null ? zo1Var.ZpBGe2uQfcn8 : defpackage.zo1.giKS3J6vZuNy);
            default:
                defpackage.nz nzVar = (defpackage.nz) obj;
                if (defpackage.ma0.QiMR8OkAhezm(nzVar, (defpackage.nz) obj4)) {
                    booleanValue = false;
                } else {
                    if (defpackage.ma0.QiMR8OkAhezm(nzVar, ((defpackage.gz) obj2).fWTAfUmVKrZq)) {
                        defpackage.h7.P05cfTpS5W5L("Focus search landed at the root.");
                        return null;
                    }
                    booleanValue = ((java.lang.Boolean) ((defpackage.y10) obj3).P05cfTpS5W5L(nzVar)).booleanValue();
                }
                return java.lang.Boolean.valueOf(booleanValue);
        }
    }
}
