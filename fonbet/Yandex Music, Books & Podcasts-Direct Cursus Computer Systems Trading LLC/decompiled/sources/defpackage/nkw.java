package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nkw implements okw {
    public final z4q a;
    public final HashMap b;

    public nkw(z4q z4qVar, HashMap hashMap) {
        this.a = z4qVar;
        this.b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkw)) {
            return false;
        }
        nkw nkwVar = (nkw) obj;
        return Intrinsics.d(this.a, nkwVar.a) && this.b.equals(nkwVar.b);
    }

    public final int hashCode() {
        z4q z4qVar = this.a;
        return this.b.hashCode() + ((z4qVar == null ? 0 : z4qVar.hashCode()) * 31);
    }

    public final String toString() {
        return "CachedMissingSources(hasWaveSource=" + this.a + ", hasSources=" + this.b + ")";
    }
}
