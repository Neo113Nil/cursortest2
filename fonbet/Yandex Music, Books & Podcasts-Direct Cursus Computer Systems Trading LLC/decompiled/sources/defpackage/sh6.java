package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sh6 implements xh6 {
    public final oq a;
    public final mqs b;

    public sh6(oq oqVar, mqs mqsVar) {
        oqVar.getClass();
        this.a = oqVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh6)) {
            return false;
        }
        sh6 sh6Var = (sh6) obj;
        return Intrinsics.d(this.a, sh6Var.a) && Intrinsics.d(this.b, sh6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        mqs mqsVar = this.b;
        return hashCode + (mqsVar == null ? 0 : mqsVar.a.hashCode());
    }

    public final String toString() {
        return "AlbumItem(album=" + this.a + ", track=" + this.b + ")";
    }
}
