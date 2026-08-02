package defpackage;

/* loaded from: classes3.dex */
public final class s1q implements g1q {
    public final nvl a;

    public s1q(nvl nvlVar) {
        this.a = nvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1q) && this.a.equals(((s1q) obj).a);
    }

    @Override // defpackage.g1q
    public final String getId() {
        return this.a.d();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedGlagolPlaylistId(playlistId=" + this.a + ")";
    }
}
