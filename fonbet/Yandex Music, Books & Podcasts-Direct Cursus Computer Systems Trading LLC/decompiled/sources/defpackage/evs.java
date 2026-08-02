package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class evs implements fvs {
    public final cvl a;
    public final List b;

    public evs(cvl cvlVar, List list) {
        cvlVar.getClass();
        list.getClass();
        this.a = cvlVar;
        this.b = list;
    }

    @Override // defpackage.fvs
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evs)) {
            return false;
        }
        evs evsVar = (evs) obj;
        return Intrinsics.d(this.a, evsVar.a) && Intrinsics.d(this.b, evsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistTrackDownloadMeta(playlistHeader=" + this.a + ", tracks=" + this.b + ")";
    }
}
