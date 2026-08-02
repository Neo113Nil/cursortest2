package defpackage;

/* loaded from: classes4.dex */
public final class w63 implements x63 {
    public final eul a;
    public final mqs b;

    public w63(eul eulVar, mqs mqsVar) {
        this.a = eulVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w63)) {
            return false;
        }
        w63 w63Var = (w63) obj;
        return this.a.equals(w63Var.a) && this.b.equals(w63Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Playlist(playlist=" + this.a + ", track=" + this.b + ")";
    }
}
