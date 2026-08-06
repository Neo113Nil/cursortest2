package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class be1 implements s3 {
    public final String GWasM1elztuh;

    public be1(String str) {
        this.GWasM1elztuh = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof be1) {
            return this.GWasM1elztuh.equals(((be1) obj).GWasM1elztuh);
        }
        return false;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.GWasM1elztuh + ')';
    }
}
