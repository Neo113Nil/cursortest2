package defpackage;

/* loaded from: classes6.dex */
public final class k1g implements Comparable {
    public final j1g a;
    public final long b;

    public k1g(j1g j1gVar, long j) {
        j1gVar.getClass();
        this.a = j1gVar;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k1g k1gVar = (k1g) obj;
        return gl5.b(Long.valueOf(this.b), k1gVar != null ? Long.valueOf(k1gVar.b) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1g)) {
            return false;
        }
        k1g k1gVar = (k1g) obj;
        return this.a == k1gVar.a && this.b == k1gVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LikeStateEvent(likeState=" + this.a + ", timestamp=" + this.b + ")";
    }
}
