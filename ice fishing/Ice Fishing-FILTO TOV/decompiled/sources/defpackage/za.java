package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class za extends me0 {
    public final wu EljAMC1QTz;
    public final tf0 GWasM1elztuh;
    public final ov0 OOA6hdeuvCS;
    public final boolean X1lG3V04pd;
    public final w00 Yi7zF1RB1;
    public final boolean xqGvceK5x;

    public za(tf0 tf0Var, w00 w00Var, boolean z, boolean z2, ov0 ov0Var, wu wuVar) {
        this.GWasM1elztuh = tf0Var;
        this.Yi7zF1RB1 = w00Var;
        this.X1lG3V04pd = z;
        this.xqGvceK5x = z2;
        this.OOA6hdeuvCS = ov0Var;
        this.EljAMC1QTz = wuVar;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        ((bb) he0Var).oCbv4H4NsA(this.GWasM1elztuh, this.Yi7zF1RB1, this.X1lG3V04pd, this.xqGvceK5x, this.OOA6hdeuvCS, this.EljAMC1QTz);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || za.class != obj.getClass()) {
            return false;
        }
        za zaVar = (za) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, zaVar.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, zaVar.Yi7zF1RB1) && this.X1lG3V04pd == zaVar.X1lG3V04pd && this.xqGvceK5x == zaVar.xqGvceK5x && o30.rQPn8YBR(this.OOA6hdeuvCS, zaVar.OOA6hdeuvCS) && this.EljAMC1QTz == zaVar.EljAMC1QTz;
    }

    public final int hashCode() {
        tf0 tf0Var = this.GWasM1elztuh;
        int hashCode = (tf0Var != null ? tf0Var.hashCode() : 0) * 31;
        w00 w00Var = this.Yi7zF1RB1;
        int xqGvceK5x = mr0.xqGvceK5x(mr0.xqGvceK5x((hashCode + (w00Var != null ? w00Var.hashCode() : 0)) * 31, 31, this.X1lG3V04pd), 961, this.xqGvceK5x);
        ov0 ov0Var = this.OOA6hdeuvCS;
        return this.EljAMC1QTz.hashCode() + ((xqGvceK5x + (ov0Var != null ? Integer.hashCode(ov0Var.GWasM1elztuh) : 0)) * 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        return new bb(this.GWasM1elztuh, this.Yi7zF1RB1, this.X1lG3V04pd, this.xqGvceK5x, this.OOA6hdeuvCS, this.EljAMC1QTz);
    }
}
