package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class csl implements dsl {
    public final xbb a;
    public final String b;
    public final lnu c;
    public final ArrayList d;
    public final ArrayList e;
    public final boolean f;

    public csl(xbb xbbVar, String str, lnu lnuVar, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.a = xbbVar;
        this.b = str;
        this.c = lnuVar;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csl)) {
            return false;
        }
        csl cslVar = (csl) obj;
        return this.a.equals(cslVar.a) && Intrinsics.d(this.b, cslVar.b) && Intrinsics.d(this.c, cslVar.c) && this.d.equals(cslVar.d) && this.e.equals(cslVar.e) && this.f == cslVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        lnu lnuVar = this.c;
        return Boolean.hashCode(this.f) + dfi.b(this.e, dfi.b(this.d, (hashCode2 + (lnuVar != null ? lnuVar.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "Success(header=" + this.a + ", description=" + this.b + ", wave=" + this.c + ", primaryActions=" + this.d + ", secondaryActions=" + this.e + ", isWaveAgentsExperimentEnabled=" + this.f + ")";
    }
}
