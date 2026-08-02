package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d9j {
    public final oq a;
    public final kbj b;

    public d9j(oq oqVar, kbj kbjVar) {
        oqVar.getClass();
        this.a = oqVar;
        this.b = kbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9j)) {
            return false;
        }
        d9j d9jVar = (d9j) obj;
        return Intrinsics.d(this.a, d9jVar.a) && this.b.equals(d9jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "NonMusicAlbumItem(album=" + this.a + ", uiData=" + this.b + ")";
    }
}
