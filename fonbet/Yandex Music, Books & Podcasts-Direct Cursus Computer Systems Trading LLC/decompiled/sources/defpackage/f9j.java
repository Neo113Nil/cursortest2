package defpackage;

/* loaded from: classes3.dex */
public final class f9j {
    public final x1g a;
    public final oq b;

    public f9j(oq oqVar, x1g x1gVar) {
        this.a = x1gVar;
        this.b = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9j)) {
            return false;
        }
        f9j f9jVar = (f9j) obj;
        return this.a.equals(f9jVar.a) && this.b.equals(f9jVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NonMusicAlbumItemUiModel(uiData=" + this.a + ", album=" + this.b + ")";
    }
}
