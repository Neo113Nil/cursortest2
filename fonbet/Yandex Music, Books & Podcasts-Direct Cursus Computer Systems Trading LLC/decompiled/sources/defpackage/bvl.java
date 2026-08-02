package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bvl {
    public final rab a;
    public final cvl b;

    public bvl(rab rabVar, cvl cvlVar) {
        cvlVar.getClass();
        this.a = rabVar;
        this.b = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvl)) {
            return false;
        }
        bvl bvlVar = (bvl) obj;
        return this.a.equals(bvlVar.a) && Intrinsics.d(this.b, bvlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistGridItemModel(uiData=" + this.a + ", playlistHeader=" + this.b + ")";
    }
}
