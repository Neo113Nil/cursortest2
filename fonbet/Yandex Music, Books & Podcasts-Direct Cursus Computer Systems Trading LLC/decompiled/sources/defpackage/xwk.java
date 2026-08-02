package defpackage;

/* loaded from: classes4.dex */
public final class xwk implements Comparable {
    public final j1g a;
    public final long b;

    public xwk(j1g j1gVar, long j) {
        j1gVar.getClass();
        this.a = j1gVar;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xwk xwkVar = (xwk) obj;
        return gl5.b(Long.valueOf(this.b), xwkVar != null ? Long.valueOf(xwkVar.b) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwk)) {
            return false;
        }
        xwk xwkVar = (xwk) obj;
        return this.a == xwkVar.a && this.b == xwkVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LikeStateEvent(likeState=" + this.a + ", timestamp=" + this.b + ")";
    }
}
