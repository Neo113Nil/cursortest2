package defpackage;

/* loaded from: classes3.dex */
public final class wbm implements ybm {
    public final mt a;
    public final iab b;
    public final j0s c;
    public final ham d;
    public final ghm e;
    public final mxs f;

    public wbm(mt mtVar, iab iabVar, j0s j0sVar, ham hamVar, ghm ghmVar, mxs mxsVar) {
        this.a = mtVar;
        this.b = iabVar;
        this.c = j0sVar;
        this.d = hamVar;
        this.e = ghmVar;
        this.f = mxsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbm)) {
            return false;
        }
        wbm wbmVar = (wbm) obj;
        return this.a.equals(wbmVar.a) && this.b.equals(wbmVar.b) && this.c == wbmVar.c && this.d.equals(wbmVar.d) && this.e.equals(wbmVar.e) && this.f.equals(wbmVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Success(albumFull=" + this.a + ", header=" + this.b + ", defaultSelectedTab=" + this.c + ", info=" + this.d + ", popularEpisodes=" + this.e + ", trackListUiData=" + this.f + ")";
    }
}
