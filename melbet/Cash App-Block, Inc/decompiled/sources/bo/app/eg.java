package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class eg {
    public final l4 a;

    public eg(l4 l4Var) {
        l4Var.getClass();
        this.a = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg) && Intrinsics.areEqual(this.a, ((eg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchStartedEvent(request=" + this.a + ")";
    }
}
