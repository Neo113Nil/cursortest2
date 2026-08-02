package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gwr implements jwr {
    public final g2g a;
    public final List b;
    public final List c;

    public gwr(g2g g2gVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = g2gVar;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwr)) {
            return false;
        }
        gwr gwrVar = (gwr) obj;
        return this.a.equals(gwrVar.a) && Intrinsics.d(this.b, gwrVar.b) && Intrinsics.d(this.c, gwrVar.c);
    }

    @Override // defpackage.jwr
    public final n43 getType() {
        return k43.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikedVideoClipsSyncBlock(info=");
        sb.append(this.a);
        sb.append(", liked=");
        sb.append(this.b);
        sb.append(", disliked=");
        return vz1.u(sb, this.c, ")");
    }
}
