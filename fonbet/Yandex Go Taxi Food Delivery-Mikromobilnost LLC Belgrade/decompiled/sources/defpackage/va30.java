package defpackage;

/* loaded from: classes10.dex */
public final class va30 implements s820 {
    public final long a;
    public final long b;
    public final long c;
    public final long w;
    public final long x;

    public va30(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.w = j4;
        this.x = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && va30.class == obj.getClass()) {
            va30 va30Var = (va30) obj;
            if (this.a == va30Var.a && this.b == va30Var.b && this.c == va30Var.c && this.w == va30Var.w && this.x == va30Var.x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.x) + qv10.c(qv10.c(qv10.c(qv10.c(527, 31, this.a), 31, this.b), 31, this.c), 31, this.w);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.w + ", videoSize=" + this.x;
    }
}
