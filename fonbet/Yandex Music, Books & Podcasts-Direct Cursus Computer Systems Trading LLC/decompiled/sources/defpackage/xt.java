package defpackage;

/* loaded from: classes3.dex */
public final class xt {
    public final oq a;
    public final ru b;

    public xt(oq oqVar, ru ruVar) {
        this.a = oqVar;
        this.b = ruVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt)) {
            return false;
        }
        xt xtVar = (xt) obj;
        return this.a.equals(xtVar.a) && this.b.equals(xtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumItem(album=" + this.a + ", uiData=" + this.b + ")";
    }
}
