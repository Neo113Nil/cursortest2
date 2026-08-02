package defpackage;

/* loaded from: classes5.dex */
public final class te4 implements yit {
    public final lt a;
    public final int b;
    public final lf4 c;
    public final boolean d;

    public te4(lt ltVar, int i, lf4 lf4Var, boolean z) {
        this.a = ltVar;
        this.b = i;
        this.c = lf4Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te4)) {
            return false;
        }
        te4 te4Var = (te4) obj;
        return this.a.equals(te4Var.a) && this.b == te4Var.b && this.c.equals(te4Var.c) && this.d == te4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ChartAlbumUniversalEntity(album=" + this.a + ", likesCount=" + this.b + ", chart=" + this.c + ", hasTrailer=" + this.d + ")";
    }
}
