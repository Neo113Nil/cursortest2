package defpackage;

/* loaded from: classes6.dex */
public final class axl extends s4m {
    public static final /* synthetic */ s9f[] e;
    public final rrl a;
    public final int b;
    public final i94 c;
    public final tb d;

    static {
        opi opiVar = new opi(axl.class, "parent", "getParent()Lru/yandex/music/novelties/podcasts/catalog/data/PodcastsBlock;", 0);
        ern.a.getClass();
        e = new s9f[]{opiVar};
    }

    public axl(rrl rrlVar, int i, i94 i94Var) {
        this.a = rrlVar;
        this.b = i;
        this.c = i94Var;
        tb tbVar = new tb();
        tbVar.a = imp.k;
        this.d = tbVar;
        cvl cvlVar = rrlVar.a;
        cvlVar.e();
        cvlVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axl)) {
            return false;
        }
        axl axlVar = (axl) obj;
        return this.a.equals(axlVar.a) && this.b == axlVar.b && this.c == axlVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.srl
    public final void n0(tcm tcmVar) {
        this.d.setValue(this, e[0], tcmVar);
    }

    public final String toString() {
        return "PlaylistPodcastsEntity(playlist=" + this.a + ", positionInParent=" + this.b + ", type=" + this.c + ")";
    }
}
