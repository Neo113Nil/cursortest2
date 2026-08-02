package defpackage;

/* loaded from: classes4.dex */
public final class mtq implements otq {
    public final ys4 a;
    public final ns4 b;

    public mtq(ys4 ys4Var, ns4 ns4Var) {
        this.a = ys4Var;
        this.b = ns4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtq)) {
            return false;
        }
        mtq mtqVar = (mtq) obj;
        return this.a.equals(mtqVar.a) && this.b.equals(mtqVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CollageSavedInfo(collageUiState=" + this.a + ", uiData=" + this.b + ")";
    }
}
