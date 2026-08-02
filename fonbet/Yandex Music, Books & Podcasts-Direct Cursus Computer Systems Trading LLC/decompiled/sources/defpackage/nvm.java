package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nvm {
    public final mwk a;
    public final long b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final boolean f;

    public nvm(mwk mwkVar, long j, Long l, Long l2, boolean z, boolean z2) {
        mwkVar.getClass();
        this.a = mwkVar;
        this.b = j;
        this.c = l;
        this.d = l2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvm)) {
            return false;
        }
        nvm nvmVar = (nvm) obj;
        return Intrinsics.d(this.a, nvmVar.a) && this.b == nvmVar.b && Intrinsics.d(this.c, nvmVar.c) && Intrinsics.d(this.d, nvmVar.d) && this.e == nvmVar.e && this.f == nvmVar.f;
    }

    public final int hashCode() {
        int c = tlm.c(this.b, this.a.hashCode() * 31, 31);
        Long l = this.c;
        int hashCode = (c + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return Boolean.hashCode(this.f) + k5r.e((hashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "ProgressWithGenericDuration(playable=" + this.a + ", progress=" + this.b + ", duration=" + this.c + ", durationWithEffects=" + this.d + ", isPlayerReady=" + this.e + ", isPlayerPlaying=" + this.f + ")";
    }
}
