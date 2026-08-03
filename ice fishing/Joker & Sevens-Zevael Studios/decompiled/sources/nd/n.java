package nd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f5104a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5105b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5106c;

    public n(long j3, long j6, long j10) {
        this.f5104a = j3;
        this.f5105b = j6;
        this.f5106c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f5104a == nVar.f5104a && this.f5105b == nVar.f5105b && this.f5106c == nVar.f5106c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5106c) + a4.d.c(Long.hashCode(this.f5104a) * 31, 31, this.f5105b);
    }

    public final String toString() {
        return "Player_data(id=" + this.f5104a + ", chips=" + this.f5105b + ", total_jokers_collected=" + this.f5106c + ")";
    }
}
