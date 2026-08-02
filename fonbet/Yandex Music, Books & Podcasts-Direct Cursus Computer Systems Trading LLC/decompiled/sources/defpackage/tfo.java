package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tfo {
    public final String a;
    public final Boolean b;
    public final List c;
    public final sml d;

    public tfo(String str, Boolean bool, List list, sml smlVar) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = bool;
        this.c = list;
        this.d = smlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfo)) {
            return false;
        }
        tfo tfoVar = (tfo) obj;
        return Intrinsics.d(this.a, tfoVar.a) && Intrinsics.d(this.b, tfoVar.b) && Intrinsics.d(this.c, tfoVar.c) && Intrinsics.d(this.d, tfoVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int d = k5r.d((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c);
        sml smlVar = this.d;
        return d + (smlVar != null ? smlVar.hashCode() : 0);
    }

    public final String toString() {
        return "RotorTrackBatch(batchId=" + this.a + ", pumpkin=" + this.b + ", sequence=" + this.c + ", offlineRecommenderData=" + this.d + ")";
    }
}
