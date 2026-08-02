package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kis {
    public final Object a;
    public final long b;

    public kis(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kis)) {
            return false;
        }
        kis kisVar = (kis) obj;
        return Intrinsics.d(this.a, kisVar.a) && nsa.e(this.b, kisVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        msa msaVar = nsa.b;
        return Long.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) nsa.t(this.b)) + ')';
    }
}
