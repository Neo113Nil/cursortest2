package defpackage;

/* loaded from: classes3.dex */
public final class izu implements kzu {
    public final bd5 a;
    public final v80 b;
    public final ezu c;

    public izu(bd5 bd5Var, v80 v80Var, ezu ezuVar) {
        this.a = bd5Var;
        this.b = v80Var;
        this.c = ezuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izu)) {
            return false;
        }
        izu izuVar = (izu) obj;
        return this.a.equals(izuVar.a) && this.b.equals(izuVar.b) && this.c.equals(izuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlaylistByUidKind(id=" + this.a + ", analyticsValues=" + this.b + ", startParameters=" + this.c + ")";
    }
}
