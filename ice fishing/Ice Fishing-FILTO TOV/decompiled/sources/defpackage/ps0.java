package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ps0 {
    public final b90 GWasM1elztuh;

    public ps0(wu wuVar) {
        this.GWasM1elztuh = new b90(wuVar);
    }

    public abstract qs0 GWasM1elztuh(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final jd1 X1lG3V04pd(qs0 qs0Var, jd1 jd1Var) {
        Object obj = qs0Var.OOA6hdeuvCS;
        boolean z = qs0Var.xqGvceK5x;
        no noVar = null;
        if (jd1Var instanceof no) {
            if (z) {
                noVar = (no) jd1Var;
                noVar.GWasM1elztuh.setValue(qs0Var.GWasM1elztuh());
            }
        } else if ((jd1Var instanceof w51) && ((qs0Var.Yi7zF1RB1 || obj != null) && !z)) {
            w51 w51Var = (w51) jd1Var;
            if (o30.rQPn8YBR(qs0Var.GWasM1elztuh(), w51Var.GWasM1elztuh)) {
                noVar = w51Var;
            }
        }
        if (noVar != null) {
            return noVar;
        }
        if (!z) {
            return new w51(qs0Var.GWasM1elztuh());
        }
        k41 k41Var = qs0Var.X1lG3V04pd;
        if (k41Var == null) {
            k41Var = k61.EljAMC1QTz;
        }
        return new no(new fo0(obj, k41Var));
    }

    public jd1 Yi7zF1RB1() {
        return this.GWasM1elztuh;
    }
}
