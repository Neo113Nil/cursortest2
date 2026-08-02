package h2;

import java.util.Set;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4573b {

    /* renamed from: a, reason: collision with root package name */
    public final long f38083a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38084b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f38085c;

    public C4573b(long j6, long j9, Set set) {
        this.f38083a = j6;
        this.f38084b = j9;
        this.f38085c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4573b) {
            C4573b c4573b = (C4573b) obj;
            if (this.f38083a == c4573b.f38083a && this.f38084b == c4573b.f38084b && this.f38085c.equals(c4573b.f38085c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f38083a;
        int i = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.f38084b;
        return ((i ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f38085c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f38083a + ", maxAllowedDelay=" + this.f38084b + ", flags=" + this.f38085c + "}";
    }
}
