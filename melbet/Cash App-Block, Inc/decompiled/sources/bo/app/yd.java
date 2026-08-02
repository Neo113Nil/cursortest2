package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yd {
    public final td a;

    public yd(td tdVar) {
        tdVar.getClass();
        this.a = tdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd) && Intrinsics.areEqual(this.a, ((yd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerConfigUpdateEvent(debugConfig=" + this.a + ")";
    }
}
