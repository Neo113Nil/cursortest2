package defpackage;

/* loaded from: classes4.dex */
public final class zze implements f0f {
    public final lt a;
    public final kbj b;

    public zze(lt ltVar, kbj kbjVar) {
        this.a = ltVar;
        this.b = kbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        return this.a.equals(zzeVar.a) && this.b.equals(zzeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NonMusicAlbum(album=" + this.a + ", uiAlbum=" + this.b + ")";
    }
}
