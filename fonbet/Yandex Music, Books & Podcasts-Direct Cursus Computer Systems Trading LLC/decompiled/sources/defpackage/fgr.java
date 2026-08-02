package defpackage;

/* loaded from: classes6.dex */
public final class fgr extends qgg {
    public final dgr a;
    public final tcm b;
    public final int c;
    public final i94 d;

    public fgr(dgr dgrVar, tcm tcmVar, int i, i94 i94Var) {
        this.a = dgrVar;
        this.b = tcmVar;
        this.c = i;
        this.d = i94Var;
        dgrVar.a.toString();
        dgrVar.c.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgr)) {
            return false;
        }
        fgr fgrVar = (fgr) obj;
        return this.a.equals(fgrVar.a) && this.b.equals(fgrVar.b) && this.c == fgrVar.c && this.d == fgrVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.a(this.c, (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "StationPodcastsEntity(stationDescriptor=" + this.a + ", parent=" + this.b + ", positionInParent=" + this.c + ", type=" + this.d + ")";
    }
}
