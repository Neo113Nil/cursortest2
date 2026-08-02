package defpackage;

/* loaded from: classes.dex */
public final class fcs {
    public static final fcs c = new fcs(v7g.z(0), v7g.z(0));
    public final long a;
    public final long b;

    public fcs(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcs)) {
            return false;
        }
        fcs fcsVar = (fcs) obj;
        return kes.a(this.a, fcsVar.a) && kes.a(this.b, fcsVar.b);
    }

    public final int hashCode() {
        les[] lesVarArr = kes.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) kes.d(this.a)) + ", restLine=" + ((Object) kes.d(this.b)) + ')';
    }
}
