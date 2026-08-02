package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class te {
    public final re a;

    public te(re reVar) {
        reVar.getClass();
        this.a = reVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te) && Intrinsics.areEqual(this.a, ((te) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ServerConfigReceivedEvent(serverConfig=" + this.a + ")";
    }
}
