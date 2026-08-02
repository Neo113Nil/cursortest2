package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rrs implements srs {
    public final xbb a;
    public final List b;
    public final List c;
    public final lnu d;
    public final ubb e;
    public final ArrayList f;
    public final ArrayList g;
    public final boolean h;

    public rrs(xbb xbbVar, List list, List list2, lnu lnuVar, ubb ubbVar, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        xbbVar.getClass();
        list2.getClass();
        this.a = xbbVar;
        this.b = list;
        this.c = list2;
        this.d = lnuVar;
        this.e = ubbVar;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrs)) {
            return false;
        }
        rrs rrsVar = (rrs) obj;
        return Intrinsics.d(this.a, rrsVar.a) && Intrinsics.d(this.b, rrsVar.b) && Intrinsics.d(this.c, rrsVar.c) && Intrinsics.d(this.d, rrsVar.d) && Intrinsics.d(this.e, rrsVar.e) && this.f.equals(rrsVar.f) && this.g.equals(rrsVar.g) && this.h == rrsVar.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int d = k5r.d((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.c);
        lnu lnuVar = this.d;
        int hashCode2 = (d + (lnuVar == null ? 0 : lnuVar.hashCode())) * 31;
        ubb ubbVar = this.e;
        return Boolean.hashCode(this.h) + dfi.b(this.g, dfi.b(this.f, (hashCode2 + (ubbVar != null ? ubbVar.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "Success(header=" + this.a + ", artists=" + this.b + ", disclaimers=" + this.c + ", wave=" + this.d + ", buttons=" + this.e + ", primaryActions=" + this.f + ", secondaryActions=" + this.g + ", isWaveAgentsExperimentEnabled=" + this.h + ")";
    }
}
