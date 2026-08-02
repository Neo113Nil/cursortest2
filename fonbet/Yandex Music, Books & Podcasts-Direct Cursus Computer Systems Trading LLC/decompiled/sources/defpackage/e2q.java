package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e2q extends m1q {
    public final ckd c;

    public e2q(ckd ckdVar) {
        this.c = ckdVar;
    }

    @Override // defpackage.m1q
    public final ckd d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2q) && Intrinsics.d(this.c, ((e2q) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "SharedGlagolUnknownPlayable(playableId=" + rwk.b(b()) + ", glagolTrack=" + this.c + ")";
    }
}
