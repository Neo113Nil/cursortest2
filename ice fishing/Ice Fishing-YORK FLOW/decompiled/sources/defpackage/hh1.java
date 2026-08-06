package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class hh1 implements defpackage.n10 {
    public final /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ int QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ hh1(int i, java.lang.String str, defpackage.rv rvVar) {
        this.WDYagTQQm9ns = 2;
        this.QiMR8OkAhezm = i;
        this.oh71FJcDz6S2 = str;
        this.P05cfTpS5W5L = rvVar;
    }

    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        int i = this.WDYagTQQm9ns;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj = this.P05cfTpS5W5L;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        int i2 = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                defpackage.fo0 fo0Var = (defpackage.fo0) obj;
                ((defpackage.y10) obj2).P05cfTpS5W5L(i2 != 0 ? (defpackage.dh1) defpackage.dh1.Ns0WNyEWdPsk.get(i2 - 1) : null);
                fo0Var.setValue(java.lang.Boolean.FALSE);
                return gs1Var;
            case 1:
                defpackage.fo0 fo0Var2 = (defpackage.fo0) obj;
                ((defpackage.y10) obj2).P05cfTpS5W5L(i2 != 0 ? (defpackage.mq1) defpackage.mq1.h3m55N1URyyK.get(i2 - 1) : null);
                fo0Var2.setValue(java.lang.Boolean.FALSE);
                return gs1Var;
            default:
                java.lang.String str = (java.lang.String) obj2;
                defpackage.rv rvVar = (defpackage.rv) obj;
                defpackage.hc1[] hc1VarArr = new defpackage.hc1[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    java.lang.String str2 = str + '.' + rvVar.WDYagTQQm9ns[i3];
                    defpackage.ch1 ch1Var = defpackage.ch1.oh71FJcDz6S2;
                    defpackage.hc1[] hc1VarArr2 = new defpackage.hc1[0];
                    if (defpackage.tg1.PS16moFv2oLu(str2)) {
                        defpackage.h7.w7APNrr0aGRc("Blank serial names are prohibited");
                        return null;
                    }
                    if (ch1Var == defpackage.ch1.fWTAfUmVKrZq) {
                        defpackage.h7.w7APNrr0aGRc("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                        return null;
                    }
                    defpackage.oe oeVar = new defpackage.oe(str2);
                    hc1VarArr[i3] = new defpackage.kc1(str2, ch1Var, oeVar.giKS3J6vZuNy.size(), defpackage.y7.a6r05ZxsOP0A(hc1VarArr2), oeVar);
                }
                return hc1VarArr;
        }
    }

    public /* synthetic */ hh1(defpackage.y10 y10Var, int i, defpackage.fo0 fo0Var, int i2) {
        this.WDYagTQQm9ns = i2;
        this.oh71FJcDz6S2 = y10Var;
        this.QiMR8OkAhezm = i;
        this.P05cfTpS5W5L = fo0Var;
    }
}
