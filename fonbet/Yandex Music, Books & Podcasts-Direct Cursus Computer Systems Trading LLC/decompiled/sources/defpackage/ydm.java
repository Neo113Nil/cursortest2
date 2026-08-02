package defpackage;

/* loaded from: classes3.dex */
public final class ydm extends zdm {
    public final v1g a;
    public final w3g b;
    public final cvl c;

    public ydm(v1g v1gVar, w3g w3gVar, cvl cvlVar) {
        this.a = v1gVar;
        this.b = w3gVar;
        this.c = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydm)) {
            return false;
        }
        ydm ydmVar = (ydm) obj;
        return this.a.equals(ydmVar.a) && this.b.equals(ydmVar.b) && this.c.equals(ydmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PodcastPlaylistListItem(uiData=" + this.a + ", likesUiData=" + this.b + ", playlist=" + this.c + ")";
    }
}
