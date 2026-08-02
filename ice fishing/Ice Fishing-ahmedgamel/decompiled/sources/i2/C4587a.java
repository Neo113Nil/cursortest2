package i2;

import w.AbstractC5128c;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4587a {

    /* renamed from: f, reason: collision with root package name */
    public static final C4587a f38155f = new C4587a(200, 10000, 81920, 10485760, com.anythink.core.d.h.f18077f);

    /* renamed from: a, reason: collision with root package name */
    public final long f38156a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38157b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38158c;

    /* renamed from: d, reason: collision with root package name */
    public final long f38159d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38160e;

    public C4587a(int i, int i4, int i6, long j6, long j9) {
        this.f38156a = j6;
        this.f38157b = i;
        this.f38158c = i4;
        this.f38159d = j9;
        this.f38160e = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4587a) {
            C4587a c4587a = (C4587a) obj;
            if (this.f38156a == c4587a.f38156a && this.f38157b == c4587a.f38157b && this.f38158c == c4587a.f38158c && this.f38159d == c4587a.f38159d && this.f38160e == c4587a.f38160e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f38156a;
        int i = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f38157b) * 1000003) ^ this.f38158c) * 1000003;
        long j9 = this.f38159d;
        return ((i ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f38160e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f38156a);
        sb.append(", loadBatchSize=");
        sb.append(this.f38157b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f38158c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f38159d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC5128c.e(this.f38160e, "}", sb);
    }
}
