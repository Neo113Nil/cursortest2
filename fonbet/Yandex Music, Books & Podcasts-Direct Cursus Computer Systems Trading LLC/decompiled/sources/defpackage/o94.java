package defpackage;

/* loaded from: classes6.dex */
public final class o94 extends qgg {
    public final fdm a;
    public final tcm b;
    public final int c;
    public final i94 d;

    public o94(fdm fdmVar, tcm tcmVar, int i, i94 i94Var) {
        this.a = fdmVar;
        this.b = tcmVar;
        this.c = i;
        this.d = i94Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o94)) {
            return false;
        }
        o94 o94Var = (o94) obj;
        return this.a.equals(o94Var.a) && this.b.equals(o94Var.b) && this.c == o94Var.c && this.d == o94Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "CategoryPodcastsEntity(category=" + this.a + ", parent=" + this.b + ", positionInParent=" + this.c + ", type=" + this.d + ")";
    }
}
