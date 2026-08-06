package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class u21 extends me0 {
    public final float GWasM1elztuh;
    public final boolean OOA6hdeuvCS;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final float xqGvceK5x;

    public /* synthetic */ u21(float f, int i) {
        this(Float.NaN, (i & 2) != 0 ? Float.NaN : 8.0f, (i & 4) != 0 ? Float.NaN : f, (i & 8) != 0 ? Float.NaN : 8.0f, true);
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        w21 w21Var = (w21) he0Var;
        w21Var.mE4lRynR = this.GWasM1elztuh;
        w21Var.jivtDDk9H = this.Yi7zF1RB1;
        w21Var.Y6hRI1cF8 = this.X1lG3V04pd;
        w21Var.cilMamHF = this.xqGvceK5x;
        w21Var.lv06NcmrQ = this.OOA6hdeuvCS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u21)) {
            return false;
        }
        u21 u21Var = (u21) obj;
        return cn.Yi7zF1RB1(this.GWasM1elztuh, u21Var.GWasM1elztuh) && cn.Yi7zF1RB1(this.Yi7zF1RB1, u21Var.Yi7zF1RB1) && cn.Yi7zF1RB1(this.X1lG3V04pd, u21Var.X1lG3V04pd) && cn.Yi7zF1RB1(this.xqGvceK5x, u21Var.xqGvceK5x) && this.OOA6hdeuvCS == u21Var.OOA6hdeuvCS;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.OOA6hdeuvCS) + mr0.GWasM1elztuh(this.xqGvceK5x, mr0.GWasM1elztuh(this.X1lG3V04pd, mr0.GWasM1elztuh(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31), 31), 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        w21 w21Var = new w21();
        w21Var.mE4lRynR = this.GWasM1elztuh;
        w21Var.jivtDDk9H = this.Yi7zF1RB1;
        w21Var.Y6hRI1cF8 = this.X1lG3V04pd;
        w21Var.cilMamHF = this.xqGvceK5x;
        w21Var.lv06NcmrQ = this.OOA6hdeuvCS;
        return w21Var;
    }

    public u21(float f, float f2, float f3, float f4, boolean z) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = f3;
        this.xqGvceK5x = f4;
        this.OOA6hdeuvCS = z;
    }
}
