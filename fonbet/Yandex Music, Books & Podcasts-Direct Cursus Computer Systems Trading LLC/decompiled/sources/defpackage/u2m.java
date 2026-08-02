package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u2m {
    public final cvl a;
    public final List b;

    public u2m(cvl cvlVar, List list) {
        cvlVar.getClass();
        list.getClass();
        this.a = cvlVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2m)) {
            return false;
        }
        u2m u2mVar = (u2m) obj;
        return Intrinsics.d(this.a, u2mVar.a) && Intrinsics.d(this.b, u2mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistTracks(header=" + this.a + ", tracks=" + this.b + ")";
    }
}
