package defpackage;

/* loaded from: classes6.dex */
public final class q4u implements Comparable {
    public final p4u a;
    public final long b;

    public q4u(p4u p4uVar, long j) {
        this.a = p4uVar;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q4u q4uVar = (q4u) obj;
        return gl5.b(Long.valueOf(this.b), q4uVar != null ? Long.valueOf(q4uVar.b) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4u)) {
            return false;
        }
        q4u q4uVar = (q4u) obj;
        return this.a.equals(q4uVar.a) && this.b == q4uVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoClipLikeStateEvent(likeData=" + this.a + ", timestamp=" + this.b + ")";
    }
}
