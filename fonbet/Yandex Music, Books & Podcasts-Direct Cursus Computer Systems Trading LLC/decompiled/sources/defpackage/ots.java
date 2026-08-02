package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ots {
    public final zvs a;
    public final o5n b;
    public final thr c;
    public final List d;
    public final vzg e;
    public final gy1 f;
    public final zvs g;

    public ots(zvs zvsVar, o5n o5nVar, thr thrVar, List list, vzg vzgVar, gy1 gy1Var) {
        zvsVar.getClass();
        o5nVar.getClass();
        thrVar.getClass();
        list.getClass();
        this.a = zvsVar;
        this.b = o5nVar;
        this.c = thrVar;
        this.d = list;
        this.e = vzgVar;
        this.f = gy1Var;
        this.g = gy1Var == gy1.e ? new zvs(ouj.n(zvsVar.a, "_sm")) : zvsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ots)) {
            return false;
        }
        ots otsVar = (ots) obj;
        return Intrinsics.d(this.a, otsVar.a) && this.b == otsVar.b && this.c == otsVar.c && Intrinsics.d(this.d, otsVar.d) && Intrinsics.d(this.e, otsVar.e) && this.f == otsVar.f;
    }

    public final int hashCode() {
        int d = k5r.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        vzg vzgVar = this.e;
        return this.f.hashCode() + ((d + (vzgVar == null ? 0 : vzgVar.hashCode())) * 31);
    }

    public final String toString() {
        return "TrackFetchRequest(trackId=" + this.a + ", selectedQuality=" + this.b + ", selectedStorage=" + this.c + ", availableStorages=" + this.d + ", loudnessNormalizationData=" + this.e + ", audioResource=" + this.f + ")";
    }
}
