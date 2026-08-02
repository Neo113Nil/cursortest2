package defpackage;

/* loaded from: classes3.dex */
public final class csi implements bsi {
    public final rrl a;
    public final mqs b;

    public csi(rrl rrlVar, mqs mqsVar) {
        this.a = rrlVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csi)) {
            return false;
        }
        csi csiVar = (csi) obj;
        return this.a.equals(csiVar.a) && this.b.equals(csiVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MyShelfBlockPlayedPlaylist(playlist=" + this.a + ", track=" + this.b + ")";
    }
}
