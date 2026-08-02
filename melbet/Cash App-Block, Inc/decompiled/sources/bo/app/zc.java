package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zc {
    public final i2 a;

    public zc(i2 i2Var) {
        i2Var.getClass();
        this.a = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc) && Intrinsics.areEqual(this.a, ((zc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchCompletedEvent(request=" + this.a + ")";
    }
}
