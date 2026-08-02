package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k6p extends l6p {
    public final Pair a;
    public final gcc b;
    public final n1p c;
    public final boolean d;
    public final boolean e;
    public final zrj f;
    public final boolean g;
    public final pjc h;

    public k6p(Pair pair, gcc gccVar, n1p n1pVar, boolean z, boolean z2, zrj zrjVar, boolean z3, pjc pjcVar) {
        gccVar.getClass();
        this.a = pair;
        this.b = gccVar;
        this.c = n1pVar;
        this.d = z;
        this.e = z2;
        this.f = zrjVar;
        this.g = z3;
        this.h = pjcVar;
    }

    @Override // defpackage.l6p
    public final men a() {
        gcc gccVar = this.b;
        boolean isEmpty = gccVar.a.isEmpty();
        boolean z = this.e;
        boolean z2 = this.d;
        return (isEmpty && z2) ? new edc(z) : new gdc(gccVar, this.c, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6p)) {
            return false;
        }
        k6p k6pVar = (k6p) obj;
        return this.a.equals(k6pVar.a) && Intrinsics.d(this.b, k6pVar.b) && Intrinsics.d(this.c, k6pVar.c) && this.d == k6pVar.d && this.e == k6pVar.e && Intrinsics.d(this.f, k6pVar.f) && this.g == k6pVar.g && this.h.equals(k6pVar.h);
    }

    public final int hashCode() {
        int d = k5r.d(this.a.hashCode() * 31, 31, this.b.a);
        n1p n1pVar = this.c;
        int e = k5r.e(k5r.e((d + (n1pVar == null ? 0 : n1pVar.hashCode())) * 31, 31, this.d), 31, this.e);
        zrj zrjVar = this.f;
        return this.h.hashCode() + k5r.e((e + (zrjVar != null ? zrjVar.a.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        return "Result(queryKey=" + this.a + ", filters=" + this.b + ", selectedFilter=" + this.c + ", filterLoading=" + this.d + ", showFilters=" + this.e + ", misspell=" + this.f + ", showRetryButton=" + this.g + ", pagingItems=" + this.h + ")";
    }
}
