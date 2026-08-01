package g2;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4524a {

    /* renamed from: f, reason: collision with root package name */
    public static final C4524a f37628f = new C4524a(200, 10000, 81920, 10485760, com.anythink.core.d.h.f17290f);

    /* renamed from: a, reason: collision with root package name */
    public final long f37629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37631c;

    /* renamed from: d, reason: collision with root package name */
    public final long f37632d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37633e;

    public C4524a(int i, int i6, int i9, long j6, long j9) {
        this.f37629a = j6;
        this.f37630b = i;
        this.f37631c = i6;
        this.f37632d = j9;
        this.f37633e = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4524a) {
            C4524a c4524a = (C4524a) obj;
            if (this.f37629a == c4524a.f37629a && this.f37630b == c4524a.f37630b && this.f37631c == c4524a.f37631c && this.f37632d == c4524a.f37632d && this.f37633e == c4524a.f37633e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f37629a;
        int i = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f37630b) * 1000003) ^ this.f37631c) * 1000003;
        long j9 = this.f37632d;
        return ((i ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f37633e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f37629a);
        sb.append(", loadBatchSize=");
        sb.append(this.f37630b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f37631c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f37632d);
        sb.append(", maxBlobByteSizePerRow=");
        return u1.h.e(this.f37633e, "}", sb);
    }
}
