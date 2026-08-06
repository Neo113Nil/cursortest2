package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bs {
    public final float GWasM1elztuh;
    public final long X1lG3V04pd;
    public final float Yi7zF1RB1;

    public bs(float f, float f2, long j) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj;
        return Float.compare(this.GWasM1elztuh, bsVar.GWasM1elztuh) == 0 && Float.compare(this.Yi7zF1RB1, bsVar.Yi7zF1RB1) == 0 && this.X1lG3V04pd == bsVar.X1lG3V04pd;
    }

    public final int hashCode() {
        return Long.hashCode(this.X1lG3V04pd) + mr0.GWasM1elztuh(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.GWasM1elztuh + ", distance=" + this.Yi7zF1RB1 + ", duration=" + this.X1lG3V04pd + ')';
    }
}
