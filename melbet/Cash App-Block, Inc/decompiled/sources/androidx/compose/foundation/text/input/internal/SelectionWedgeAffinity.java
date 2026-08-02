package androidx.compose.foundation.text.input.internal;

/* loaded from: classes.dex */
public final class SelectionWedgeAffinity {
    public final WedgeAffinity endAffinity;
    public final WedgeAffinity startAffinity;

    public SelectionWedgeAffinity(WedgeAffinity wedgeAffinity, WedgeAffinity wedgeAffinity2) {
        this.startAffinity = wedgeAffinity;
        this.endAffinity = wedgeAffinity2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionWedgeAffinity)) {
            return false;
        }
        SelectionWedgeAffinity selectionWedgeAffinity = (SelectionWedgeAffinity) obj;
        return this.startAffinity == selectionWedgeAffinity.startAffinity && this.endAffinity == selectionWedgeAffinity.endAffinity;
    }

    public final int hashCode() {
        return this.endAffinity.hashCode() + (this.startAffinity.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.startAffinity + ", endAffinity=" + this.endAffinity + ')';
    }
}
