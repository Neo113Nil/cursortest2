package defpackage;

/* loaded from: classes3.dex */
public final class j80 {
    public final v70 a;
    public final l80 b;
    public final k80 c;

    public j80(v70 v70Var, l80 l80Var, k80 k80Var) {
        this.a = v70Var;
        this.b = l80Var;
        this.c = k80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80Var = (j80) obj;
        return this.a.equals(j80Var.a) && this.b.equals(j80Var.b) && this.c == j80Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AnalyticsNavigatedEvent(entityData=" + this.a + ", objectData=" + this.b + ", to=" + this.c + ")";
    }
}
