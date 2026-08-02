package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z5h {
    public final pkl a;
    public final thj b;

    public z5h(pkl pklVar, thj thjVar) {
        pklVar.getClass();
        this.a = pklVar;
        this.b = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5h)) {
            return false;
        }
        z5h z5hVar = (z5h) obj;
        return Intrinsics.d(this.a, z5hVar.a) && this.b.equals(z5hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MainPlayerAnalyticsPayload(playerScreenInfo=" + this.a + ", objectInfo=" + this.b + ")";
    }
}
