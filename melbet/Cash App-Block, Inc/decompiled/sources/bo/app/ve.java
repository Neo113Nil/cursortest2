package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ve {
    public final t9 a;

    public ve(t9 t9Var) {
        t9Var.getClass();
        this.a = t9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve) && Intrinsics.areEqual(this.a, ((ve) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ServerResponseErrorEvent(responseError=" + this.a + ")";
    }
}
