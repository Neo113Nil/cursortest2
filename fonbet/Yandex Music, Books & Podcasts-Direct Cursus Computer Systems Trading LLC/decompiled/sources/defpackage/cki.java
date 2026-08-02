package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cki implements fki {
    public final lwl a;
    public final eul b;
    public final w70 c;

    public cki(lwl lwlVar, eul eulVar, w70 w70Var) {
        w70Var.getClass();
        this.a = lwlVar;
        this.b = eulVar;
        this.c = w70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cki)) {
            return false;
        }
        cki ckiVar = (cki) obj;
        return this.a.equals(ckiVar.a) && this.b.equals(ckiVar.b) && Intrinsics.d(this.c, ckiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Playlist(uiData=" + this.a + ", playlistDomainItem=" + this.b + ", analyticsEntityPosition=" + this.c + ")";
    }
}
