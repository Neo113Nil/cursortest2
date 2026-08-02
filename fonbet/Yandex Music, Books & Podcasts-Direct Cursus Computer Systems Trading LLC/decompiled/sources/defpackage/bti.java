package defpackage;

/* loaded from: classes3.dex */
public final class bti implements eti {
    public final raj a;
    public final rrl b;
    public final mqs c;

    public bti(raj rajVar, rrl rrlVar, mqs mqsVar) {
        this.a = rajVar;
        this.b = rrlVar;
        this.c = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bti)) {
            return false;
        }
        bti btiVar = (bti) obj;
        return this.a.equals(btiVar.a) && this.b.equals(btiVar.b) && this.c.equals(btiVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Playlist(uiData=" + this.a + ", playlist=" + this.b + ", track=" + this.c + ")";
    }
}
