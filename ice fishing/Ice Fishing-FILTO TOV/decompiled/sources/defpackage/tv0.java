package defpackage;

import android.graphics.Point;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tv0 {
    public final int GWasM1elztuh;
    public final Point X1lG3V04pd;
    public final int Yi7zF1RB1;

    public tv0(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tv0) {
            tv0 tv0Var = (tv0) obj;
            if (this.GWasM1elztuh == tv0Var.GWasM1elztuh && this.Yi7zF1RB1 == tv0Var.Yi7zF1RB1 && this.X1lG3V04pd.equals(tv0Var.X1lG3V04pd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.X1lG3V04pd.hashCode() + (((this.GWasM1elztuh * 31) + this.Yi7zF1RB1) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.GWasM1elztuh;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.Yi7zF1RB1);
        sb.append(", center=");
        sb.append(this.X1lG3V04pd);
        sb.append('}');
        return sb.toString();
    }
}
