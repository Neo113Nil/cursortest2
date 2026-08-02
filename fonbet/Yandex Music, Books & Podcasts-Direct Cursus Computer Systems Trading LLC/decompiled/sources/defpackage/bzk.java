package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bzk implements czk {
    public final cvl a;
    public final List b;
    public final o3q c;
    public final String d;

    public bzk(cvl cvlVar, List list, o3q o3qVar, String str) {
        cvlVar.getClass();
        list.getClass();
        this.a = cvlVar;
        this.b = list;
        this.c = o3qVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzk)) {
            return false;
        }
        bzk bzkVar = (bzk) obj;
        return Intrinsics.d(this.a, bzkVar.a) && Intrinsics.d(this.b, bzkVar.b) && this.c == bzkVar.c && Intrinsics.d(this.d, bzkVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Playlist(playlistHeader=" + this.a + ", tracks=" + this.b + ", subtype=" + this.c + ", filterId=" + this.d + ")";
    }
}
