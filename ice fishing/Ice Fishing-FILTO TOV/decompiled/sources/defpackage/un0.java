package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class un0 {
    public final float AvO7iQsrTN;
    public final float EljAMC1QTz;
    public final c1 GWasM1elztuh;
    public final int OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final int xqGvceK5x;

    public un0(c1 c1Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.GWasM1elztuh = c1Var;
        this.Yi7zF1RB1 = i;
        this.X1lG3V04pd = i2;
        this.xqGvceK5x = i3;
        this.OOA6hdeuvCS = i4;
        this.EljAMC1QTz = f;
        this.AvO7iQsrTN = f2;
    }

    public final int GWasM1elztuh(int i) {
        int i2 = this.X1lG3V04pd;
        int i3 = this.Yi7zF1RB1;
        return o50.encWxUiV2(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof un0) {
            un0 un0Var = (un0) obj;
            if (this.GWasM1elztuh == un0Var.GWasM1elztuh && this.Yi7zF1RB1 == un0Var.Yi7zF1RB1 && this.X1lG3V04pd == un0Var.X1lG3V04pd && this.xqGvceK5x == un0Var.xqGvceK5x && this.OOA6hdeuvCS == un0Var.OOA6hdeuvCS && Float.compare(this.EljAMC1QTz, un0Var.EljAMC1QTz) == 0 && Float.compare(this.AvO7iQsrTN, un0Var.AvO7iQsrTN) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.AvO7iQsrTN) + mr0.GWasM1elztuh(this.EljAMC1QTz, mr0.Yi7zF1RB1(this.OOA6hdeuvCS, mr0.Yi7zF1RB1(this.xqGvceK5x, mr0.Yi7zF1RB1(this.X1lG3V04pd, mr0.Yi7zF1RB1(this.Yi7zF1RB1, this.GWasM1elztuh.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.GWasM1elztuh);
        sb.append(", startIndex=");
        sb.append(this.Yi7zF1RB1);
        sb.append(", endIndex=");
        sb.append(this.X1lG3V04pd);
        sb.append(", startLineIndex=");
        sb.append(this.xqGvceK5x);
        sb.append(", endLineIndex=");
        sb.append(this.OOA6hdeuvCS);
        sb.append(", top=");
        sb.append(this.EljAMC1QTz);
        sb.append(", bottom=");
        return mr0.JFJ3QoxA(sb, this.AvO7iQsrTN, ')');
    }
}
