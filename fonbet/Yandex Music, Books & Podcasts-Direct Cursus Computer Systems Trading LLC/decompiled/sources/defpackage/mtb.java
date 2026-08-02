package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mtb {
    public static final mtb e = new mtb(c5b.a, false, fxk.a, "");
    public final List a;
    public final boolean b;
    public final nxk c;
    public final String d;

    public mtb(List list, boolean z, nxk nxkVar, String str) {
        list.getClass();
        nxkVar.getClass();
        str.getClass();
        this.a = list;
        this.b = z;
        this.c = nxkVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtb)) {
            return false;
        }
        mtb mtbVar = (mtb) obj;
        return Intrinsics.d(this.a, mtbVar.a) && this.b == mtbVar.b && Intrinsics.d(this.c, mtbVar.c) && Intrinsics.d(this.d, mtbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ExpandedPlayerBlocksUiState(blocks=" + this.a + ", hasMoreBlocks=" + this.b + ", playableType=" + this.c + ", skeletonPlayableId=" + this.d + ")";
    }
}
