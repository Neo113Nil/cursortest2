package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hwr implements jwr {
    public final List a;

    public hwr(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwr) && Intrinsics.d(this.a, ((hwr) obj).a);
    }

    @Override // defpackage.jwr
    public final n43 getType() {
        return l43.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("OwnPlaylistsSyncBlock(playlists=", ")", this.a);
    }
}
