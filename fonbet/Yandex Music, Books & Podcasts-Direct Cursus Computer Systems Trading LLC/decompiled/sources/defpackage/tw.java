package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tw {
    public final ow a;
    public final wzn b;

    public tw(ow owVar, wzn wznVar) {
        this.a = owVar;
        this.b = wznVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw)) {
            return false;
        }
        tw twVar = (tw) obj;
        return this.a.equals(twVar.a) && Intrinsics.d(this.b, twVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wzn wznVar = this.b;
        return hashCode + (wznVar == null ? 0 : wznVar.hashCode());
    }

    public final String toString() {
        return "AlbumPromoBundle(albumPromo=" + this.a + ", reportingConfig=" + this.b + ")";
    }
}
