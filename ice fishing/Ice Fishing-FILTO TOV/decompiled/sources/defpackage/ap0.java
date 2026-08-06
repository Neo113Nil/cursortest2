package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ap0 implements dh {
    public final float GWasM1elztuh;

    public ap0(float f) {
        this.GWasM1elztuh = f;
        if (f < 0.0f || f > 100.0f) {
            w10.GWasM1elztuh("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.dh
    public final float GWasM1elztuh(long j, el elVar) {
        return (this.GWasM1elztuh / 100.0f) * t21.Yi7zF1RB1(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap0) && Float.compare(this.GWasM1elztuh, ((ap0) obj).GWasM1elztuh) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return "CornerSize(size = " + this.GWasM1elztuh + "%)";
    }
}
