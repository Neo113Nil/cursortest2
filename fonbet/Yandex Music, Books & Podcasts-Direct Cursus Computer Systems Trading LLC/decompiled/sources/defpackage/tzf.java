package defpackage;

/* loaded from: classes3.dex */
public final class tzf {
    public final boolean a;
    public final int b;

    public tzf(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzf)) {
            return false;
        }
        tzf tzfVar = (tzf) obj;
        return this.a == tzfVar.a && this.b == tzfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LikeButtonUiData(isLiked=" + this.a + ", likesCount=" + this.b + ")";
    }
}
