package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c2q extends m1q {
    public final ckd c;
    public final mqs d;
    public final d2q e;
    public final mqs f;

    public c2q(ckd ckdVar, mqs mqsVar, d2q d2qVar) {
        this.c = ckdVar;
        this.d = mqsVar;
        this.e = d2qVar;
        this.f = mqsVar;
    }

    @Override // defpackage.m1q, defpackage.mwk
    public final mqs a() {
        return this.f;
    }

    @Override // defpackage.m1q
    public final ckd d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2q)) {
            return false;
        }
        c2q c2qVar = (c2q) obj;
        return Intrinsics.d(this.c, c2qVar.c) && Intrinsics.d(this.d, c2qVar.d) && Intrinsics.d(this.e, c2qVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(this.c.hashCode() * 31, 31, this.d.a);
    }

    public final String toString() {
        return "SharedGlagolTrackPlayable(playableId=" + rwk.b(b()) + ", glagolTrack=" + this.c + ", musicTrack=" + this.d + ")";
    }
}
