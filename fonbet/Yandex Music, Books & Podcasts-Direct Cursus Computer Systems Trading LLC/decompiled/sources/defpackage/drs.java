package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class drs {
    public final rr5 a;
    public final boolean b;

    public drs(rr5 rr5Var, boolean z) {
        rr5Var.getClass();
        this.a = rr5Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drs)) {
            return false;
        }
        drs drsVar = (drs) obj;
        return Intrinsics.d(this.a, drsVar.a) && this.b == drsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackAvailability(trackId=" + this.a + ", availability=" + this.b + ")";
    }
}
