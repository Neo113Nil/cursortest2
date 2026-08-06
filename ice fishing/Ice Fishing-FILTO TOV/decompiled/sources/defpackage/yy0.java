package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yy0 {
    public final ArrayList EljAMC1QTz;
    public final int GWasM1elztuh;
    public final boolean OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final String Yi7zF1RB1;
    public final int xqGvceK5x;

    public yy0(int i, String str, int i2, int i3, boolean z, ArrayList arrayList) {
        str.getClass();
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = str;
        this.X1lG3V04pd = i2;
        this.xqGvceK5x = i3;
        this.OOA6hdeuvCS = z;
        this.EljAMC1QTz = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy0)) {
            return false;
        }
        yy0 yy0Var = (yy0) obj;
        return this.GWasM1elztuh == yy0Var.GWasM1elztuh && o30.rQPn8YBR(this.Yi7zF1RB1, yy0Var.Yi7zF1RB1) && this.X1lG3V04pd == yy0Var.X1lG3V04pd && this.xqGvceK5x == yy0Var.xqGvceK5x && this.OOA6hdeuvCS == yy0Var.OOA6hdeuvCS && this.EljAMC1QTz.equals(yy0Var.EljAMC1QTz);
    }

    public final int hashCode() {
        return this.EljAMC1QTz.hashCode() + mr0.xqGvceK5x(mr0.Yi7zF1RB1(this.xqGvceK5x, mr0.Yi7zF1RB1(this.X1lG3V04pd, (this.Yi7zF1RB1.hashCode() + (Integer.hashCode(this.GWasM1elztuh) * 31)) * 31, 31), 31), 31, this.OOA6hdeuvCS);
    }

    public final String toString() {
        return "SectorRow(id=" + this.GWasM1elztuh + ", name=" + this.Yi7zF1RB1 + ", stars=" + this.X1lG3V04pd + ", maxStars=" + this.xqGvceK5x + ", unlocked=" + this.OOA6hdeuvCS + ", levels=" + this.EljAMC1QTz + ")";
    }
}
