package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sg {
    public final v9 a;
    public final y9 b;

    public sg(v9 v9Var, y9 y9Var) {
        v9Var.getClass();
        y9Var.getClass();
        this.a = v9Var;
        this.b = y9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj;
        return Intrinsics.areEqual(this.a, sgVar.a) && Intrinsics.areEqual(this.b, sgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.a + ", failedTriggeredAction=" + this.b + ")";
    }
}
