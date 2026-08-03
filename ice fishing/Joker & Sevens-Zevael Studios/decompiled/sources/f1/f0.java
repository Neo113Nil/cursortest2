package f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f2248d = new f0(d0.c(4278190080L), 0, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final long f2249a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2250b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2251c;

    public f0(long j3, long j6, float f10) {
        this.f2249a = j3;
        this.f2250b = j6;
        this.f2251c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return q.c(this.f2249a, f0Var.f2249a) && e1.b.b(this.f2250b, f0Var.f2250b) && this.f2251c == f0Var.f2251c;
    }

    public final int hashCode() {
        int i10 = q.f2284i;
        return Float.hashCode(this.f2251c) + a4.d.c(Long.hashCode(this.f2249a) * 31, 31, this.f2250b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        a4.d.q(this.f2249a, sb, ", offset=");
        sb.append((Object) e1.b.i(this.f2250b));
        sb.append(", blurRadius=");
        return a4.d.k(sb, this.f2251c, ')');
    }
}
