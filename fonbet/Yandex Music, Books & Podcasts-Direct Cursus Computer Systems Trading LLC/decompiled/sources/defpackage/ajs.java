package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ajs {
    public final long a;
    public final long b;
    public final long c;
    public final e7o d;

    public ajs() {
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.SECONDS;
        long M = yd5.M(45, ssaVar);
        long M2 = yd5.M(5, ssaVar);
        long M3 = yd5.M(5, ssaVar);
        e7o e7oVar = b2c.w;
        this.a = M;
        this.b = M2;
        this.c = M3;
        this.d = e7oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajs)) {
            return false;
        }
        ajs ajsVar = (ajs) obj;
        return nsa.e(this.a, ajsVar.a) && nsa.e(this.b, ajsVar.b) && nsa.e(this.c, ajsVar.c) && Intrinsics.d(this.d, ajsVar.d);
    }

    public final int hashCode() {
        msa msaVar = nsa.b;
        return this.d.hashCode() + tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) nsa.t(this.a)) + ", additionalTime=" + ((Object) nsa.t(this.b)) + ", idleTimeout=" + ((Object) nsa.t(this.c)) + ", timeSource=" + this.d + ')';
    }
}
