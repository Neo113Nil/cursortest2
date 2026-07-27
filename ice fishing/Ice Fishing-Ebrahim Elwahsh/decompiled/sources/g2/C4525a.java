package g2;

import t0.AbstractC5051n;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4525a {

    /* renamed from: f, reason: collision with root package name */
    public static final C4525a f37859f = new C4525a(200, 10000, 81920, 10485760, com.anythink.core.d.h.f17448f);

    /* renamed from: a, reason: collision with root package name */
    public final long f37860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37861b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37862c;

    /* renamed from: d, reason: collision with root package name */
    public final long f37863d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37864e;

    public C4525a(int i, int i4, int i9, long j9, long j10) {
        this.f37860a = j9;
        this.f37861b = i;
        this.f37862c = i4;
        this.f37863d = j10;
        this.f37864e = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4525a) {
            C4525a c4525a = (C4525a) obj;
            if (this.f37860a == c4525a.f37860a && this.f37861b == c4525a.f37861b && this.f37862c == c4525a.f37862c && this.f37863d == c4525a.f37863d && this.f37864e == c4525a.f37864e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f37860a;
        int i = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f37861b) * 1000003) ^ this.f37862c) * 1000003;
        long j10 = this.f37863d;
        return ((i ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f37864e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f37860a);
        sb.append(", loadBatchSize=");
        sb.append(this.f37861b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f37862c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f37863d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC5051n.e(this.f37864e, "}", sb);
    }
}
