package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class aw implements dw {
    public final int GWasM1elztuh;

    public aw(int i) {
        this.GWasM1elztuh = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && this.GWasM1elztuh == ((aw) obj).GWasM1elztuh;
    }

    public final int hashCode() {
        return Integer.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return mr0.encWxUiV2("NavigateToLevel(levelIndex=", this.GWasM1elztuh, ")");
    }
}
