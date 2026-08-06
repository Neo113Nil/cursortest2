package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class yx implements Cloneable {
    public ay EljAMC1QTz;
    public final ay OOA6hdeuvCS;

    public yx(ay ayVar) {
        this.OOA6hdeuvCS = ayVar;
        if (ayVar.AvO7iQsrTN()) {
            o4.mE4lRynR("Default instance must be immutable.");
            throw null;
        }
        this.EljAMC1QTz = ayVar.mOu10nynGul();
    }

    public final ay GWasM1elztuh() {
        ay Yi7zF1RB1 = Yi7zF1RB1();
        Yi7zF1RB1.getClass();
        if (ay.EljAMC1QTz(Yi7zF1RB1, true)) {
            return Yi7zF1RB1;
        }
        throw new ic1();
    }

    public final void X1lG3V04pd() {
        if (this.EljAMC1QTz.AvO7iQsrTN()) {
            return;
        }
        ay mOu10nynGul = this.OOA6hdeuvCS.mOu10nynGul();
        ay ayVar = this.EljAMC1QTz;
        ns0 ns0Var = ns0.X1lG3V04pd;
        ns0Var.getClass();
        ns0Var.GWasM1elztuh(mOu10nynGul.getClass()).Yi7zF1RB1(mOu10nynGul, ayVar);
        this.EljAMC1QTz = mOu10nynGul;
    }

    public final ay Yi7zF1RB1() {
        boolean AvO7iQsrTN = this.EljAMC1QTz.AvO7iQsrTN();
        ay ayVar = this.EljAMC1QTz;
        if (!AvO7iQsrTN) {
            return ayVar;
        }
        ayVar.getClass();
        ns0 ns0Var = ns0.X1lG3V04pd;
        ns0Var.getClass();
        ns0Var.GWasM1elztuh(ayVar.getClass()).X1lG3V04pd(ayVar);
        ayVar.encWxUiV2();
        return this.EljAMC1QTz;
    }

    public final Object clone() {
        yx yxVar = (yx) this.OOA6hdeuvCS.X1lG3V04pd(5);
        yxVar.EljAMC1QTz = Yi7zF1RB1();
        return yxVar;
    }
}
