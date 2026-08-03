package qd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f5859a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5860b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5861c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5862d;

    public i(int i10, int i11, long j3, long j6) {
        this.f5859a = j3;
        this.f5860b = i10;
        this.f5861c = i11;
        this.f5862d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f5859a == iVar.f5859a && this.f5860b == iVar.f5860b && this.f5861c == iVar.f5861c && this.f5862d == iVar.f5862d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5862d) + v.f.b(this.f5861c, v.f.b(this.f5860b, Long.hashCode(this.f5859a) * 31, 31), 31);
    }

    public final String toString() {
        return "HighScore(id=" + this.f5859a + ", score=" + this.f5860b + ", chipsEarned=" + this.f5861c + ", createdAt=" + this.f5862d + ")";
    }
}
