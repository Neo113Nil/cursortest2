package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h35 {
    public final List a;
    public final List b;

    public h35(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h35)) {
            return false;
        }
        h35 h35Var = (h35) obj;
        return Intrinsics.d(this.a, h35Var.a) && Intrinsics.d(this.b, h35Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CollectionPodcastListData(albumList=" + this.a + ", trackList=" + this.b + ")";
    }
}
