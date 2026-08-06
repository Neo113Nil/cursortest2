package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xv0 {
    public float GWasM1elztuh = 0.0f;
    public boolean Yi7zF1RB1 = true;
    public yh X1lG3V04pd = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv0)) {
            return false;
        }
        xv0 xv0Var = (xv0) obj;
        return Float.compare(this.GWasM1elztuh, xv0Var.GWasM1elztuh) == 0 && this.Yi7zF1RB1 == xv0Var.Yi7zF1RB1 && o30.rQPn8YBR(this.X1lG3V04pd, xv0Var.X1lG3V04pd);
    }

    public final int hashCode() {
        int xqGvceK5x = mr0.xqGvceK5x(Float.hashCode(this.GWasM1elztuh) * 31, 31, this.Yi7zF1RB1);
        yh yhVar = this.X1lG3V04pd;
        return (xqGvceK5x + (yhVar == null ? 0 : yhVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.GWasM1elztuh + ", fill=" + this.Yi7zF1RB1 + ", crossAxisAlignment=" + this.X1lG3V04pd + ", flowLayoutData=null)";
    }
}
