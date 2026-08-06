package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class t91 extends me0 {
    public final boolean GWasM1elztuh;
    public final hv OOA6hdeuvCS;
    public final boolean X1lG3V04pd;
    public final tf0 Yi7zF1RB1;
    public final ov0 xqGvceK5x;

    public t91(boolean z, tf0 tf0Var, boolean z2, ov0 ov0Var, hv hvVar) {
        this.GWasM1elztuh = z;
        this.Yi7zF1RB1 = tf0Var;
        this.X1lG3V04pd = z2;
        this.xqGvceK5x = ov0Var;
        this.OOA6hdeuvCS = hvVar;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        v91 v91Var = (v91) he0Var;
        boolean z = v91Var.z19UFEN2I;
        boolean z2 = this.GWasM1elztuh;
        if (z != z2) {
            v91Var.z19UFEN2I = z2;
            l60.WIEu4Ya2g8(v91Var);
        }
        v91Var.YXi2hvwn7WL = this.OOA6hdeuvCS;
        v91Var.oCbv4H4NsA(this.Yi7zF1RB1, null, false, this.X1lG3V04pd, this.xqGvceK5x, v91Var.CMh55RymNfS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t91.class != obj.getClass()) {
            return false;
        }
        t91 t91Var = (t91) obj;
        return this.GWasM1elztuh == t91Var.GWasM1elztuh && o30.rQPn8YBR(this.Yi7zF1RB1, t91Var.Yi7zF1RB1) && this.X1lG3V04pd == t91Var.X1lG3V04pd && this.xqGvceK5x.equals(t91Var.xqGvceK5x) && this.OOA6hdeuvCS == t91Var.OOA6hdeuvCS;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.GWasM1elztuh) * 31;
        tf0 tf0Var = this.Yi7zF1RB1;
        return this.OOA6hdeuvCS.hashCode() + mr0.Yi7zF1RB1(this.xqGvceK5x.GWasM1elztuh, mr0.xqGvceK5x(mr0.xqGvceK5x((hashCode + (tf0Var != null ? tf0Var.hashCode() : 0)) * 961, 31, false), 31, this.X1lG3V04pd), 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        return new v91(this.GWasM1elztuh, this.Yi7zF1RB1, this.X1lG3V04pd, this.xqGvceK5x, this.OOA6hdeuvCS);
    }
}
