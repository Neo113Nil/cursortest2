package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class oxu implements qxu {
    public final tfo a;
    public final rdg b;
    public final ixu c;

    public oxu(tfo tfoVar, rdg rdgVar, ixu ixuVar) {
        this.a = tfoVar;
        this.b = rdgVar;
        this.c = ixuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxu)) {
            return false;
        }
        oxu oxuVar = (oxu) obj;
        return this.a.equals(oxuVar.a) && Intrinsics.d(this.b, oxuVar.b) && this.c == oxuVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rdg rdgVar = this.b;
        return this.c.hashCode() + ((hashCode + (rdgVar == null ? 0 : rdgVar.hashCode())) * 31);
    }

    public final String toString() {
        return "SessionProlonged(batch=" + this.a + ", analyticalBatch=" + this.b + ", offlineMode=" + this.c + ")";
    }
}
