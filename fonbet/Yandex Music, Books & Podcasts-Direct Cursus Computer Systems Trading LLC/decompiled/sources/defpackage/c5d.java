package defpackage;

/* loaded from: classes3.dex */
public final class c5d {
    public final w3d a;
    public final v80 b;

    public c5d(w3d w3dVar, v80 v80Var) {
        this.a = w3dVar;
        this.b = v80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5d)) {
            return false;
        }
        c5d c5dVar = (c5d) obj;
        return this.a.equals(c5dVar.a) && this.b.equals(c5dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "GenerativeStartRequest(contentId=" + this.a + ", analyticsValues=" + this.b + ")";
    }
}
