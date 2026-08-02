package defpackage;

/* loaded from: classes6.dex */
public final class tmk extends s4m {
    public static final /* synthetic */ s9f[] e;
    public final qmk a;
    public final int b;
    public final i94 c;
    public final tb d;

    static {
        opi opiVar = new opi(tmk.class, "parent", "getParent()Lru/yandex/music/novelties/podcasts/catalog/data/PodcastsBlock;", 0);
        ern.a.getClass();
        e = new s9f[]{opiVar};
    }

    public tmk(qmk qmkVar, int i, i94 i94Var) {
        this.a = qmkVar;
        this.b = i;
        this.c = i94Var;
        tb tbVar = new tb();
        tbVar.a = imp.k;
        this.d = tbVar;
        smk smkVar = qmkVar.a;
        smkVar.b.e();
        smkVar.b.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmk)) {
            return false;
        }
        tmk tmkVar = (tmk) obj;
        return this.a.equals(tmkVar.a) && this.b == tmkVar.b && this.c == tmkVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.srl
    public final void n0(tcm tcmVar) {
        this.d.setValue(this, e[0], tcmVar);
    }

    public final String toString() {
        return "PersonalPlaylistPodcastsEntity(personalPlaylist=" + this.a + ", positionInParent=" + this.b + ", type=" + this.c + ")";
    }
}
