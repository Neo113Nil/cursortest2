package defpackage;

/* loaded from: classes.dex */
public final class qd2 {
    public final long a;
    public final de2 b;
    public final cd2 c;

    public qd2(long j, de2 de2Var, cd2 cd2Var) {
        this.a = j;
        this.b = de2Var;
        this.c = cd2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qd2)) {
            return false;
        }
        qd2 qd2Var = (qd2) obj;
        return this.a == qd2Var.a && this.b.equals(qd2Var.b) && this.c.equals(qd2Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
