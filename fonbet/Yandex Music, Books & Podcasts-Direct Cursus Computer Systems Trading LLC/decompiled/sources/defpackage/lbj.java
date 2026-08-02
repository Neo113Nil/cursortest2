package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class lbj implements pbj {
    public final oq a;
    public final mqs b;
    public final xc5 c;

    public lbj(oq oqVar, mqs mqsVar) {
        oqVar.getClass();
        this.a = oqVar;
        this.b = mqsVar;
        this.c = new xc5(oqVar.a);
    }

    @Override // defpackage.pbj
    public final mqs a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbj)) {
            return false;
        }
        lbj lbjVar = (lbj) obj;
        return Intrinsics.d(this.a, lbjVar.a) && Intrinsics.d(this.b, lbjVar.b);
    }

    @Override // defpackage.pbj
    public final a0q getId() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        mqs mqsVar = this.b;
        return hashCode + (mqsVar == null ? 0 : mqsVar.a.hashCode());
    }

    public final String toString() {
        return "AlbumEntity(album=" + this.a + ", track=" + this.b + ")";
    }
}
