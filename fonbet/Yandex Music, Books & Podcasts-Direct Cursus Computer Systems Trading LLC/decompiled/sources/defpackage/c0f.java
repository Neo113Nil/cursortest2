package defpackage;

/* loaded from: classes4.dex */
public final class c0f implements f0f {
    public final mqs a;
    public final po6 b;

    public c0f(po6 po6Var, mqs mqsVar) {
        this.a = mqsVar;
        this.b = po6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0f)) {
            return false;
        }
        c0f c0fVar = (c0f) obj;
        return this.a.equals(c0fVar.a) && this.b.equals(c0fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackItem(track=" + this.a + ", uiTrack=" + this.b + ")";
    }
}
