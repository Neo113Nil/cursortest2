package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class spq {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    public spq(boolean z, boolean z2, boolean z3, int i, Integer num, Integer num2, Integer num3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = num;
        this.f = num2;
        this.g = num3;
    }

    public static spq a(spq spqVar, boolean z, Integer num, int i) {
        boolean z2 = spqVar.a;
        boolean z3 = spqVar.b;
        int i2 = spqVar.d;
        Integer num2 = spqVar.e;
        Integer num3 = spqVar.f;
        if ((i & 64) != 0) {
            num = spqVar.g;
        }
        spqVar.getClass();
        return new spq(z2, z3, z, i2, num2, num3, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spq)) {
            return false;
        }
        spq spqVar = (spq) obj;
        return this.a == spqVar.a && this.b == spqVar.b && this.c == spqVar.c && this.d == spqVar.d && Intrinsics.d(this.e, spqVar.e) && Intrinsics.d(this.f, spqVar.f) && Intrinsics.d(this.g, spqVar.g);
    }

    public final int hashCode() {
        int a = f1d.a(this.d, k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder j = eta.j("SkeletonNetworkConfig(connectionErrorFallbackEnabled=", this.a, ", backendErrorFallbackEnabled=", this.b, ", offlineModeFallbackEnabled=");
        j.append(this.c);
        j.append(", fallbackMaxStaleSec=");
        j.append(this.d);
        j.append(", connectTimeoutMs=");
        j.append(this.e);
        j.append(", ioTimeoutMs=");
        j.append(this.f);
        j.append(", upperLimitSlowNetworkSpeedKbps=");
        j.append(this.g);
        j.append(")");
        return j.toString();
    }
}
