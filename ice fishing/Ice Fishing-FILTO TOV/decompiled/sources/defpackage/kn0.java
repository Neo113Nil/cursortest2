package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class kn0 extends me0 {
    public final float GWasM1elztuh;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final float xqGvceK5x;

    public kn0(float f, float f2, float f3, float f4) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = f3;
        this.xqGvceK5x = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            r10.GWasM1elztuh("Padding must be non-negative");
        }
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        ln0 ln0Var = (ln0) he0Var;
        ln0Var.mE4lRynR = this.GWasM1elztuh;
        ln0Var.jivtDDk9H = this.Yi7zF1RB1;
        ln0Var.Y6hRI1cF8 = this.X1lG3V04pd;
        ln0Var.cilMamHF = this.xqGvceK5x;
        ln0Var.lv06NcmrQ = true;
    }

    public final boolean equals(Object obj) {
        kn0 kn0Var = obj instanceof kn0 ? (kn0) obj : null;
        return kn0Var != null && cn.Yi7zF1RB1(this.GWasM1elztuh, kn0Var.GWasM1elztuh) && cn.Yi7zF1RB1(this.Yi7zF1RB1, kn0Var.Yi7zF1RB1) && cn.Yi7zF1RB1(this.X1lG3V04pd, kn0Var.X1lG3V04pd) && cn.Yi7zF1RB1(this.xqGvceK5x, kn0Var.xqGvceK5x);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + mr0.GWasM1elztuh(this.xqGvceK5x, mr0.GWasM1elztuh(this.X1lG3V04pd, mr0.GWasM1elztuh(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31), 31), 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        ln0 ln0Var = new ln0();
        ln0Var.mE4lRynR = this.GWasM1elztuh;
        ln0Var.jivtDDk9H = this.Yi7zF1RB1;
        ln0Var.Y6hRI1cF8 = this.X1lG3V04pd;
        ln0Var.cilMamHF = this.xqGvceK5x;
        ln0Var.lv06NcmrQ = true;
        return ln0Var;
    }
}
