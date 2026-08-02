package defpackage;

/* loaded from: classes6.dex */
public final class wss extends qgg {
    public final sf4 a;
    public final tcm b;
    public final int c;
    public final i94 d;

    public wss(sf4 sf4Var, tcm tcmVar, int i, i94 i94Var) {
        this.a = sf4Var;
        this.b = tcmVar;
        this.c = i;
        this.d = i94Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wss)) {
            return false;
        }
        wss wssVar = (wss) obj;
        return this.a.equals(wssVar.a) && this.b.equals(wssVar.b) && this.c == wssVar.c && this.d == wssVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "TrackChartEntity(track=" + this.a + ", parent=" + this.b + ", positionInParent=" + this.c + ", type=" + this.d + ")";
    }
}
