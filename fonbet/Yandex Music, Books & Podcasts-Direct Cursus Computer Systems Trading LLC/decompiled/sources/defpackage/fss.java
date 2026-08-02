package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fss {
    public final Boolean a;
    public final dss b;

    public fss(Boolean bool, dss dssVar) {
        this.a = bool;
        this.b = dssVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fss)) {
            return false;
        }
        fss fssVar = (fss) obj;
        return Intrinsics.d(this.a, fssVar.a) && Intrinsics.d(this.b, fssVar.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        dss dssVar = this.b;
        return hashCode + (dssVar != null ? dssVar.hashCode() : 0);
    }

    public final String toString() {
        return "TrackLoudnessInfo(gain=" + this.a + ", loudnessNormalizationInfo=" + this.b + ")";
    }
}
