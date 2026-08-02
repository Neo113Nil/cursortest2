package n7;

import l7.C4678a;
import p7.C4853a;

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4787b {

    /* renamed from: a, reason: collision with root package name */
    public final C4853a f39670a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39671b;

    /* renamed from: c, reason: collision with root package name */
    public final C4678a f39672c;

    public C4787b(C4853a c4853a, long j6, C4678a c4678a) {
        if (c4853a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f39670a = c4853a;
        this.f39671b = j6;
        if (c4678a == null) {
            throw new NullPointerException("Null exemplarFilter");
        }
        this.f39672c = c4678a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4787b)) {
            return false;
        }
        C4787b c4787b = (C4787b) obj;
        c4787b.getClass();
        Object obj2 = Y6.d.f3925a;
        return obj2.equals(obj2) && this.f39670a.equals(c4787b.f39670a) && this.f39671b == c4787b.f39671b && this.f39672c.equals(c4787b.f39672c);
    }

    public final int hashCode() {
        int hashCode = (((Y6.d.f3925a.hashCode() ^ 1000003) * 1000003) ^ this.f39670a.hashCode()) * 1000003;
        long j6 = this.f39671b;
        return ((hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f39672c.hashCode();
    }

    public final String toString() {
        return "MeterProviderSharedState{clock=" + Y6.d.f3925a + ", resource=" + this.f39670a + ", startEpochNanos=" + this.f39671b + ", exemplarFilter=" + this.f39672c + "}";
    }
}
