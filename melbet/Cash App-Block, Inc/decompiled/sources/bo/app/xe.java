package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xe {
    public final za a;

    public xe(za zaVar) {
        zaVar.getClass();
        this.a = zaVar;
        if (zaVar.d) {
            a$$ExternalSyntheticBUOutline0.m$3("Session created events cannot be created with already sealed sessions.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe) && Intrinsics.areEqual(this.a, ((xe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionCreatedEvent(session=" + this.a + ")";
    }
}
