package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nfm {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public nfm(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfm)) {
            return false;
        }
        nfm nfmVar = (nfm) obj;
        return ywf.u(this.a, nfmVar.a) && this.b == nfmVar.b && enj.c(this.c, nfmVar.c) && enj.c(this.d, nfmVar.d) && this.e == nfmVar.e && Float.compare(this.f, nfmVar.f) == 0 && this.g == nfmVar.g && this.h == nfmVar.h && this.i.equals(nfmVar.i) && enj.c(this.j, nfmVar.j) && enj.c(this.k, nfmVar.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + tlm.c(this.j, dfi.b(this.i, k5r.e(f1d.a(this.g, eta.a(k5r.e(tlm.c(this.d, tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), this.f, 31), 31), 31, this.h), 31), 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) ("PointerId(value=" + this.a + ')')) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) enj.j(this.c)) + ", position=" + ((Object) enj.j(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) vfm.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) enj.j(this.j)) + ", originalEventPosition=" + ((Object) enj.j(this.k)) + ')';
    }
}
