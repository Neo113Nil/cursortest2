package K3;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f1611a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1612b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1613c;

    public a(long j9, long j10, long j11) {
        this.f1611a = j9;
        this.f1612b = j10;
        this.f1613c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1611a == aVar.f1611a && this.f1612b == aVar.f1612b && this.f1613c == aVar.f1613c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f1611a;
        long j10 = this.f1612b;
        int i = (((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f1613c;
        return i ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f1611a + ", elapsedRealtime=" + this.f1612b + ", uptimeMillis=" + this.f1613c + "}";
    }
}
