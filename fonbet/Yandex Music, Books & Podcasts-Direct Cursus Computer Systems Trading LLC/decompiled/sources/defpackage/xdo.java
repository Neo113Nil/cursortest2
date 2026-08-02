package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xdo {
    public final long a;
    public final udo b;

    public xdo(long j, udo udoVar) {
        this.a = j;
        this.b = udoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdo)) {
            return false;
        }
        xdo xdoVar = (xdo) obj;
        return d85.c(this.a, xdoVar.a) && Intrinsics.d(this.b, xdoVar.b);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        int hashCode = Long.hashCode(this.a) * 31;
        udo udoVar = this.b;
        return hashCode + (udoVar != null ? udoVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        dfi.q(this.a, ", rippleAlpha=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
