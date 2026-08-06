package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j10 implements l3 {
    public final db1 GWasM1elztuh;
    public final iu0 Yi7zF1RB1;

    public j10(db1 db1Var, iu0 iu0Var) {
        this.GWasM1elztuh = db1Var;
        this.Yi7zF1RB1 = iu0Var;
        if (db1Var.GWasM1elztuh == 0 && db1Var.Yi7zF1RB1 == 0) {
            o4.mE4lRynR("Animation to be infinitely repeated cannot have a 0-duration");
            throw null;
        }
    }

    @Override // defpackage.l3
    public final td1 GWasM1elztuh(eb1 eb1Var) {
        db1 db1Var = this.GWasM1elztuh;
        return new xd1(new vk0(db1Var.GWasM1elztuh, db1Var.Yi7zF1RB1, db1Var.X1lG3V04pd), this.Yi7zF1RB1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j10)) {
            return false;
        }
        j10 j10Var = (j10) obj;
        return j10Var.GWasM1elztuh.equals(this.GWasM1elztuh) && j10Var.Yi7zF1RB1 == this.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.Yi7zF1RB1.hashCode() + (this.GWasM1elztuh.hashCode() * 31)) * 31);
    }
}
