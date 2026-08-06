package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class la0 implements ju {
    public final float GWasM1elztuh;

    public la0(float f) {
        this.GWasM1elztuh = f;
    }

    @Override // defpackage.ju
    public final float GWasM1elztuh(float f) {
        return f / this.GWasM1elztuh;
    }

    @Override // defpackage.ju
    public final float Yi7zF1RB1(float f) {
        return f * this.GWasM1elztuh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la0) && Float.compare(this.GWasM1elztuh, ((la0) obj).GWasM1elztuh) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return mr0.JFJ3QoxA(new StringBuilder("LinearFontScaleConverter(fontScale="), this.GWasM1elztuh, ')');
    }
}
