package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ze {
    public final we a;

    public ze(we weVar) {
        weVar.getClass();
        this.a = weVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze) && Intrinsics.areEqual(this.a, ((ze) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionSealedEvent(sealedSession=" + this.a + ")";
    }
}
