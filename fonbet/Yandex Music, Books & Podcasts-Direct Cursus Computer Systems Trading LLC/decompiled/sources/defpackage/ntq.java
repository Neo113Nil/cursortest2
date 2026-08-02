package defpackage;

/* loaded from: classes4.dex */
public final class ntq implements otq {
    public final boolean a;

    public ntq(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ntq) && this.a == ((ntq) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("LikeButtonSavedInfo(isLiked=", ")", this.a);
    }
}
