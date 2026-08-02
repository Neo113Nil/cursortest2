package defpackage;

/* loaded from: classes3.dex */
public final class oab implements qab {
    public final oq a;
    public final ru b;

    public oab(oq oqVar, ru ruVar) {
        this.a = oqVar;
        this.b = ruVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oab)) {
            return false;
        }
        oab oabVar = (oab) obj;
        return this.a.equals(oabVar.a) && this.b.equals(oabVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumEntity(data=" + this.a + ", uiData=" + this.b + ")";
    }
}
