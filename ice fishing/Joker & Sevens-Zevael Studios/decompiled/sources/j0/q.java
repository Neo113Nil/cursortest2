package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f3432a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3433b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3434c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3435d;

    public q(long j3, long j6, long j10, long j11) {
        this.f3432a = j3;
        this.f3433b = j6;
        this.f3434c = j10;
        this.f3435d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return f1.q.c(this.f3432a, qVar.f3432a) && f1.q.c(this.f3433b, qVar.f3433b) && f1.q.c(this.f3434c, qVar.f3434c) && f1.q.c(this.f3435d, qVar.f3435d);
    }

    public final int hashCode() {
        int i10 = f1.q.f2284i;
        return Long.hashCode(this.f3435d) + a4.d.c(a4.d.c(Long.hashCode(this.f3432a) * 31, 31, this.f3433b), 31, this.f3434c);
    }
}
