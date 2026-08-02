package defpackage;

/* loaded from: classes3.dex */
public final class gzu implements kzu {
    public final xc5 a;
    public final v80 b;
    public final ezu c;

    public gzu(xc5 xc5Var, v80 v80Var, ezu ezuVar) {
        this.a = xc5Var;
        this.b = v80Var;
        this.c = ezuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzu)) {
            return false;
        }
        gzu gzuVar = (gzu) obj;
        return this.a.equals(gzuVar.a) && this.b.equals(gzuVar.b) && this.c.equals(gzuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AlbumById(id=" + this.a + ", analyticsValues=" + this.b + ", startParameters=" + this.c + ")";
    }
}
