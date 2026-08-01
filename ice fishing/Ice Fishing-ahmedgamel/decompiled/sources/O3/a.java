package O3;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f2331a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2332b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2333c;

    public a(long j6, long j9, long j10) {
        this.f2331a = j6;
        this.f2332b = j9;
        this.f2333c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2331a == aVar.f2331a && this.f2332b == aVar.f2332b && this.f2333c == aVar.f2333c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f2331a;
        long j9 = this.f2332b;
        int i = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f2333c;
        return i ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f2331a + ", elapsedRealtime=" + this.f2332b + ", uptimeMillis=" + this.f2333c + "}";
    }
}
