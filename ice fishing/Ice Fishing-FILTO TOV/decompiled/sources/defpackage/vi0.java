package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vi0 {
    public final int GWasM1elztuh;
    public final long OOA6hdeuvCS;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final float xqGvceK5x;

    public vi0(int i, float f, float f2, float f3, long j) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = f;
        this.X1lG3V04pd = f2;
        this.xqGvceK5x = f3;
        this.OOA6hdeuvCS = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vi0.class == obj.getClass()) {
            vi0 vi0Var = (vi0) obj;
            return this.X1lG3V04pd == vi0Var.X1lG3V04pd && this.xqGvceK5x == vi0Var.xqGvceK5x && this.Yi7zF1RB1 == vi0Var.Yi7zF1RB1 && this.GWasM1elztuh == vi0Var.GWasM1elztuh && this.OOA6hdeuvCS == vi0Var.OOA6hdeuvCS;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.OOA6hdeuvCS) + mr0.Yi7zF1RB1(this.GWasM1elztuh, mr0.GWasM1elztuh(this.Yi7zF1RB1, mr0.GWasM1elztuh(this.xqGvceK5x, Float.hashCode(this.X1lG3V04pd) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.X1lG3V04pd + ", touchY=" + this.xqGvceK5x + ", progress=" + this.Yi7zF1RB1 + ", swipeEdge=" + this.GWasM1elztuh + ", frameTimeMillis=" + this.OOA6hdeuvCS + ')';
    }
}
