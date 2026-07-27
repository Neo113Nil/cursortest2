package n7;

import l7.C4666a;
import p7.C4853a;

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4771b {

    /* renamed from: a, reason: collision with root package name */
    public final C4853a f39503a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39504b;

    /* renamed from: c, reason: collision with root package name */
    public final C4666a f39505c;

    public C4771b(C4853a c4853a, long j6, C4666a c4666a) {
        if (c4853a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f39503a = c4853a;
        this.f39504b = j6;
        if (c4666a == null) {
            throw new NullPointerException("Null exemplarFilter");
        }
        this.f39505c = c4666a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4771b)) {
            return false;
        }
        C4771b c4771b = (C4771b) obj;
        c4771b.getClass();
        Object obj2 = Y6.d.f3981a;
        return obj2.equals(obj2) && this.f39503a.equals(c4771b.f39503a) && this.f39504b == c4771b.f39504b && this.f39505c.equals(c4771b.f39505c);
    }

    public final int hashCode() {
        int hashCode = (((Y6.d.f3981a.hashCode() ^ 1000003) * 1000003) ^ this.f39503a.hashCode()) * 1000003;
        long j6 = this.f39504b;
        return ((hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f39505c.hashCode();
    }

    public final String toString() {
        return "MeterProviderSharedState{clock=" + Y6.d.f3981a + ", resource=" + this.f39503a + ", startEpochNanos=" + this.f39504b + ", exemplarFilter=" + this.f39505c + "}";
    }
}
