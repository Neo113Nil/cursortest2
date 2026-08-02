package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fwr implements jwr {
    public final f2g a;
    public final List b;
    public final List c;

    public fwr(f2g f2gVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = f2gVar;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwr)) {
            return false;
        }
        fwr fwrVar = (fwr) obj;
        return this.a.equals(fwrVar.a) && Intrinsics.d(this.b, fwrVar.b) && Intrinsics.d(this.c, fwrVar.c);
    }

    @Override // defpackage.jwr
    public final n43 getType() {
        return j43.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikedTracksSyncBlock(info=");
        sb.append(this.a);
        sb.append(", liked=");
        sb.append(this.b);
        sb.append(", disliked=");
        return vz1.u(sb, this.c, ")");
    }
}
