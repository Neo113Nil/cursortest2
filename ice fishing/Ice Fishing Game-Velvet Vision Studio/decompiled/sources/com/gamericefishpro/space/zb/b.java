package com.gamericefishpro.space.zb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final Long rywDelay;
    private final String rywToken;

    public b(String rywToken, Long l) {
        Intrinsics.checkNotNullParameter(rywToken, "rywToken");
        this.rywToken = rywToken;
        this.rywDelay = l;
    }

    public static /* synthetic */ b copy$default(b bVar, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.rywToken;
        }
        if ((i & 2) != 0) {
            l = bVar.rywDelay;
        }
        return bVar.copy(str, l);
    }

    public final String component1() {
        return this.rywToken;
    }

    public final Long component2() {
        return this.rywDelay;
    }

    public final b copy(String rywToken, Long l) {
        Intrinsics.checkNotNullParameter(rywToken, "rywToken");
        return new b(rywToken, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.rywToken, bVar.rywToken) && Intrinsics.a(this.rywDelay, bVar.rywDelay);
    }

    public final Long getRywDelay() {
        return this.rywDelay;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public int hashCode() {
        int iHashCode = this.rywToken.hashCode() * 31;
        Long l = this.rywDelay;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "RywData(rywToken=" + this.rywToken + ", rywDelay=" + this.rywDelay + ')';
    }
}
