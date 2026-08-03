package nd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f5100a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5101b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5102c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5103d;

    public m(long j3, long j6, long j10, long j11) {
        this.f5100a = j3;
        this.f5101b = j6;
        this.f5102c = j10;
        this.f5103d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f5100a == mVar.f5100a && this.f5101b == mVar.f5101b && this.f5102c == mVar.f5102c && this.f5103d == mVar.f5103d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5103d) + a4.d.c(a4.d.c(Long.hashCode(this.f5100a) * 31, 31, this.f5101b), 31, this.f5102c);
    }

    public final String toString() {
        return "High_scores(id=" + this.f5100a + ", score=" + this.f5101b + ", chips_earned=" + this.f5102c + ", created_at=" + this.f5103d + ")";
    }
}
