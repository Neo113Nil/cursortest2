package defpackage;

/* loaded from: classes3.dex */
public final class f80 {
    public final v70 a;
    public final int b;

    public f80(v70 v70Var, int i) {
        this.a = v70Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f80)) {
            return false;
        }
        f80 f80Var = (f80) obj;
        return this.a.equals(f80Var.a) && this.b == f80Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsLoadedEvent(entityData=" + this.a + ", loadedObjectsCount=" + this.b + ")";
    }
}
