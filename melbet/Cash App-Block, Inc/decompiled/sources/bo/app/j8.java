package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j8 {
    public final k8 a;

    public j8(k8 k8Var) {
        k8Var.getClass();
        this.a = k8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8) && Intrinsics.areEqual(this.a, ((j8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsRequestSuccessEvent(request=" + this.a + ")";
    }
}
