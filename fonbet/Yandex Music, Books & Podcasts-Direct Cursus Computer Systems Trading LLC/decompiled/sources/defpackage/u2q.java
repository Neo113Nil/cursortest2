package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u2q extends v2q {
    public final String a;
    public final zvs b;
    public final gy1 c;
    public final boolean d;
    public final qvs e;
    public final pxs f;
    public final be6 g;

    public u2q(String str, zvs zvsVar, gy1 gy1Var, boolean z, qvs qvsVar, pxs pxsVar, be6 be6Var) {
        str.getClass();
        this.a = str;
        this.b = zvsVar;
        this.c = gy1Var;
        this.d = z;
        this.e = qvsVar;
        this.f = pxsVar;
        this.g = be6Var;
    }

    @Override // defpackage.v2q
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2q)) {
            return false;
        }
        u2q u2qVar = (u2q) obj;
        return Intrinsics.d(this.a, u2qVar.a) && this.b.equals(u2qVar.b) && this.c == u2qVar.c && this.d == u2qVar.d && Intrinsics.d(this.e, u2qVar.e) && Intrinsics.d(this.f, u2qVar.f) && this.g == u2qVar.g;
    }

    public final int hashCode() {
        int e = k5r.e((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a)) * 31, 31, this.d);
        qvs qvsVar = this.e;
        int hashCode = (e + (qvsVar == null ? 0 : qvsVar.hashCode())) * 31;
        pxs pxsVar = this.f;
        return this.g.hashCode() + ((hashCode + (pxsVar != null ? pxsVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Track(id=" + this.a + ", track=" + this.b + ", audioResource=" + this.c + ", crossfadable=" + this.d + ", fade=" + this.e + ", loudnessMeta=" + this.f + ", contentType=" + this.g + ")";
    }
}
