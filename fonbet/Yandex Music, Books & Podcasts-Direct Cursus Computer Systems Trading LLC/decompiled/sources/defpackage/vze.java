package defpackage;

/* loaded from: classes4.dex */
public final class vze implements f0f {
    public final lt a;
    public final ru b;

    public vze(lt ltVar, ru ruVar) {
        this.a = ltVar;
        this.b = ruVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vze)) {
            return false;
        }
        vze vzeVar = (vze) obj;
        return this.a.equals(vzeVar.a) && this.b.equals(vzeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Album(album=" + this.a + ", uiAlbum=" + this.b + ")";
    }
}
