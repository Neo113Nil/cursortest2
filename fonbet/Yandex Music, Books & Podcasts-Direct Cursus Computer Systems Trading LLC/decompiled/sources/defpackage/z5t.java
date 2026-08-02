package defpackage;

/* loaded from: classes3.dex */
public final class z5t implements b6t {
    public final l5t a;
    public final boolean b;

    public z5t(l5t l5tVar, boolean z) {
        this.a = l5tVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5t)) {
            return false;
        }
        z5t z5tVar = (z5t) obj;
        return this.a == z5tVar.a && this.b == z5tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + k5r.e(this.a.hashCode() * 31, 31, true);
    }

    public final String toString() {
        return "Loading(entityType=" + this.a + ", isLoading=true, showNavigationButton=" + this.b + ")";
    }
}
