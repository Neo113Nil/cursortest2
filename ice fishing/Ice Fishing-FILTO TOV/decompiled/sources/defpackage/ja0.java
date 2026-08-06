package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ja0 {
    public static final ja0 xqGvceK5x = new ja0(ga0.X1lG3V04pd, 17, 0);
    public final float GWasM1elztuh;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;

    public ja0(float f, int i, int i2) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = i;
        this.X1lG3V04pd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0Var = (ja0) obj;
        float f = ja0Var.GWasM1elztuh;
        float f2 = ga0.Yi7zF1RB1;
        return Float.compare(this.GWasM1elztuh, f) == 0 && this.Yi7zF1RB1 == ja0Var.Yi7zF1RB1 && this.X1lG3V04pd == ja0Var.X1lG3V04pd;
    }

    public final int hashCode() {
        float f = ga0.Yi7zF1RB1;
        return Integer.hashCode(this.X1lG3V04pd) + mr0.Yi7zF1RB1(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) ga0.Yi7zF1RB1(this.GWasM1elztuh));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.Yi7zF1RB1;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.X1lG3V04pd;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
