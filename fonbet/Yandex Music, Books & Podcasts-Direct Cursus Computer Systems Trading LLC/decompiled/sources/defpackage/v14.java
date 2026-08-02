package defpackage;

/* loaded from: classes4.dex */
public final class v14 implements c24 {
    public final se4 a;
    public final int b;
    public final boolean c;
    public final lt d;

    public v14(se4 se4Var, int i, boolean z, lt ltVar) {
        this.a = se4Var;
        this.b = i;
        this.c = z;
        this.d = ltVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v14)) {
            return false;
        }
        v14 v14Var = (v14) obj;
        return this.a.equals(v14Var.a) && this.b == v14Var.b && this.c == v14Var.c && this.d.equals(v14Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.e(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "ChartAlbum(uiData=" + this.a + ", likesCount=" + this.b + ", hasTrailer=" + this.c + ", album=" + this.d + ")";
    }
}
