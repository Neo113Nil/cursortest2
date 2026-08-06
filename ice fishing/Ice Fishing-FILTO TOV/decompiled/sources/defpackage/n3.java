package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n3 extends r3 {
    public float GWasM1elztuh;

    public n3(float f) {
        this.GWasM1elztuh = f;
    }

    @Override // defpackage.r3
    public final float GWasM1elztuh(int i) {
        if (i == 0) {
            return this.GWasM1elztuh;
        }
        return 0.0f;
    }

    @Override // defpackage.r3
    public final void OOA6hdeuvCS(float f, int i) {
        if (i == 0) {
            this.GWasM1elztuh = f;
        }
    }

    @Override // defpackage.r3
    public final r3 X1lG3V04pd() {
        return new n3(0.0f);
    }

    @Override // defpackage.r3
    public final int Yi7zF1RB1() {
        return 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n3) && ((n3) obj).GWasM1elztuh == this.GWasM1elztuh;
    }

    public final int hashCode() {
        return Float.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.GWasM1elztuh;
    }

    @Override // defpackage.r3
    public final void xqGvceK5x() {
        this.GWasM1elztuh = 0.0f;
    }
}
