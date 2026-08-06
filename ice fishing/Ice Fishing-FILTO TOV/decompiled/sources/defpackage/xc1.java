package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class xc1 extends me0 {
    public final float GWasM1elztuh;
    public final float Yi7zF1RB1;

    public xc1(float f, float f2) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        yc1 yc1Var = (yc1) he0Var;
        yc1Var.mE4lRynR = this.GWasM1elztuh;
        yc1Var.jivtDDk9H = this.Yi7zF1RB1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xc1)) {
            return false;
        }
        xc1 xc1Var = (xc1) obj;
        return cn.Yi7zF1RB1(this.GWasM1elztuh, xc1Var.GWasM1elztuh) && cn.Yi7zF1RB1(this.Yi7zF1RB1, xc1Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1) + (Float.hashCode(this.GWasM1elztuh) * 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        yc1 yc1Var = new yc1();
        yc1Var.mE4lRynR = this.GWasM1elztuh;
        yc1Var.jivtDDk9H = this.Yi7zF1RB1;
        return yc1Var;
    }
}
