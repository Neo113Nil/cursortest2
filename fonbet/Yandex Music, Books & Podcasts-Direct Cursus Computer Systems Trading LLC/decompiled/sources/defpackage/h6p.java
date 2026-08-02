package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h6p extends l6p {
    public final gcc a;
    public final n1p b;
    public final boolean c;
    public final zrj d;
    public final c0p e;
    public final p0p f;
    public final boolean g;
    public final men h;

    public h6p(gcc gccVar, n1p n1pVar, boolean z, zrj zrjVar, c0p c0pVar, p0p p0pVar, boolean z2) {
        c0pVar.getClass();
        p0pVar.getClass();
        this.a = gccVar;
        this.b = n1pVar;
        this.c = z;
        this.d = zrjVar;
        this.e = c0pVar;
        this.f = p0pVar;
        this.g = z2;
        this.h = z2 ? new gdc(gccVar, n1pVar, z, true) : fdc.k;
    }

    @Override // defpackage.l6p
    public final men a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6p)) {
            return false;
        }
        h6p h6pVar = (h6p) obj;
        return this.a.equals(h6pVar.a) && Intrinsics.d(this.b, h6pVar.b) && this.c == h6pVar.c && Intrinsics.d(this.d, h6pVar.d) && this.e == h6pVar.e && this.f == h6pVar.f && this.g == h6pVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        n1p n1pVar = this.b;
        int e = k5r.e((hashCode + (n1pVar == null ? 0 : n1pVar.hashCode())) * 31, 31, this.c);
        zrj zrjVar = this.d;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((e + (zrjVar != null ? zrjVar.a.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty(filters=");
        sb.append(this.a);
        sb.append(", selectedFilter=");
        sb.append(this.b);
        sb.append(", filterLoading=");
        sb.append(this.c);
        sb.append(", misspell=");
        sb.append(this.d);
        sb.append(", context=");
        sb.append(this.e);
        sb.append(", entityType=");
        sb.append(this.f);
        sb.append(", nonDefaultFilterSelected=");
        return ouj.r(sb, this.g, ")");
    }
}
