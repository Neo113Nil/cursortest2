package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gh1 {
    public final g7 GWasM1elztuh;
    public final float Yi7zF1RB1;

    public gh1(Rect rect, float f) {
        this.GWasM1elztuh = new g7(rect);
        this.Yi7zF1RB1 = f;
    }

    public final Rect GWasM1elztuh() {
        g7 g7Var = this.GWasM1elztuh;
        g7Var.getClass();
        return new Rect(g7Var.GWasM1elztuh, g7Var.Yi7zF1RB1, g7Var.X1lG3V04pd, g7Var.xqGvceK5x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gh1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        gh1 gh1Var = (gh1) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, gh1Var.GWasM1elztuh) && this.Yi7zF1RB1 == gh1Var.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1) + (this.GWasM1elztuh.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.GWasM1elztuh);
        sb.append(", density=");
        return mr0.JFJ3QoxA(sb, this.Yi7zF1RB1, ')');
    }

    public gh1(g7 g7Var, float f) {
        this.GWasM1elztuh = g7Var;
        this.Yi7zF1RB1 = f;
    }
}
