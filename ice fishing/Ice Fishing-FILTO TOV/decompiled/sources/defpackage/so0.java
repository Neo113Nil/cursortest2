package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class so0 extends vo0 {
    public final float OOA6hdeuvCS;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final float xqGvceK5x;

    public so0(float f, float f2, float f3, float f4) {
        super(2);
        this.Yi7zF1RB1 = f;
        this.X1lG3V04pd = f2;
        this.xqGvceK5x = f3;
        this.OOA6hdeuvCS = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so0)) {
            return false;
        }
        so0 so0Var = (so0) obj;
        return Float.compare(this.Yi7zF1RB1, so0Var.Yi7zF1RB1) == 0 && Float.compare(this.X1lG3V04pd, so0Var.X1lG3V04pd) == 0 && Float.compare(this.xqGvceK5x, so0Var.xqGvceK5x) == 0 && Float.compare(this.OOA6hdeuvCS, so0Var.OOA6hdeuvCS) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.OOA6hdeuvCS) + mr0.GWasM1elztuh(this.xqGvceK5x, mr0.GWasM1elztuh(this.X1lG3V04pd, Float.hashCode(this.Yi7zF1RB1) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.Yi7zF1RB1);
        sb.append(", dy1=");
        sb.append(this.X1lG3V04pd);
        sb.append(", dx2=");
        sb.append(this.xqGvceK5x);
        sb.append(", dy2=");
        return mr0.JFJ3QoxA(sb, this.OOA6hdeuvCS, ')');
    }
}
