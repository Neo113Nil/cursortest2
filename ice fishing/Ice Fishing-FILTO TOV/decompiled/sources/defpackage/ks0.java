package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ks0 {
    public static final ks0 Yi7zF1RB1 = new ks0(new hb());
    public final hb GWasM1elztuh;

    public ks0(hb hbVar) {
        this.GWasM1elztuh = hbVar;
        if (Float.isNaN(0.0f)) {
            o4.mE4lRynR("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks0) && this.GWasM1elztuh.equals(((ks0) obj).GWasM1elztuh);
    }

    public final int hashCode() {
        return (this.GWasM1elztuh.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.GWasM1elztuh + ", steps=0)";
    }
}
