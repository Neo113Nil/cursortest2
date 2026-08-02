package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v2v implements x2v {
    public final List a;
    public final String b;

    public v2v(List list, String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2v)) {
            return false;
        }
        v2v v2vVar = (v2v) obj;
        return Intrinsics.d(this.a, v2vVar.a) && Intrinsics.d(this.b, v2vVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ArtistsUgc(artists=" + this.a + ", ugcArtistName=" + this.b + ")";
    }
}
