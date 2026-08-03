package c6;

import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f1238a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1239b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f1240c;

    public c(long j3, long j6, Set set) {
        this.f1238a = j3;
        this.f1239b = j6;
        this.f1240c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f1238a == cVar.f1238a && this.f1239b == cVar.f1239b && this.f1240c.equals(cVar.f1240c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f1238a;
        int i10 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.f1239b;
        return ((i10 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f1240c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f1238a + ", maxAllowedDelay=" + this.f1239b + ", flags=" + this.f1240c + "}";
    }
}
