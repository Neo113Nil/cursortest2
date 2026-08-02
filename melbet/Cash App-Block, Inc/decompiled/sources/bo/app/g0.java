package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 {
    public final h0 a;

    public g0(h0 h0Var) {
        h0Var.getClass();
        this.a = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.areEqual(this.a, ((g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BannersRequestSuccessEvent(request=" + this.a + ")";
    }
}
