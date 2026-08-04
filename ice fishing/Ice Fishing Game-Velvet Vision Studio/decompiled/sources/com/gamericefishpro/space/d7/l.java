package com.gamericefishpro.space.d7;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final String f;
    public final long g;

    public l(long j, int i, int i2, int i3, boolean z, String defeatReason, long j2) {
        Intrinsics.checkNotNullParameter(defeatReason, "defeatReason");
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = defeatReason;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b == lVar.b && this.c == lVar.c && this.d == lVar.d && this.e == lVar.e && Intrinsics.a(this.f, lVar.f) && this.g == lVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ((this.f.hashCode() + y0.c(com.gamericefishpro.space.m5.a.t(this.d, com.gamericefishpro.space.m5.a.t(this.c, com.gamericefishpro.space.m5.a.t(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31, this.e)) * 31);
    }

    public final String toString() {
        return "IceGameHistoryEntity(id=" + this.a + ", level=" + this.b + ", score=" + this.c + ", stars=" + this.d + ", isWin=" + this.e + ", defeatReason=" + this.f + ", playedAt=" + this.g + ")";
    }

    public /* synthetic */ l(int i, int i2, int i3, int i4, String str, boolean z) {
        this(0L, i, i2, i3, z, (i4 & 32) != 0 ? "" : str, System.currentTimeMillis());
    }
}
