package defpackage;

/* loaded from: classes5.dex */
public final class m1g {
    public final j1g a;
    public final int b;

    public m1g(j1g j1gVar, int i) {
        j1gVar.getClass();
        this.a = j1gVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1g)) {
            return false;
        }
        m1g m1gVar = (m1g) obj;
        return this.a == m1gVar.a && this.b == m1gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LikeStateWithCount(likeState=" + this.a + ", likesCount=" + this.b + ")";
    }
}
