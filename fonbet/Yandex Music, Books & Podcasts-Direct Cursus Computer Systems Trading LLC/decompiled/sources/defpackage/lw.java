package defpackage;

/* loaded from: classes6.dex */
public final class lw extends srl {
    public static final /* synthetic */ s9f[] e;
    public final oq a;
    public final int b;
    public final i94 c;
    public final tb d;

    static {
        opi opiVar = new opi(lw.class, "parent", "getParent()Lru/yandex/music/novelties/podcasts/catalog/data/PodcastsBlock;", 0);
        ern.a.getClass();
        e = new s9f[]{opiVar};
    }

    public lw(oq oqVar, int i, i94 i94Var) {
        this.a = oqVar;
        this.b = i;
        this.c = i94Var;
        tb tbVar = new tb();
        tbVar.a = imp.k;
        this.d = tbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw)) {
            return false;
        }
        lw lwVar = (lw) obj;
        return this.a.equals(lwVar.a) && this.b == lwVar.b && this.c == lwVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.a.hashCode() * 31, 31);
    }

    @Override // defpackage.srl
    public final void n0(tcm tcmVar) {
        this.d.setValue(this, e[0], tcmVar);
    }

    public final String toString() {
        return "AlbumPodcastsEntity(album=" + this.a + ", positionInParent=" + this.b + ", type=" + this.c + ")";
    }
}
