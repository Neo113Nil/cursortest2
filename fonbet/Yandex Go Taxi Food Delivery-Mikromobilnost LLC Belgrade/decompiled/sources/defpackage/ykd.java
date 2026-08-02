package defpackage;

/* loaded from: classes2.dex */
public final class ykd {
    public final nld a;
    public final long b;
    public final ald c;

    public ykd(nld nldVar, long j, ald aldVar) {
        this.a = nldVar;
        this.b = j;
        this.c = aldVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykd)) {
            return false;
        }
        ykd ykdVar = (ykd) obj;
        return this.a.equals(ykdVar.a) && this.b == ykdVar.b && jl40.l(this.c, ykdVar.c);
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        ald aldVar = this.c;
        return c + (aldVar == null ? 0 : aldVar.hashCode());
    }

    public final String toString() {
        return "Invoice(totalPrice=" + this.a + ", timestamp=" + this.b + ", maxPoints=" + this.c + ')';
    }
}
