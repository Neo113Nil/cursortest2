package Q3;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f2648a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2649b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2650c;

    public a(long j6, long j9, long j10) {
        this.f2648a = j6;
        this.f2649b = j9;
        this.f2650c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2648a == aVar.f2648a && this.f2649b == aVar.f2649b && this.f2650c == aVar.f2650c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f2648a;
        long j9 = this.f2649b;
        int i = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f2650c;
        return i ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f2648a + ", elapsedRealtime=" + this.f2649b + ", uptimeMillis=" + this.f2650c + "}";
    }
}
