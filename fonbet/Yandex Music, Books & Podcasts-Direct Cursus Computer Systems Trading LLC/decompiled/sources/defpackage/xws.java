package defpackage;

/* loaded from: classes4.dex */
public final class xws {
    public final rr5 a;
    public final j1g b;

    public xws(rr5 rr5Var, j1g j1gVar) {
        this.a = rr5Var;
        this.b = j1gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xws)) {
            return false;
        }
        xws xwsVar = (xws) obj;
        return this.a.equals(xwsVar.a) && this.b == xwsVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackLikeState(trackId=" + this.a + ", newLikeState=" + this.b + ")";
    }
}
