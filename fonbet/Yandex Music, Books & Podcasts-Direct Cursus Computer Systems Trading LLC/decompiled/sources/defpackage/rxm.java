package defpackage;

/* loaded from: classes6.dex */
public final class rxm extends qgg {
    public final gem a;
    public final tcm b;
    public final int c;
    public final i94 d;

    public rxm(gem gemVar, tcm tcmVar, int i, i94 i94Var) {
        this.a = gemVar;
        this.b = tcmVar;
        this.c = i;
        this.d = i94Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxm)) {
            return false;
        }
        rxm rxmVar = (rxm) obj;
        return this.a.equals(rxmVar.a) && this.b.equals(rxmVar.b) && this.c == rxmVar.c && this.d == rxmVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "PromotionPodcastsEntity(promotion=" + this.a + ", parent=" + this.b + ", positionInParent=" + this.c + ", type=" + this.d + ")";
    }
}
