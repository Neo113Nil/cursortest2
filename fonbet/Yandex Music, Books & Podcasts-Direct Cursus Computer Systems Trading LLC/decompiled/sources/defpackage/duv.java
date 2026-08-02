package defpackage;

/* loaded from: classes4.dex */
public final class duv {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duv)) {
            return false;
        }
        b3w b3wVar = b3w.BOTH_DIMENSIONS;
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((b3w.BOTH_DIMENSIONS.hashCode() + f1d.a(13, Integer.hashCode(13) * 31, 31)) * 31);
    }

    public final String toString() {
        return "WizardConfig(initialHeight=13, initialWidth=13, type=" + b3w.BOTH_DIMENSIONS + ", isSymmetricalInsertion=true)";
    }
}
