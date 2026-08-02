package defpackage;

/* loaded from: classes6.dex */
public final class ns extends qgg {
    public final re4 a;
    public final tcm b;
    public final int c;
    public final i94 d;

    public ns(re4 re4Var, tcm tcmVar, int i, i94 i94Var) {
        this.a = re4Var;
        this.b = tcmVar;
        this.c = i;
        this.d = i94Var;
        oq oqVar = re4Var.a;
        oqVar.getClass();
        oqVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns)) {
            return false;
        }
        ns nsVar = (ns) obj;
        return this.a.equals(nsVar.a) && this.b.equals(nsVar.b) && this.c == nsVar.c && this.d == nsVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "AlbumChartEntity(album=" + this.a + ", parent=" + this.b + ", positionInParent=" + this.c + ", type=" + this.d + ")";
    }
}
