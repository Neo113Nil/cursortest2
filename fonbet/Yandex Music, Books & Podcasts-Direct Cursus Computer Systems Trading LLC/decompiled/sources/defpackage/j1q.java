package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j1q extends m1q {
    public final ckd c;
    public final e5d d;

    public j1q(ckd ckdVar, e5d e5dVar) {
        this.c = ckdVar;
        this.d = e5dVar;
    }

    @Override // defpackage.m1q
    public final ckd d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1q)) {
            return false;
        }
        j1q j1qVar = (j1q) obj;
        return Intrinsics.d(this.c, j1qVar.c) && Intrinsics.d(this.d, j1qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "SharedGlagolGenerativePlayable(playableId=" + rwk.b(b()) + ", glagolTrack=" + this.c + ", generativeStream=" + this.d + ")";
    }
}
