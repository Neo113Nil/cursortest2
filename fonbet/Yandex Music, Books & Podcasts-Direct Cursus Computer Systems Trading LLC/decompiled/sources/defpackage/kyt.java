package defpackage;

/* loaded from: classes3.dex */
public final class kyt implements pyt {
    public final zc5 a;

    public kyt(zc5 zc5Var) {
        this.a = zc5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyt) && this.a.equals(((kyt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CollectionPlaylist(playlistId=" + this.a + ")";
    }
}
