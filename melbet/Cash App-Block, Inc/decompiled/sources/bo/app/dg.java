package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dg {
    public final l4 a;

    public dg(l4 l4Var) {
        l4Var.getClass();
        this.a = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg) && Intrinsics.areEqual(this.a, ((dg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchCompletedEvent(request=" + this.a + ")";
    }
}
