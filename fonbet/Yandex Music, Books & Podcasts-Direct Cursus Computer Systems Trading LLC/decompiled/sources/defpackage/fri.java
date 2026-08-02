package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fri implements kri {
    public final oq a;
    public final mqs b;

    public fri(oq oqVar, mqs mqsVar) {
        oqVar.getClass();
        this.a = oqVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fri)) {
            return false;
        }
        fri friVar = (fri) obj;
        return Intrinsics.d(this.a, friVar.a) && Intrinsics.d(this.b, friVar.b);
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
