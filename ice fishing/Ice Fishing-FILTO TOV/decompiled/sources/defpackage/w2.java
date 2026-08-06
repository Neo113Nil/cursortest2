package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class w2<S> extends me0 {
    public final la1 GWasM1elztuh;
    public final a3 X1lG3V04pd;
    public final mg0 Yi7zF1RB1;

    public w2(la1 la1Var, mg0 mg0Var, a3 a3Var) {
        this.GWasM1elztuh = la1Var;
        this.Yi7zF1RB1 = mg0Var;
        this.X1lG3V04pd = a3Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        z2 z2Var = (z2) he0Var;
        z2Var.mE4lRynR = this.GWasM1elztuh;
        z2Var.jivtDDk9H = this.Yi7zF1RB1;
        z2Var.Y6hRI1cF8 = this.X1lG3V04pd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return o30.rQPn8YBR(w2Var.GWasM1elztuh, this.GWasM1elztuh) && w2Var.Yi7zF1RB1.equals(this.Yi7zF1RB1);
    }

    public final int hashCode() {
        int hashCode = this.X1lG3V04pd.hashCode() * 31;
        la1 la1Var = this.GWasM1elztuh;
        return this.Yi7zF1RB1.hashCode() + ((hashCode + (la1Var != null ? la1Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        z2 z2Var = new z2();
        z2Var.mE4lRynR = this.GWasM1elztuh;
        z2Var.jivtDDk9H = this.Yi7zF1RB1;
        z2Var.Y6hRI1cF8 = this.X1lG3V04pd;
        z2Var.cilMamHF = -9223372034707292160L;
        return z2Var;
    }
}
