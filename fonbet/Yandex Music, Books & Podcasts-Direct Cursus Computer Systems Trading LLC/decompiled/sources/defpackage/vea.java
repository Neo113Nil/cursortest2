package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class vea implements wea {
    public final ArrayList a;
    public final ArrayList b;

    public vea(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vea)) {
            return false;
        }
        vea veaVar = (vea) obj;
        return this.a.equals(veaVar.a) && this.b.equals(veaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(books=" + this.a + ", bookAlbums=" + this.b + ")";
    }
}
