package defpackage;

/* loaded from: classes4.dex */
public final class h5l {
    public final g5l a;
    public final f5l b;
    public final f5l c;

    public h5l(g5l g5lVar, f5l f5lVar, f5l f5lVar2) {
        this.a = g5lVar;
        this.b = f5lVar;
        this.c = f5lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5l)) {
            return false;
        }
        h5l h5lVar = (h5l) obj;
        return this.a == h5lVar.a && this.b == h5lVar.b && this.c == h5lVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlaybackSkippingControlsUiData(skippingType=" + this.a + ", previousState=" + this.b + ", nextState=" + this.c + ")";
    }
}
