package defpackage;

/* loaded from: classes3.dex */
public final class z3d {
    public final e4d a;
    public final long b;

    public z3d(e4d e4dVar, long j) {
        e4dVar.getClass();
        this.a = e4dVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3d)) {
            return false;
        }
        z3d z3dVar = (z3d) obj;
        return this.a == z3dVar.a && this.b == z3dVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GenerativeFeedback(type=" + this.a + ", timestamp=" + this.b + ")";
    }
}
