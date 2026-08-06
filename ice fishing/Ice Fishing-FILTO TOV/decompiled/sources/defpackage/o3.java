package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class o3 extends r3 {
    public float GWasM1elztuh;
    public float Yi7zF1RB1;

    public o3(float f, float f2) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
    }

    @Override // defpackage.r3
    public final float GWasM1elztuh(int i) {
        if (i == 0) {
            return this.GWasM1elztuh;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.Yi7zF1RB1;
    }

    @Override // defpackage.r3
    public final void OOA6hdeuvCS(float f, int i) {
        if (i == 0) {
            this.GWasM1elztuh = f;
        } else {
            if (i != 1) {
                return;
            }
            this.Yi7zF1RB1 = f;
        }
    }

    @Override // defpackage.r3
    public final r3 X1lG3V04pd() {
        return new o3(0.0f, 0.0f);
    }

    @Override // defpackage.r3
    public final int Yi7zF1RB1() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return o3Var.GWasM1elztuh == this.GWasM1elztuh && o3Var.Yi7zF1RB1 == this.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1) + (Float.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.GWasM1elztuh + ", v2 = " + this.Yi7zF1RB1;
    }

    @Override // defpackage.r3
    public final void xqGvceK5x() {
        this.GWasM1elztuh = 0.0f;
        this.Yi7zF1RB1 = 0.0f;
    }
}
