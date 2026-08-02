package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fga {
    public final uga a;
    public final String b;
    public final long c;

    public fga(uga ugaVar, String str, long j) {
        str.getClass();
        this.a = ugaVar;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fga)) {
            return false;
        }
        fga fgaVar = (fga) obj;
        return this.a.equals(fgaVar.a) && Intrinsics.d(this.b, fgaVar.b) && this.c == fgaVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + k5r.c(this.a.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadedPlaylistInfo(userInfo=");
        sb.append(this.a);
        sb.append(", kind=");
        sb.append(this.b);
        sb.append(", downloadedTimestamp=");
        return hrg.m(this.c, ")", sb);
    }
}
