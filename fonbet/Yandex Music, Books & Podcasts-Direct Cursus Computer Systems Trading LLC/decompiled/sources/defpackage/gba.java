package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gba {
    public final mqs a;
    public final nss b;
    public final long c;
    public final int d;

    public gba(mqs mqsVar, nss nssVar, long j, int i) {
        mqsVar.getClass();
        this.a = mqsVar;
        this.b = nssVar;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gba)) {
            return false;
        }
        gba gbaVar = (gba) obj;
        return Intrinsics.d(this.a, gbaVar.a) && this.b.equals(gbaVar.b) && this.c == gbaVar.c && this.d == gbaVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + tlm.c(this.c, (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "TrackToDownload(track=" + this.a + ", cacheType=" + this.b + ", addedTimestampMills=" + this.c + ", indexInEntity=" + this.d + ")";
    }
}
