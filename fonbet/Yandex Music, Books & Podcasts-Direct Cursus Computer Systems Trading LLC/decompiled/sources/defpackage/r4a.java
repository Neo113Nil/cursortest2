package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r4a {
    public final t5a a;
    public final vhm b;

    public r4a(t5a t5aVar, vhm vhmVar) {
        this.a = t5aVar;
        this.b = vhmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4a)) {
            return false;
        }
        r4a r4aVar = (r4a) obj;
        return Intrinsics.d(this.a, r4aVar.a) && Intrinsics.d(this.b, r4aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DocumentLoadKey(documentQuery=" + this.a + ", portionParams=" + this.b + ")";
    }
}
