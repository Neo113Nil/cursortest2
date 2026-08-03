package d6;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1685f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f1686a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1687b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1688c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1689d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1690e;

    public a(long j3, int i10, int i11, long j6, int i12) {
        this.f1686a = j3;
        this.f1687b = i10;
        this.f1688c = i11;
        this.f1689d = j6;
        this.f1690e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1686a == aVar.f1686a && this.f1687b == aVar.f1687b && this.f1688c == aVar.f1688c && this.f1689d == aVar.f1689d && this.f1690e == aVar.f1690e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f1686a;
        int i10 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f1687b) * 1000003) ^ this.f1688c) * 1000003;
        long j6 = this.f1689d;
        return ((i10 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f1690e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f1686a + ", loadBatchSize=" + this.f1687b + ", criticalSectionEnterTimeoutMs=" + this.f1688c + ", eventCleanUpAge=" + this.f1689d + ", maxBlobByteSizePerRow=" + this.f1690e + "}";
    }
}
