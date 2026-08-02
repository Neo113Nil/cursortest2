package defpackage;

/* loaded from: classes.dex */
public final class s74 extends u0b0 {
    public final long a;
    public final v111 b;
    public final rfo c;

    public s74(long j, v111 v111Var, rfo rfoVar) {
        this.a = j;
        if (v111Var == null) {
            ny61.t("Null transportContext");
            throw null;
        }
        this.b = v111Var;
        if (rfoVar != null) {
            this.c = rfoVar;
        } else {
            ny61.t("Null event");
            throw null;
        }
    }

    @Override // defpackage.u0b0
    public final rfo a() {
        return this.c;
    }

    @Override // defpackage.u0b0
    public final long b() {
        return this.a;
    }

    @Override // defpackage.u0b0
    public final v111 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0b0)) {
            return false;
        }
        u0b0 u0b0Var = (u0b0) obj;
        return this.a == u0b0Var.b() && this.b.equals(u0b0Var.c()) && this.c.equals(u0b0Var.a());
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
