package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sz3 {
    public final ArrayList a;
    public final List b;
    public final Integer c;

    public sz3(ArrayList arrayList, ArrayList arrayList2, Integer num) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz3)) {
            return false;
        }
        sz3 sz3Var = (sz3) obj;
        return this.a.equals(sz3Var.a) && Intrinsics.d(this.b, sz3Var.b) && Intrinsics.d(this.c, sz3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int e = k5r.e((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, true);
        Integer num = this.c;
        return e + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "CarouselArtistsBlockData(artists=" + this.a + ", artistsTop=" + this.b + ", hasMore=true, artistsLastRecentlyLikedIndex=" + this.c + ")";
    }
}
