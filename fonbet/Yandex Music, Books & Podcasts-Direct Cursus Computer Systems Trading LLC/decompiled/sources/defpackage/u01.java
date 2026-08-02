package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u01 {
    public final q6k a;
    public final oq b;

    public u01(q6k q6kVar, oq oqVar) {
        oqVar.getClass();
        this.a = q6kVar;
        this.b = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u01)) {
            return false;
        }
        u01 u01Var = (u01) obj;
        return this.a.equals(u01Var.a) && Intrinsics.d(this.b, u01Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistAlbumListItem(uiData=" + this.a + ", album=" + this.b + ")";
    }
}
