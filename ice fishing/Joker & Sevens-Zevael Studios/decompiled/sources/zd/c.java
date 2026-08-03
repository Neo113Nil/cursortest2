package zd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f9186a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9187b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9188c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9189d;

    public c(int i10, int i11, long j3, long j6) {
        this.f9186a = j3;
        this.f9187b = i10;
        this.f9188c = i11;
        this.f9189d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9186a == cVar.f9186a && this.f9187b == cVar.f9187b && this.f9188c == cVar.f9188c && this.f9189d == cVar.f9189d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9189d) + v.f.b(this.f9188c, v.f.b(this.f9187b, Long.hashCode(this.f9186a) * 31, 31), 31);
    }

    public final String toString() {
        return "HighScoreItem(id=" + this.f9186a + ", score=" + this.f9187b + ", chipsEarned=" + this.f9188c + ", createdAt=" + this.f9189d + ")";
    }
}
