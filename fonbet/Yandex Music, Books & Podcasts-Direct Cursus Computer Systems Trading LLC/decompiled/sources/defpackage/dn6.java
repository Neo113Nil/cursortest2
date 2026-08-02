package defpackage;

/* loaded from: classes3.dex */
public final class dn6 {
    public final ru a;
    public final oq b;

    public dn6(oq oqVar, ru ruVar) {
        this.a = ruVar;
        this.b = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn6)) {
            return false;
        }
        dn6 dn6Var = (dn6) obj;
        return this.a.equals(dn6Var.a) && this.b.equals(dn6Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CoverAlbumItem(uiData=" + this.a + ", album=" + this.b + ")";
    }
}
