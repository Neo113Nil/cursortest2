package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m04 extends n04 {
    public final ArrayList a;
    public final List b;
    public final Integer c;

    public m04(ArrayList arrayList, List list, Integer num) {
        this.a = arrayList;
        this.b = list;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m04)) {
            return false;
        }
        m04 m04Var = (m04) obj;
        return this.a.equals(m04Var.a) && Intrinsics.d(this.b, m04Var.b) && Intrinsics.d(this.c, m04Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Success(artistList=" + this.a + ", artistsTop=" + this.b + ", artistsLastRecentlyLikedIndex=" + this.c + ")";
    }
}
