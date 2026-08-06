package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class bi1 extends me0 {
    public final gm GWasM1elztuh;
    public final Object X1lG3V04pd;
    public final lv Yi7zF1RB1;

    public bi1(gm gmVar, lv lvVar, Object obj) {
        this.GWasM1elztuh = gmVar;
        this.Yi7zF1RB1 = lvVar;
        this.X1lG3V04pd = obj;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        di1 di1Var = (di1) he0Var;
        di1Var.mE4lRynR = this.GWasM1elztuh;
        di1Var.jivtDDk9H = this.Yi7zF1RB1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bi1.class != obj.getClass()) {
            return false;
        }
        bi1 bi1Var = (bi1) obj;
        return this.GWasM1elztuh == bi1Var.GWasM1elztuh && this.X1lG3V04pd.equals(bi1Var.X1lG3V04pd);
    }

    public final int hashCode() {
        return this.X1lG3V04pd.hashCode() + mr0.xqGvceK5x(this.GWasM1elztuh.hashCode() * 31, 31, false);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        di1 di1Var = new di1();
        di1Var.mE4lRynR = this.GWasM1elztuh;
        di1Var.jivtDDk9H = this.Yi7zF1RB1;
        return di1Var;
    }
}
