package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class azd {
    public final tk2 a;
    public final cgg b;
    public final rn3 c;
    public final pi3 d;

    public azd(tk2 tk2Var, cgg cggVar, rn3 rn3Var, pi3 pi3Var) {
        this.a = tk2Var;
        this.b = cggVar;
        this.c = rn3Var;
        this.d = pi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azd)) {
            return false;
        }
        azd azdVar = (azd) obj;
        return Intrinsics.d(this.a, azdVar.a) && Intrinsics.d(this.b, azdVar.b) && Intrinsics.d(this.c, azdVar.c) && Intrinsics.d(this.d, azdVar.d);
    }

    public final int hashCode() {
        tk2 tk2Var = this.a;
        int hashCode = (tk2Var == null ? 0 : tk2Var.hashCode()) * 31;
        cgg cggVar = this.b;
        int hashCode2 = (hashCode + (cggVar == null ? 0 : cggVar.hashCode())) * 31;
        rn3 rn3Var = this.c;
        int hashCode3 = (hashCode2 + (rn3Var == null ? 0 : rn3Var.hashCode())) * 31;
        pi3 pi3Var = this.d;
        return hashCode3 + (pi3Var != null ? pi3Var.hashCode() : 0);
    }

    public final String toString() {
        return "History(lastBandwidthEstimation=" + this.a + ", lastLoadedChunk=" + this.b + ", bytesLoaded=" + this.c + ", currentBufferSize=" + this.d + ')';
    }
}
