package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g7 {
    public final int GWasM1elztuh;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final int xqGvceK5x;

    static {
        new g7(0, 0, 0, 0);
    }

    public g7(int i, int i2, int i3, int i4) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = i3;
        this.xqGvceK5x = i4;
        if (i > i3) {
            o4.OOA6hdeuvCS(mr0.mOu10nynGul("Left must be less than or equal to right, left: ", i, ", right: ", i3));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        o4.OOA6hdeuvCS(mr0.mOu10nynGul("top must be less than or equal to bottom, top: ", i2, ", bottom: ", i4));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        g7 g7Var = (g7) obj;
        return this.GWasM1elztuh == g7Var.GWasM1elztuh && this.Yi7zF1RB1 == g7Var.Yi7zF1RB1 && this.X1lG3V04pd == g7Var.X1lG3V04pd && this.xqGvceK5x == g7Var.xqGvceK5x;
    }

    public final int hashCode() {
        return (((((this.GWasM1elztuh * 31) + this.Yi7zF1RB1) * 31) + this.X1lG3V04pd) * 31) + this.xqGvceK5x;
    }

    public final String toString() {
        return g7.class.getSimpleName() + " { [" + this.GWasM1elztuh + ',' + this.Yi7zF1RB1 + ',' + this.X1lG3V04pd + ',' + this.xqGvceK5x + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g7(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
