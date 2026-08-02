package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class y1p extends z1p {
    public final cvl a;
    public final List b;

    public y1p(cvl cvlVar, List list) {
        cvlVar.getClass();
        this.a = cvlVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1p)) {
            return false;
        }
        y1p y1pVar = (y1p) obj;
        return Intrinsics.d(this.a, y1pVar.a) && this.b.equals(y1pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemotePlaylist(playlistHeader=" + this.a + ", tracks=" + this.b + ")";
    }
}
