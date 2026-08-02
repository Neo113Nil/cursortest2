package defpackage;

/* loaded from: classes4.dex */
public final class dyv {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyv)) {
            return false;
        }
        heh hehVar = heh.a;
        return Float.compare(2.2f, 2.2f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(2.2f) + (heh.a.hashCode() * 31);
    }

    public final String toString() {
        return "WizardMatrixConfig(dragScrollMode=" + heh.a + ", velocityFriction=2.2)";
    }
}
