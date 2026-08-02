package defpackage;

/* loaded from: classes6.dex */
public final class u61 extends srl {
    public static final /* synthetic */ s9f[] e;
    public final c01 a;
    public final int b;
    public final i94 c;
    public final tb d;

    static {
        opi opiVar = new opi(u61.class, "parent", "getParent()Lru/yandex/music/novelties/podcasts/catalog/data/PodcastsBlock;", 0);
        ern.a.getClass();
        e = new s9f[]{opiVar};
    }

    public u61(c01 c01Var, int i, i94 i94Var) {
        this.a = c01Var;
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
        if (!(obj instanceof u61)) {
            return false;
        }
        u61 u61Var = (u61) obj;
        return this.a.equals(u61Var.a) && this.b == u61Var.b && this.c == u61Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.a.hashCode() * 31, 31);
    }

    @Override // defpackage.srl
    public final void n0(tcm tcmVar) {
        this.d.setValue(this, e[0], tcmVar);
    }

    public final String toString() {
        return "ArtistEntity(artist=" + this.a + ", positionInParent=" + this.b + ", type=" + this.c + ")";
    }
}
