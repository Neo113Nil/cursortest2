package defpackage;

/* loaded from: classes4.dex */
public final class wze implements f0f {
    public final u51 a;
    public final jd1 b;

    public wze(u51 u51Var, jd1 jd1Var) {
        this.a = u51Var;
        this.b = jd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wze)) {
            return false;
        }
        wze wzeVar = (wze) obj;
        return this.a.equals(wzeVar.a) && this.b.equals(wzeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Artist(artist=" + this.a + ", uiArtist=" + this.b + ")";
    }
}
