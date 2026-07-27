package f2;

import java.util.Set;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4508b {

    /* renamed from: a, reason: collision with root package name */
    public final long f37459a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37460b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f37461c;

    public C4508b(long j6, long j9, Set set) {
        this.f37459a = j6;
        this.f37460b = j9;
        this.f37461c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4508b) {
            C4508b c4508b = (C4508b) obj;
            if (this.f37459a == c4508b.f37459a && this.f37460b == c4508b.f37460b && this.f37461c.equals(c4508b.f37461c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f37459a;
        int i = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.f37460b;
        return ((i ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f37461c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f37459a + ", maxAllowedDelay=" + this.f37460b + ", flags=" + this.f37461c + "}";
    }
}
