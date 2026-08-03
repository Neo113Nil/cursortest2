package i7;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f3216a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3217b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3218c;

    public a(long j3, long j6, long j10) {
        this.f3216a = j3;
        this.f3217b = j6;
        this.f3218c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3216a == aVar.f3216a && this.f3217b == aVar.f3217b && this.f3218c == aVar.f3218c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f3216a;
        long j6 = this.f3217b;
        int i10 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f3218c;
        return i10 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f3216a + ", elapsedRealtime=" + this.f3217b + ", uptimeMillis=" + this.f3218c + "}";
    }
}
