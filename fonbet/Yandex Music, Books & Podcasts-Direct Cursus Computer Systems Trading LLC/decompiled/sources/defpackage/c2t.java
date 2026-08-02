package defpackage;

/* loaded from: classes3.dex */
public final class c2t {
    public final mqs a;
    public final po6 b;

    public c2t(po6 po6Var, mqs mqsVar) {
        this.a = mqsVar;
        this.b = po6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2t)) {
            return false;
        }
        c2t c2tVar = (c2t) obj;
        return this.a.equals(c2tVar.a) && this.b.equals(c2tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackUiData(track=" + this.a + ", trackUiData=" + this.b + ")";
    }
}
