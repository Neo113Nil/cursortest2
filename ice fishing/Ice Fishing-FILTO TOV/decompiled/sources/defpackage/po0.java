package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class po0 extends vo0 {
    public final float AvO7iQsrTN;
    public final float EljAMC1QTz;
    public final float OOA6hdeuvCS;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final float xqGvceK5x;

    public po0(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.Yi7zF1RB1 = f;
        this.X1lG3V04pd = f2;
        this.xqGvceK5x = f3;
        this.OOA6hdeuvCS = f4;
        this.EljAMC1QTz = f5;
        this.AvO7iQsrTN = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po0)) {
            return false;
        }
        po0 po0Var = (po0) obj;
        return Float.compare(this.Yi7zF1RB1, po0Var.Yi7zF1RB1) == 0 && Float.compare(this.X1lG3V04pd, po0Var.X1lG3V04pd) == 0 && Float.compare(this.xqGvceK5x, po0Var.xqGvceK5x) == 0 && Float.compare(this.OOA6hdeuvCS, po0Var.OOA6hdeuvCS) == 0 && Float.compare(this.EljAMC1QTz, po0Var.EljAMC1QTz) == 0 && Float.compare(this.AvO7iQsrTN, po0Var.AvO7iQsrTN) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.AvO7iQsrTN) + mr0.GWasM1elztuh(this.EljAMC1QTz, mr0.GWasM1elztuh(this.OOA6hdeuvCS, mr0.GWasM1elztuh(this.xqGvceK5x, mr0.GWasM1elztuh(this.X1lG3V04pd, Float.hashCode(this.Yi7zF1RB1) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.Yi7zF1RB1);
        sb.append(", dy1=");
        sb.append(this.X1lG3V04pd);
        sb.append(", dx2=");
        sb.append(this.xqGvceK5x);
        sb.append(", dy2=");
        sb.append(this.OOA6hdeuvCS);
        sb.append(", dx3=");
        sb.append(this.EljAMC1QTz);
        sb.append(", dy3=");
        return mr0.JFJ3QoxA(sb, this.AvO7iQsrTN, ')');
    }
}
