package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class giKS3J6vZuNy implements defpackage.n10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.ve oh71FJcDz6S2;

    public /* synthetic */ giKS3J6vZuNy(defpackage.ve veVar, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = veVar;
    }

    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        defpackage.wo woVar;
        int i = this.WDYagTQQm9ns;
        defpackage.ve veVar = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.c70 c70Var = (defpackage.c70) defpackage.nq1.blKFvluuDQOf(veVar, defpackage.z60.ZpBGe2uQfcn8);
                if (c70Var == null) {
                    defpackage.h80.ZpBGe2uQfcn8("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + c70Var);
                }
                defpackage.c70 c70Var2 = veVar.blKFvluuDQOf;
                veVar.blKFvluuDQOf = c70Var;
                if (c70Var2 != null && !defpackage.ma0.QiMR8OkAhezm(c70Var, c70Var2) && ((woVar = veVar.qjMheFZ0l9kA) != null || !veVar.hH0RRJrNssvh)) {
                    if (woVar != null) {
                        veVar.xbkEJUK1coRZ(woVar);
                    }
                    veVar.qjMheFZ0l9kA = null;
                    veVar.VpXebusPOq9I();
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            default:
                veVar.dG7RjM6DqYVL.ZpBGe2uQfcn8();
                return java.lang.Boolean.TRUE;
        }
    }
}
