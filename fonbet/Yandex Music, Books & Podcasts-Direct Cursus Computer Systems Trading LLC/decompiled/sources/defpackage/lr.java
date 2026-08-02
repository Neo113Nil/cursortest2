package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lr implements mr {
    public final xbb a;
    public final List b;
    public final lnu c;
    public final List d;
    public final List e;
    public final boolean f;

    public lr(xbb xbbVar, List list, lnu lnuVar, List list2, List list3, boolean z) {
        xbbVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = xbbVar;
        this.b = list;
        this.c = lnuVar;
        this.d = list2;
        this.e = list3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr)) {
            return false;
        }
        lr lrVar = (lr) obj;
        return Intrinsics.d(this.a, lrVar.a) && Intrinsics.d(this.b, lrVar.b) && Intrinsics.d(this.c, lrVar.c) && Intrinsics.d(this.d, lrVar.d) && Intrinsics.d(this.e, lrVar.e) && this.f == lrVar.f;
    }

    public final int hashCode() {
        int d = k5r.d(this.a.hashCode() * 31, 31, this.b);
        lnu lnuVar = this.c;
        return Boolean.hashCode(this.f) + k5r.d(k5r.d((d + (lnuVar == null ? 0 : lnuVar.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "Success(header=" + this.a + ", artists=" + this.b + ", wave=" + this.c + ", actions=" + this.d + ", disclaimers=" + this.e + ", isWaveAgentsExperimentEnabled=" + this.f + ")";
    }
}
