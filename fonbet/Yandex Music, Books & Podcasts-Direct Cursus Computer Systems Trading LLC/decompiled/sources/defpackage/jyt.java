package defpackage;

/* loaded from: classes3.dex */
public final class jyt implements pyt {
    public final yc5 a;

    public jyt(yc5 yc5Var) {
        this.a = yc5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyt) && this.a.equals(((jyt) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "CollectionArtist(artistId=" + this.a + ")";
    }
}
