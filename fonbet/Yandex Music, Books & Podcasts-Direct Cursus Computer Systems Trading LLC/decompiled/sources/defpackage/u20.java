package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class u20 {
    public final oq a;
    public final mqs b;

    public u20(oq oqVar, mqs mqsVar) {
        oqVar.getClass();
        this.a = oqVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u20)) {
            return false;
        }
        u20 u20Var = (u20) obj;
        return Intrinsics.d(this.a, u20Var.a) && Intrinsics.d(this.b, u20Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        mqs mqsVar = this.b;
        return hashCode + (mqsVar == null ? 0 : mqsVar.a.hashCode());
    }

    public final String toString() {
        return "AlbumWithTrack(album=" + this.a + ", track=" + this.b + ")";
    }
}
