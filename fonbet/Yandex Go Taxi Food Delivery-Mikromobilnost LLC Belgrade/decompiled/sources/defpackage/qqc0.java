package defpackage;

/* loaded from: classes8.dex */
public final class qqc0 {
    public final nqc0 a;
    public final pqc0 b;
    public final mqc0 c;
    public final oqc0 d;

    public qqc0(nqc0 nqc0Var, pqc0 pqc0Var, mqc0 mqc0Var, oqc0 oqc0Var) {
        this.a = nqc0Var;
        this.b = pqc0Var;
        this.c = mqc0Var;
        this.d = oqc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqc0)) {
            return false;
        }
        qqc0 qqc0Var = (qqc0) obj;
        return this.a.equals(qqc0Var.a) && this.b.equals(qqc0Var.b) && this.c.equals(qqc0Var.c) && this.d.equals(qqc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlaqueShapeSettings(leftTopCorner=" + this.a + ", rightTopCorner=" + this.b + ", leftBottomCorner=" + this.c + ", rightBottomCorner=" + this.d + ')';
    }
}
