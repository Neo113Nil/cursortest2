package defpackage;

/* loaded from: classes4.dex */
public final class a24 implements c24 {
    public final rab a;
    public final eul b;

    public a24(rab rabVar, eul eulVar) {
        this.a = rabVar;
        this.b = eulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a24)) {
            return false;
        }
        a24 a24Var = (a24) obj;
        return this.a.equals(a24Var.a) && this.b.equals(a24Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Playlist(uiData=" + this.a + ", playlist=" + this.b + ")";
    }
}
