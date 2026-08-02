package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wzn {
    public final diu a;
    public final diu b;
    public final diu c;

    public wzn(diu diuVar, diu diuVar2, diu diuVar3) {
        this.a = diuVar;
        this.b = diuVar2;
        this.c = diuVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzn)) {
            return false;
        }
        wzn wznVar = (wzn) obj;
        return Intrinsics.d(this.a, wznVar.a) && Intrinsics.d(this.b, wznVar.b) && Intrinsics.d(this.c, wznVar.c);
    }

    public final int hashCode() {
        diu diuVar = this.a;
        int hashCode = (diuVar == null ? 0 : diuVar.hashCode()) * 31;
        diu diuVar2 = this.b;
        int hashCode2 = (hashCode + (diuVar2 == null ? 0 : diuVar2.hashCode())) * 31;
        diu diuVar3 = this.c;
        return hashCode2 + (diuVar3 != null ? diuVar3.hashCode() : 0);
    }

    public final String toString() {
        return "ReportingConfigBundle(blockRender=" + this.a + ", blockImpression=" + this.b + ", adImpressions=" + this.c + ")";
    }
}
