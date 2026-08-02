package defpackage;

/* loaded from: classes4.dex */
public final class w14 implements c24 {
    public final v1g a;
    public final int b;
    public final boolean c;
    public final lt d;

    public w14(v1g v1gVar, int i, boolean z, lt ltVar) {
        this.a = v1gVar;
        this.b = i;
        this.c = z;
        this.d = ltVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w14)) {
            return false;
        }
        w14 w14Var = (w14) obj;
        return this.a.equals(w14Var.a) && this.b == w14Var.b && this.c == w14Var.c && this.d.equals(w14Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.e(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "LikedAlbum(uiData=" + this.a + ", likesCount=" + this.b + ", hasTrailer=" + this.c + ", album=" + this.d + ")";
    }
}
