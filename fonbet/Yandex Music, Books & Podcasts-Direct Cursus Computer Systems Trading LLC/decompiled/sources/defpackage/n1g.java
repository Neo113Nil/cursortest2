package defpackage;

/* loaded from: classes3.dex */
public final class n1g {
    public static final n1g d = new n1g(j1g.b, false, false);
    public final j1g a;
    public final boolean b;
    public final boolean c;

    public n1g(j1g j1gVar, boolean z, boolean z2) {
        j1gVar.getClass();
        this.a = j1gVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1g)) {
            return false;
        }
        n1g n1gVar = (n1g) obj;
        return this.a == n1gVar.a && this.b == n1gVar.b && this.c == n1gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikeUiState(likeState=");
        sb.append(this.a);
        sb.append(", likeAvailable=");
        sb.append(this.b);
        sb.append(", dislikeAvailable=");
        return ouj.r(sb, this.c, ")");
    }
}
