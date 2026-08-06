package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class p3 extends r3 {
    public float GWasM1elztuh;
    public float X1lG3V04pd;
    public float Yi7zF1RB1;

    public p3(float f, float f2, float f3) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = f3;
    }

    @Override // defpackage.r3
    public final float GWasM1elztuh(int i) {
        if (i == 0) {
            return this.GWasM1elztuh;
        }
        if (i == 1) {
            return this.Yi7zF1RB1;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.X1lG3V04pd;
    }

    @Override // defpackage.r3
    public final void OOA6hdeuvCS(float f, int i) {
        if (i == 0) {
            this.GWasM1elztuh = f;
        } else if (i == 1) {
            this.Yi7zF1RB1 = f;
        } else {
            if (i != 2) {
                return;
            }
            this.X1lG3V04pd = f;
        }
    }

    @Override // defpackage.r3
    public final r3 X1lG3V04pd() {
        return new p3(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.r3
    public final int Yi7zF1RB1() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return p3Var.GWasM1elztuh == this.GWasM1elztuh && p3Var.Yi7zF1RB1 == this.Yi7zF1RB1 && p3Var.X1lG3V04pd == this.X1lG3V04pd;
    }

    public final int hashCode() {
        return Float.hashCode(this.X1lG3V04pd) + mr0.GWasM1elztuh(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.GWasM1elztuh + ", v2 = " + this.Yi7zF1RB1 + ", v3 = " + this.X1lG3V04pd;
    }

    @Override // defpackage.r3
    public final void xqGvceK5x() {
        this.GWasM1elztuh = 0.0f;
        this.Yi7zF1RB1 = 0.0f;
        this.X1lG3V04pd = 0.0f;
    }
}
