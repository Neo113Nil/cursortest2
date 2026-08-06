package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q3 extends r3 {
    public float GWasM1elztuh;
    public float X1lG3V04pd;
    public float Yi7zF1RB1;
    public float xqGvceK5x;

    public q3(float f, float f2, float f3, float f4) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = f3;
        this.xqGvceK5x = f4;
    }

    @Override // defpackage.r3
    public final float GWasM1elztuh(int i) {
        if (i == 0) {
            return this.GWasM1elztuh;
        }
        if (i == 1) {
            return this.Yi7zF1RB1;
        }
        if (i == 2) {
            return this.X1lG3V04pd;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.xqGvceK5x;
    }

    @Override // defpackage.r3
    public final void OOA6hdeuvCS(float f, int i) {
        if (i == 0) {
            this.GWasM1elztuh = f;
            return;
        }
        if (i == 1) {
            this.Yi7zF1RB1 = f;
        } else if (i == 2) {
            this.X1lG3V04pd = f;
        } else {
            if (i != 3) {
                return;
            }
            this.xqGvceK5x = f;
        }
    }

    @Override // defpackage.r3
    public final r3 X1lG3V04pd() {
        return new q3(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.r3
    public final int Yi7zF1RB1() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return q3Var.GWasM1elztuh == this.GWasM1elztuh && q3Var.Yi7zF1RB1 == this.Yi7zF1RB1 && q3Var.X1lG3V04pd == this.X1lG3V04pd && q3Var.xqGvceK5x == this.xqGvceK5x;
    }

    public final int hashCode() {
        return Float.hashCode(this.xqGvceK5x) + mr0.GWasM1elztuh(this.X1lG3V04pd, mr0.GWasM1elztuh(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.GWasM1elztuh + ", v2 = " + this.Yi7zF1RB1 + ", v3 = " + this.X1lG3V04pd + ", v4 = " + this.xqGvceK5x;
    }

    @Override // defpackage.r3
    public final void xqGvceK5x() {
        this.GWasM1elztuh = 0.0f;
        this.Yi7zF1RB1 = 0.0f;
        this.X1lG3V04pd = 0.0f;
        this.xqGvceK5x = 0.0f;
    }
}
