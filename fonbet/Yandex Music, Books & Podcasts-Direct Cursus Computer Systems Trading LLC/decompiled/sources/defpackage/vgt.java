package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class vgt extends iht {
    public final ArrayList a;
    public final eul b;

    public vgt(ArrayList arrayList, eul eulVar) {
        this.a = arrayList;
        this.b = eulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgt)) {
            return false;
        }
        vgt vgtVar = (vgt) obj;
        return this.a.equals(vgtVar.a) && this.b.equals(vgtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(tracks=" + this.a + ", playlistDomainItem=" + this.b + ")";
    }
}
