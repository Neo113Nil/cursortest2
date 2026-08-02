package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r5 {
    public final d9 a;

    public r5(d9 d9Var) {
        d9Var.getClass();
        this.a = d9Var;
        d9Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5) && Intrinsics.areEqual(this.a, ((r5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DispatchFailedEvent(request=" + this.a + ")";
    }
}
