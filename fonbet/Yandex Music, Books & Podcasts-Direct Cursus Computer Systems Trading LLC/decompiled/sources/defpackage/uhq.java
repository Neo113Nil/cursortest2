package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class uhq implements vhq {
    public final ArrayList a;
    public final gjl b;

    public uhq(ArrayList arrayList, gjl gjlVar) {
        this.a = arrayList;
        this.b = gjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhq)) {
            return false;
        }
        uhq uhqVar = (uhq) obj;
        return this.a.equals(uhqVar.a) && this.b.equals(uhqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Tracks(tracks=" + this.a + ", analyticsPayload=" + this.b + ")";
    }
}
