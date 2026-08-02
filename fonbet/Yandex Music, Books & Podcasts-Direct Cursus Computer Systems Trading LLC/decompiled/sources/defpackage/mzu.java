package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mzu {
    public final xsu a;
    public final nyn b;
    public final oyu c;
    public final boolean d;
    public final xys e;
    public final String f;
    public final t0q g;
    public final boolean h;

    public mzu(xsu xsuVar, nyn nynVar, oyu oyuVar, boolean z, xys xysVar, String str, t0q t0qVar, boolean z2) {
        xsuVar.getClass();
        nynVar.getClass();
        oyuVar.getClass();
        xysVar.getClass();
        t0qVar.getClass();
        this.a = xsuVar;
        this.b = nynVar;
        this.c = oyuVar;
        this.d = z;
        this.e = xysVar;
        this.f = str;
        this.g = t0qVar;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzu)) {
            return false;
        }
        mzu mzuVar = (mzu) obj;
        return Intrinsics.d(this.a, mzuVar.a) && this.b == mzuVar.b && Intrinsics.d(this.c, mzuVar.c) && this.d == mzuVar.d && Intrinsics.d(this.e, mzuVar.e) && Intrinsics.d(this.f, mzuVar.f) && Intrinsics.d(this.g, mzuVar.g) && this.h == mzuVar.h;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + k5r.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31;
        String str = this.f;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "WaveQueueStartRequest(initialPlayablesInfo=" + this.a + ", repeatModeType=" + this.b + ", initialSessionInfo=" + this.c + ", isSecondary=" + this.d + ", initialTrackOrder=" + this.e + ", initialDescription=" + this.f + ", initialFade=" + this.g + ", continuation=" + this.h + ")";
    }
}
