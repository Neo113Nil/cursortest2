package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e9j {
    public final oq a;
    public final kbj b;

    public e9j(oq oqVar, kbj kbjVar) {
        oqVar.getClass();
        this.a = oqVar;
        this.b = kbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9j)) {
            return false;
        }
        e9j e9jVar = (e9j) obj;
        return Intrinsics.d(this.a, e9jVar.a) && this.b.equals(e9jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "NonMusicAlbumItem(album=" + this.a + ", uiData=" + this.b + ")";
    }
}
