package defpackage;

/* loaded from: classes4.dex */
public final class cvn extends a4g {
    public final nvl a;

    public cvn(nvl nvlVar) {
        this.a = nvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvn) && this.a.equals(((cvn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Playlist(playlistId=" + this.a + ")";
    }
}
