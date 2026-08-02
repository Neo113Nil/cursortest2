package defpackage;

/* loaded from: classes3.dex */
public final class x9j {
    public final kbj a;
    public final oq b;

    public x9j(oq oqVar, kbj kbjVar) {
        this.a = kbjVar;
        this.b = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9j)) {
            return false;
        }
        x9j x9jVar = (x9j) obj;
        return this.a.equals(x9jVar.a) && this.b.equals(x9jVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NonMusicAlbumUiListItem(uiData=" + this.a + ", album=" + this.b + ")";
    }
}
