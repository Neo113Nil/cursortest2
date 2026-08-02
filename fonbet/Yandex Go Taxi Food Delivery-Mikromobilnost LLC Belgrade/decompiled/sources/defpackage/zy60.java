package defpackage;

/* loaded from: classes5.dex */
public final class zy60 {
    public final fz60 a;
    public final long b;

    public zy60(fz60 fz60Var, long j) {
        this.a = fz60Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy60)) {
            return false;
        }
        zy60 zy60Var = (zy60) obj;
        return this.a.equals(zy60Var.a) && e3n.d(this.b, zy60Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o430 o430Var = e3n.b;
        return Boolean.hashCode(false) + qv10.c(hashCode, 31, this.b);
    }

    public final String toString() {
        return "Jump(reachability=" + this.a + ", discardTimeout=" + e3n.p(this.b) + ", allowJumpedLocationAfterTimeout=false)";
    }
}
