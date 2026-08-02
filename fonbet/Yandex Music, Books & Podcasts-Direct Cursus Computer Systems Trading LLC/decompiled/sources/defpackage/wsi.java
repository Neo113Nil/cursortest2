package defpackage;

/* loaded from: classes3.dex */
public final class wsi implements xsi {
    public final rrl a;
    public final mqs b;

    public wsi(rrl rrlVar, mqs mqsVar) {
        this.a = rrlVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsi)) {
            return false;
        }
        wsi wsiVar = (wsi) obj;
        return this.a.equals(wsiVar.a) && this.b.equals(wsiVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Playlist(playlist=" + this.a + ", track=" + this.b + ")";
    }
}
