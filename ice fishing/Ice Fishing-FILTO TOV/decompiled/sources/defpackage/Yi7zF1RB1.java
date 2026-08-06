package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class Yi7zF1RB1 implements wu {
    public final /* synthetic */ bb EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ Yi7zF1RB1(bb bbVar, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = bbVar;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        xk xkVar;
        int i = this.OOA6hdeuvCS;
        bb bbVar = this.EljAMC1QTz;
        switch (i) {
            case 0:
                w00 w00Var = (w00) o30.Mjvvu5DE(bbVar, t00.GWasM1elztuh);
                if (w00Var == null) {
                    w10.GWasM1elztuh("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + w00Var);
                }
                w00 w00Var2 = bbVar.M3K9sHhK;
                bbVar.M3K9sHhK = w00Var;
                if (w00Var2 != null && !o30.rQPn8YBR(w00Var, w00Var2) && ((xkVar = bbVar.EXrPz3p7hFb) != null || !bbVar.DmJncFq5)) {
                    if (xkVar != null) {
                        bbVar.sb9fmtV8A(xkVar);
                    }
                    bbVar.EXrPz3p7hFb = null;
                    bbVar.d5idzIhj55b();
                }
                return kc1.GWasM1elztuh;
            default:
                bbVar.arNh8D4Z5gB.GWasM1elztuh();
                return Boolean.TRUE;
        }
    }
}
