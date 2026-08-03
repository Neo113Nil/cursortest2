package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f3285a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3286b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3287c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3288d;

    public a(long j3, long j6, long j10, long j11) {
        this.f3285a = j3;
        this.f3286b = j6;
        this.f3287c = j10;
        this.f3288d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f1.q.c(this.f3285a, aVar.f3285a) && f1.q.c(this.f3286b, aVar.f3286b) && f1.q.c(this.f3287c, aVar.f3287c) && f1.q.c(this.f3288d, aVar.f3288d);
    }

    public final int hashCode() {
        int i10 = f1.q.f2284i;
        return Long.hashCode(this.f3288d) + a4.d.c(a4.d.c(Long.hashCode(this.f3285a) * 31, 31, this.f3286b), 31, this.f3287c);
    }
}
