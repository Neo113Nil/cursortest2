package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class oh6vYeIP implements defpackage.vz {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.dd xiZrDbcSW0;

    public /* synthetic */ oh6vYeIP(defpackage.dd ddVar, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = ddVar;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        defpackage.kn knVar;
        int i = this.adDC3e2L;
        defpackage.dd ddVar = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.f50 f50Var = (defpackage.f50) defpackage.mj1.abhbClRa(ddVar, defpackage.c50.IHQe1A4L2xu);
                if (f50Var == null) {
                    defpackage.a60.IHQe1A4L2xu("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + f50Var);
                }
                defpackage.f50 f50Var2 = ddVar.UsuH8pd5P;
                ddVar.UsuH8pd5P = f50Var;
                if (f50Var2 != null && !defpackage.x70.QoRHpC4k(f50Var, f50Var2) && ((knVar = ddVar.nBH8hAHy) != null || !ddVar.wll2JLbTBC2)) {
                    if (knVar != null) {
                        ddVar.H6IrRhrpWoH(knVar);
                    }
                    ddVar.nBH8hAHy = null;
                    ddVar.jjT5JLZla8();
                }
                return defpackage.ok1.IHQe1A4L2xu;
            default:
                ddVar.QQUzIjv3iOC5.IHQe1A4L2xu();
                return java.lang.Boolean.TRUE;
        }
    }
}
