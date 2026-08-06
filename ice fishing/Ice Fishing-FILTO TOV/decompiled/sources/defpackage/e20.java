package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class e20 {
    public static final e20 OOA6hdeuvCS = new e20(0, 0, 0, 0);
    public final int GWasM1elztuh;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final int xqGvceK5x;

    public e20(int i, int i2, int i3, int i4) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = i3;
        this.xqGvceK5x = i4;
    }

    public static e20 GWasM1elztuh(e20 e20Var, e20 e20Var2) {
        return Yi7zF1RB1(Math.max(e20Var.GWasM1elztuh, e20Var2.GWasM1elztuh), Math.max(e20Var.Yi7zF1RB1, e20Var2.Yi7zF1RB1), Math.max(e20Var.X1lG3V04pd, e20Var2.X1lG3V04pd), Math.max(e20Var.xqGvceK5x, e20Var2.xqGvceK5x));
    }

    public static e20 X1lG3V04pd(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return Yi7zF1RB1(i, i2, i3, i4);
    }

    public static e20 Yi7zF1RB1(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? OOA6hdeuvCS : new e20(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e20.class != obj.getClass()) {
            return false;
        }
        e20 e20Var = (e20) obj;
        return this.xqGvceK5x == e20Var.xqGvceK5x && this.GWasM1elztuh == e20Var.GWasM1elztuh && this.X1lG3V04pd == e20Var.X1lG3V04pd && this.Yi7zF1RB1 == e20Var.Yi7zF1RB1;
    }

    public final int hashCode() {
        return (((((this.GWasM1elztuh * 31) + this.Yi7zF1RB1) * 31) + this.X1lG3V04pd) * 31) + this.xqGvceK5x;
    }

    public final String toString() {
        return "Insets{left=" + this.GWasM1elztuh + ", top=" + this.Yi7zF1RB1 + ", right=" + this.X1lG3V04pd + ", bottom=" + this.xqGvceK5x + '}';
    }

    public final Insets xqGvceK5x() {
        return a4.mOu10nynGul(this.GWasM1elztuh, this.Yi7zF1RB1, this.X1lG3V04pd, this.xqGvceK5x);
    }
}
