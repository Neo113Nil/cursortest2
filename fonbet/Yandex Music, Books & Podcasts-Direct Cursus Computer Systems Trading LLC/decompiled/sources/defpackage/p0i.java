package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p0i {
    public final rab a;
    public final oq b;

    public p0i(rab rabVar, oq oqVar) {
        oqVar.getClass();
        this.a = rabVar;
        this.b = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0i)) {
            return false;
        }
        p0i p0iVar = (p0i) obj;
        return this.a.equals(p0iVar.a) && Intrinsics.d(this.b, p0iVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaTagAlbumListItem(uiData=" + this.a + ", album=" + this.b + ")";
    }
}
