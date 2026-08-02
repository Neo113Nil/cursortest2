package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class n2w {
    public final ArrayList a;
    public final boolean b;

    public n2w(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2w)) {
            return false;
        }
        n2w n2wVar = (n2w) obj;
        return this.a.equals(n2wVar.a) && this.b == n2wVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WizardSimilarArtists(artists=" + this.a + ", isPumpkin=" + this.b + ")";
    }
}
