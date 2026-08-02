package defpackage;

/* loaded from: classes3.dex */
public final class rt {
    public final rab a;
    public final oq b;

    public rt(rab rabVar, oq oqVar) {
        this.a = rabVar;
        this.b = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt)) {
            return false;
        }
        rt rtVar = (rt) obj;
        return this.a.equals(rtVar.a) && this.b.equals(rtVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumGridItemModel(albumUiData=" + this.a + ", album=" + this.b + ")";
    }
}
