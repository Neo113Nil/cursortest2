package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gdc extends men {
    public final gcc k;
    public final n1p l;
    public final boolean m;
    public final boolean n;

    public gdc(gcc gccVar, n1p n1pVar, boolean z, boolean z2) {
        gccVar.getClass();
        this.k = gccVar;
        this.l = n1pVar;
        this.m = z;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdc)) {
            return false;
        }
        gdc gdcVar = (gdc) obj;
        return Intrinsics.d(this.k, gdcVar.k) && Intrinsics.d(this.l, gdcVar.l) && this.m == gdcVar.m && this.n == gdcVar.n;
    }

    public final int hashCode() {
        int hashCode = this.k.a.hashCode() * 31;
        n1p n1pVar = this.l;
        return Boolean.hashCode(this.n) + k5r.e((hashCode + (n1pVar == null ? 0 : n1pVar.hashCode())) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(filters=");
        sb.append(this.k);
        sb.append(", selectedFilter=");
        sb.append(this.l);
        sb.append(", filterLoading=");
        return v3w.g(sb, this.m, ", showFilters=", this.n, ")");
    }
}
