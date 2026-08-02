package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cwl {
    public final List a;
    public final List b;

    public cwl(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwl)) {
            return false;
        }
        cwl cwlVar = (cwl) obj;
        return Intrinsics.d(this.a, cwlVar.a) && Intrinsics.d(this.b, cwlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistListDataSet(ownPlaylistList=" + this.a + ", likedPlaylistList=" + this.b + ")";
    }
}
