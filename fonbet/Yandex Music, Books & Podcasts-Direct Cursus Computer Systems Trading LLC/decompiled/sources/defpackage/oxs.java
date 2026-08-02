package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class oxs {
    public final Boolean a;
    public final vzg b;

    public oxs(Boolean bool, vzg vzgVar) {
        this.a = bool;
        this.b = vzgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxs)) {
            return false;
        }
        oxs oxsVar = (oxs) obj;
        return Intrinsics.d(this.a, oxsVar.a) && Intrinsics.d(this.b, oxsVar.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        vzg vzgVar = this.b;
        return hashCode + (vzgVar != null ? vzgVar.hashCode() : 0);
    }

    public final String toString() {
        return "TrackLoudnessData(gained=" + this.a + ", loudnessNormalizationData=" + this.b + ")";
    }
}
