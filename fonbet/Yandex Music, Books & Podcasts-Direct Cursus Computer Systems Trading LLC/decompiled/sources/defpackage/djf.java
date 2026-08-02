package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class djf {
    public long a;
    public String b;
    public Boolean c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djf)) {
            return false;
        }
        djf djfVar = (djf) obj;
        return this.a == djfVar.a && Intrinsics.d(this.b, djfVar.b) && Intrinsics.d(this.c, djfVar.c) && this.d == djfVar.d && this.e == djfVar.e && this.f == djfVar.f && this.g == djfVar.g && this.h == djfVar.h;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return Long.hashCode(this.h) + tlm.c(this.g, tlm.c(this.f, tlm.c(this.e, tlm.c(this.d, (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        Boolean bool = this.c;
        long j2 = this.d;
        long j3 = this.e;
        long j4 = this.f;
        long j5 = this.g;
        long j6 = this.h;
        StringBuilder sb = new StringBuilder("LandingTimings(startTime=");
        sb.append(j);
        sb.append(", sourceUrl=");
        sb.append(str);
        sb.append(", fromCache=");
        sb.append(bool);
        sb.append(", startLoadingTime=");
        sb.append(j2);
        ouj.C(sb, ", finishLoadingTime=", j3, ", firstContentLoadedTime=");
        sb.append(j4);
        ouj.C(sb, ", firstContentRenderedTime=", j5, ", fullContentLoadedTime=");
        return hrg.m(j6, ")", sb);
    }
}
