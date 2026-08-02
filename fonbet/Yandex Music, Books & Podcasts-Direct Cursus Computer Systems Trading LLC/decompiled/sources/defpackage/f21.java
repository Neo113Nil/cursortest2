package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f21 implements g21 {
    public final xbb a;
    public final String b;
    public final lnu c;
    public final ArrayList d;
    public final ArrayList e;
    public final boolean f;

    public f21(xbb xbbVar, String str, lnu lnuVar, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.a = xbbVar;
        this.b = str;
        this.c = lnuVar;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f21)) {
            return false;
        }
        f21 f21Var = (f21) obj;
        return this.a.equals(f21Var.a) && Intrinsics.d(this.b, f21Var.b) && Intrinsics.d(this.c, f21Var.c) && this.d.equals(f21Var.d) && this.e.equals(f21Var.e) && this.f == f21Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        lnu lnuVar = this.c;
        return Boolean.hashCode(this.f) + dfi.b(this.e, dfi.b(this.d, (hashCode2 + (lnuVar != null ? lnuVar.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "Success(header=" + this.a + ", description=" + this.b + ", wave=" + this.c + ", primaryActions=" + this.d + ", secondaryActions=" + this.e + ", isWaveAgentsExperimentEnabled=" + this.f + ")";
    }
}
