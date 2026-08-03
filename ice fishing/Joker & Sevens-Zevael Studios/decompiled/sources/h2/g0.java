package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f2670b = z.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2671c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f2672a;

    public /* synthetic */ g0(long j3) {
        this.f2672a = j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            return this.f2672a == ((g0) obj).f2672a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2672a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextRange(");
        long j3 = this.f2672a;
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return a4.d.l(sb, (int) (j3 & 4294967295L), ')');
    }
}
