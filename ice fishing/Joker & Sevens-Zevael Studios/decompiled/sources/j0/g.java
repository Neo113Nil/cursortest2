package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f3331a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3332b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3333c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3334d;

    public g(long j3, long j6, long j10, long j11) {
        this.f3331a = j3;
        this.f3332b = j6;
        this.f3333c = j10;
        this.f3334d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return f1.q.c(this.f3331a, gVar.f3331a) && f1.q.c(this.f3332b, gVar.f3332b) && f1.q.c(this.f3333c, gVar.f3333c) && f1.q.c(this.f3334d, gVar.f3334d);
    }

    public final int hashCode() {
        int i10 = f1.q.f2284i;
        return Long.hashCode(this.f3334d) + a4.d.c(a4.d.c(Long.hashCode(this.f3331a) * 31, 31, this.f3332b), 31, this.f3333c);
    }
}
