package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class bia implements cia {
    public final ArrayList a;
    public final ArrayList b;

    public bia(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bia)) {
            return false;
        }
        bia biaVar = (bia) obj;
        return this.a.equals(biaVar.a) && this.b.equals(biaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(episodes=" + this.a + ", podcasts=" + this.b + ")";
    }
}
