package defpackage;

/* loaded from: classes3.dex */
public final class twl {
    public final long a;
    public final rw4 b;

    public twl(long j, rw4 rw4Var) {
        this.a = j;
        this.b = rw4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twl)) {
            return false;
        }
        twl twlVar = (twl) obj;
        return this.a == twlVar.a && this.b.equals(twlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlaylistNativeId(playlistNativeId=" + this.a + ", playlistId=" + this.b + ")";
    }
}
