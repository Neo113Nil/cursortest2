package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b38 {
    public final ArrayList a;
    public final ArrayList b;

    public b38(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b38)) {
            return false;
        }
        b38 b38Var = (b38) obj;
        return this.a.equals(b38Var.a) && this.b.equals(b38Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffInTrackLists(diffList=" + this.a + ", oldTracksOutOfSizeActualTracks=" + this.b + ")";
    }
}
