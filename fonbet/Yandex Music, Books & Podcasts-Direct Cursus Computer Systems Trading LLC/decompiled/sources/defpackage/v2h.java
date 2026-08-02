package defpackage;

/* loaded from: classes3.dex */
public final class v2h {
    public final boolean a;
    public final boolean b;

    public v2h(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2h)) {
            return false;
        }
        v2h v2hVar = (v2h) obj;
        return this.a == v2hVar.a && this.b == v2hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("LyricsInfo(lyricsFullScreen=", this.a, ", lyricsAreStatic=", this.b, ")");
    }
}
