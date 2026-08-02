package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s5 {
    public final d9 a;

    public s5(d9 d9Var) {
        d9Var.getClass();
        this.a = d9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5) && Intrinsics.areEqual(this.a, ((s5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DispatchSucceededEvent(request=" + this.a + ")";
    }
}
