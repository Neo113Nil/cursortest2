package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ad {
    public final i2 a;

    public ad(i2 i2Var) {
        i2Var.getClass();
        this.a = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad) && Intrinsics.areEqual(this.a, ((ad) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchStartedEvent(request=" + this.a + ")";
    }
}
