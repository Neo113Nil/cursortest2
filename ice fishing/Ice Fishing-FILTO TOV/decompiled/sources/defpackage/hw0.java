package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hw0 implements bu0 {
    public String AvO7iQsrTN;
    public kw0 EljAMC1QTz;
    public f4 JFJ3QoxA;
    public bx0 OOA6hdeuvCS;
    public Object encWxUiV2;
    public Object[] mOu10nynGul;
    public final o1 rQPn8YBR = new o1(10, this);

    public hw0(bx0 bx0Var, kw0 kw0Var, String str, Object obj, Object[] objArr) {
        this.OOA6hdeuvCS = bx0Var;
        this.EljAMC1QTz = kw0Var;
        this.AvO7iQsrTN = str;
        this.encWxUiV2 = obj;
        this.mOu10nynGul = objArr;
    }

    public final void GWasM1elztuh() {
        String YmKjaVtbfp5Z;
        kw0 kw0Var = this.EljAMC1QTz;
        if (this.JFJ3QoxA != null) {
            o4.iwATDS1i01k("entry(", this.JFJ3QoxA, ") is not null");
            return;
        }
        if (kw0Var != null) {
            o1 o1Var = this.rQPn8YBR;
            Object GWasM1elztuh = o1Var.GWasM1elztuh();
            if (GWasM1elztuh == null || kw0Var.xqGvceK5x(GWasM1elztuh)) {
                this.JFJ3QoxA = kw0Var.GWasM1elztuh(this.AvO7iQsrTN, o1Var);
                return;
            }
            if (GWasM1elztuh instanceof i41) {
                i41 i41Var = (i41) GWasM1elztuh;
                if (i41Var.xqGvceK5x() == b9xEq24R1.qugwajBSa59j || i41Var.xqGvceK5x() == k61.EljAMC1QTz || i41Var.xqGvceK5x() == b9xEq24R1.Uxq83abb04) {
                    YmKjaVtbfp5Z = "MutableState containing " + i41Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    YmKjaVtbfp5Z = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                YmKjaVtbfp5Z = d70.YmKjaVtbfp5Z(GWasM1elztuh);
            }
            throw new IllegalArgumentException(YmKjaVtbfp5Z);
        }
    }

    @Override // defpackage.bu0
    public final void OOA6hdeuvCS() {
        f4 f4Var = this.JFJ3QoxA;
        if (f4Var != null) {
            f4Var.Y6hRI1cF8();
        }
    }

    @Override // defpackage.bu0
    public final void X1lG3V04pd() {
        GWasM1elztuh();
    }

    @Override // defpackage.bu0
    public final void xqGvceK5x() {
        f4 f4Var = this.JFJ3QoxA;
        if (f4Var != null) {
            f4Var.Y6hRI1cF8();
        }
    }
}
