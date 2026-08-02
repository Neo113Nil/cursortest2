package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c1q implements z3q, d2q {
    public final oq a;
    public final qhd b;
    public final d1q c;
    public final String d;

    public c1q(oq oqVar, qhd qhdVar) {
        oqVar.getClass();
        qhdVar.getClass();
        this.a = oqVar;
        this.b = qhdVar;
        this.c = new d1q(oqVar.a);
        this.d = oqVar.b;
    }

    @Override // defpackage.z3q
    public final qhd e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1q)) {
            return false;
        }
        c1q c1qVar = (c1q) obj;
        return Intrinsics.d(this.a, c1qVar.a) && Intrinsics.d(this.b, c1qVar.b);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SharedGlagolAlbumEntity(album=" + this.a + ", preview=" + this.b + ")";
    }

    @Override // defpackage.z3q, defpackage.u3q
    public final g1q getId() {
        return this.c;
    }
}
