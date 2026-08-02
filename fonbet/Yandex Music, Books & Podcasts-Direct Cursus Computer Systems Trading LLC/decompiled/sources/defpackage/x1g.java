package defpackage;

/* loaded from: classes3.dex */
public final class x1g {
    public final v1g a;
    public final boolean b;

    public x1g(v1g v1gVar, boolean z) {
        this.a = v1gVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1g)) {
            return false;
        }
        x1g x1gVar = (x1g) obj;
        return this.a.equals(x1gVar.a) && this.b == x1gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LikedNonMusicGridItemUiData(likedEntityItemUiData=" + this.a + ", hasPlusBadge=" + this.b + ")";
    }
}
