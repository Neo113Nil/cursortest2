package defpackage;

/* loaded from: classes4.dex */
public final class p1b {
    public final klu a;
    public final dou b;

    public p1b(klu kluVar, dou douVar) {
        this.a = kluVar;
        this.b = douVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1b)) {
            return false;
        }
        p1b p1bVar = (p1b) obj;
        return this.a.equals(p1bVar.a) && this.b.equals(p1bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EditorialWaveAgentItemUiData(uiData=" + this.a + ", wave=" + this.b + ")";
    }
}
