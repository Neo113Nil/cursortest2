package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class asi implements bsi {
    public final oq a;
    public final mqs b;

    public asi(oq oqVar, mqs mqsVar) {
        this.a = oqVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asi)) {
            return false;
        }
        asi asiVar = (asi) obj;
        return this.a.equals(asiVar.a) && Intrinsics.d(this.b, asiVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        mqs mqsVar = this.b;
        return hashCode + (mqsVar == null ? 0 : mqsVar.a.hashCode());
    }

    public final String toString() {
        return "MyShelfBlockPlayedAlbum(album=" + this.a + ", track=" + this.b + ")";
    }
}
