package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class iom {
    public final u2q a;
    public final Long b;
    public final boolean c;
    public final boolean d;
    public final gy1 e;
    public final vzg f;
    public final boolean g;

    public iom(u2q u2qVar, Long l, boolean z, boolean z2, gy1 gy1Var, vzg vzgVar, boolean z3) {
        u2qVar.getClass();
        this.a = u2qVar;
        this.b = l;
        this.c = z;
        this.d = z2;
        this.e = gy1Var;
        this.f = vzgVar;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iom)) {
            return false;
        }
        iom iomVar = (iom) obj;
        return Intrinsics.d(this.a, iomVar.a) && Intrinsics.d(this.b, iomVar.b) && this.c == iomVar.c && this.d == iomVar.d && this.e == iomVar.e && Intrinsics.d(this.f, iomVar.f) && this.g == iomVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (this.e.hashCode() + k5r.e(k5r.e((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c), 31, this.d)) * 31;
        vzg vzgVar = this.f;
        return Boolean.hashCode(this.g) + ((hashCode2 + (vzgVar != null ? vzgVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrepareParams(playable=");
        sb.append(this.a);
        sb.append(", startPositionMs=");
        sb.append(this.b);
        sb.append(", isCrossfading=");
        dfi.t(sb, this.c, ", enabledQuarterFadeIn=", this.d, ", audioResource=");
        sb.append(this.e);
        sb.append(", loudnessNormalizationData=");
        sb.append(this.f);
        sb.append(", normalize=");
        return ouj.r(sb, this.g, ")");
    }
}
