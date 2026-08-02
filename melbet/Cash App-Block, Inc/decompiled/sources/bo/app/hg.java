package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hg {
    public final fa a;

    public hg(fa faVar) {
        faVar.getClass();
        this.a = faVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hg) && Intrinsics.areEqual(this.a, ((hg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.a + ")";
    }
}
