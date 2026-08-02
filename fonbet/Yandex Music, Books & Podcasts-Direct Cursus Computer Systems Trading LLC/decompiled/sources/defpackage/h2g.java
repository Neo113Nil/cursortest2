package defpackage;

/* loaded from: classes4.dex */
public final class h2g implements uvn {
    public final nrf a;
    public final onq b;

    public h2g(nrf nrfVar, onq onqVar) {
        this.a = nrfVar;
        this.b = onqVar;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2g)) {
            return false;
        }
        h2g h2gVar = (h2g) obj;
        return this.a.equals(h2gVar.a) && this.b.equals(h2gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LikesAndHistoryBlock(meta=" + this.a + ", source=" + this.b + ")";
    }
}
