package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class db1 implements ko {
    public final int GWasM1elztuh;
    public final oo X1lG3V04pd;
    public final int Yi7zF1RB1;

    public db1(int i, int i2, oo ooVar) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = ooVar;
    }

    @Override // defpackage.l3
    public final td1 GWasM1elztuh(eb1 eb1Var) {
        return new vk0(this.GWasM1elztuh, this.Yi7zF1RB1, this.X1lG3V04pd);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof db1) {
            db1 db1Var = (db1) obj;
            if (db1Var.GWasM1elztuh == this.GWasM1elztuh && db1Var.Yi7zF1RB1 == this.Yi7zF1RB1 && o30.rQPn8YBR(db1Var.X1lG3V04pd, this.X1lG3V04pd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.X1lG3V04pd.hashCode() + (this.GWasM1elztuh * 31)) * 31) + this.Yi7zF1RB1;
    }
}
