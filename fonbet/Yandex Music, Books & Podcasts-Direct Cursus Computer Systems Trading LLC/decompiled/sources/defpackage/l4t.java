package defpackage;

/* loaded from: classes3.dex */
public final class l4t {
    public final k4t a;
    public final k4t b;
    public final k4t c;
    public final k4t d;
    public final k4t e;
    public final k4t f;

    public l4t(k4t k4tVar, k4t k4tVar2, k4t k4tVar3, k4t k4tVar4, k4t k4tVar5, k4t k4tVar6) {
        this.a = k4tVar;
        this.b = k4tVar2;
        this.c = k4tVar3;
        this.d = k4tVar4;
        this.e = k4tVar5;
        this.f = k4tVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4t)) {
            return false;
        }
        l4t l4tVar = (l4t) obj;
        return this.a.equals(l4tVar.a) && this.b.equals(l4tVar.b) && this.c.equals(l4tVar.c) && this.d.equals(l4tVar.d) && this.e.equals(l4tVar.e) && this.f.equals(l4tVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TracksSummaryState(musicList=" + this.a + ", playlistList=" + this.b + ", albumList=" + this.c + ", bookList=" + this.d + ", podcastList=" + this.e + ", kidsList=" + this.f + ")";
    }
}
