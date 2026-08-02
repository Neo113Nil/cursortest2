package defpackage;

/* loaded from: classes3.dex */
public final class hzu implements kzu {
    public final yc5 a;
    public final v80 b;
    public final ezu c;

    public hzu(yc5 yc5Var, v80 v80Var, ezu ezuVar) {
        this.a = yc5Var;
        this.b = v80Var;
        this.c = ezuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzu)) {
            return false;
        }
        hzu hzuVar = (hzu) obj;
        return this.a.equals(hzuVar.a) && this.b.equals(hzuVar.b) && this.c.equals(hzuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ArtistById(id=" + this.a + ", analyticsValues=" + this.b + ", startParameters=" + this.c + ")";
    }
}
