package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dwr implements jwr {
    public final t1g a;
    public final List b;
    public final List c;

    public dwr(t1g t1gVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = t1gVar;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwr)) {
            return false;
        }
        dwr dwrVar = (dwr) obj;
        return this.a.equals(dwrVar.a) && Intrinsics.d(this.b, dwrVar.b) && Intrinsics.d(this.c, dwrVar.c);
    }

    @Override // defpackage.jwr
    public final n43 getType() {
        return h43.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikedArtistsSyncBlock(info=");
        sb.append(this.a);
        sb.append(", liked=");
        sb.append(this.b);
        sb.append(", disliked=");
        return vz1.u(sb, this.c, ")");
    }
}
