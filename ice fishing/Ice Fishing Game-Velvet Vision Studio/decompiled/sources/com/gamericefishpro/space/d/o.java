package com.gamericefishpro.space.d;

import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.z4.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends y3 {
    public final s d;
    public final u e;

    public o(s callback, u uVar) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.d = callback;
        this.e = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.a(this.d, oVar.d) && Intrinsics.a(this.e, oVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        u uVar = this.e;
        return iHashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.d + ", owner=" + this.e + ')';
    }
}
