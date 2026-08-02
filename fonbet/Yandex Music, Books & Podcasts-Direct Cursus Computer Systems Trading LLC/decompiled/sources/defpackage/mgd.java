package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mgd {
    public final ygd a;
    public final Double b;

    public mgd(ygd ygdVar, Double d) {
        this.a = ygdVar;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgd)) {
            return false;
        }
        mgd mgdVar = (mgd) obj;
        return Intrinsics.d(this.a, mgdVar.a) && Intrinsics.d(this.b, mgdVar.b);
    }

    public final int hashCode() {
        ygd ygdVar = this.a;
        int hashCode = (ygdVar == null ? 0 : ygdVar.hashCode()) * 31;
        Double d = this.b;
        return hashCode + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "TrackInfo(descriptor=" + this.a + ", offsetSeconds=" + this.b + ")";
    }
}
