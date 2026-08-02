package defpackage;

/* loaded from: classes4.dex */
public final class r91 {
    public final q91 a;
    public final u51 b;

    public r91(q91 q91Var, u51 u51Var) {
        this.a = q91Var;
        this.b = u51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r91)) {
            return false;
        }
        r91 r91Var = (r91) obj;
        return this.a.equals(r91Var.a) && this.b.equals(r91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistGridItemUiModel(uiData=" + this.a + ", artist=" + this.b + ")";
    }
}
