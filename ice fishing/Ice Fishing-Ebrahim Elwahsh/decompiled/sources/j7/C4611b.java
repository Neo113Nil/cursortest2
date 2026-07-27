package j7;

import h7.C4570a;
import l7.C4707a;

/* renamed from: j7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4611b {

    /* renamed from: a, reason: collision with root package name */
    public final C4707a f38580a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38581b;

    /* renamed from: c, reason: collision with root package name */
    public final C4570a f38582c;

    public C4611b(C4707a c4707a, long j9, C4570a c4570a) {
        if (c4707a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f38580a = c4707a;
        this.f38581b = j9;
        if (c4570a == null) {
            throw new NullPointerException("Null exemplarFilter");
        }
        this.f38582c = c4570a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4611b)) {
            return false;
        }
        C4611b c4611b = (C4611b) obj;
        c4611b.getClass();
        Object obj2 = U6.d.f3316a;
        return obj2.equals(obj2) && this.f38580a.equals(c4611b.f38580a) && this.f38581b == c4611b.f38581b && this.f38582c.equals(c4611b.f38582c);
    }

    public final int hashCode() {
        int hashCode = (((U6.d.f3316a.hashCode() ^ 1000003) * 1000003) ^ this.f38580a.hashCode()) * 1000003;
        long j9 = this.f38581b;
        return ((hashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f38582c.hashCode();
    }

    public final String toString() {
        return "MeterProviderSharedState{clock=" + U6.d.f3316a + ", resource=" + this.f38580a + ", startEpochNanos=" + this.f38581b + ", exemplarFilter=" + this.f38582c + "}";
    }
}
