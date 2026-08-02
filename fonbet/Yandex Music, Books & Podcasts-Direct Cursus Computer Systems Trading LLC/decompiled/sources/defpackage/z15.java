package defpackage;

/* loaded from: classes6.dex */
public final class z15 implements g25 {
    public final cvl a;

    public z15(cvl cvlVar) {
        this.a = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z15) && this.a.equals(((z15) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FavoritePlaylist(header=" + this.a + ")";
    }
}
