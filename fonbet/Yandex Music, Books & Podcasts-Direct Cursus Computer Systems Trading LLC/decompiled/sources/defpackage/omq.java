package defpackage;

/* loaded from: classes.dex */
public final class omq {
    public final fk0 a;
    public long b;

    public omq(fk0 fk0Var, long j) {
        this.a = fk0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omq)) {
            return false;
        }
        omq omqVar = (omq) obj;
        return this.a.equals(omqVar.a) && hqe.a(this.b, omqVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) hqe.b(this.b)) + ')';
    }
}
