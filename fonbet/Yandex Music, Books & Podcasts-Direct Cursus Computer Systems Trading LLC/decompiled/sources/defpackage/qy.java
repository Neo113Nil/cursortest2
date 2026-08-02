package defpackage;

/* loaded from: classes3.dex */
public final class qy implements uy {
    public final ey a;

    public qy(ey eyVar) {
        this.a = eyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy) && this.a.equals(((qy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SameGenreAlbums(state=" + this.a + ")";
    }
}
