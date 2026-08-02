package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ija {
    public final String a;
    public final long b;
    public final boolean c;
    public final hja d;
    public final boolean e;

    public ija(String str, long j, boolean z, hja hjaVar) {
        boolean z2;
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = hjaVar;
        int ordinal = hjaVar.ordinal();
        if (ordinal != 0) {
            z2 = true;
            if (ordinal != 1 && ordinal != 2) {
                if (ordinal != 3) {
                    b6e.s();
                    throw null;
                }
            }
            this.e = z2;
        }
        z2 = false;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ija)) {
            return false;
        }
        ija ijaVar = (ija) obj;
        return Intrinsics.d(this.a, ijaVar.a) && this.b == ijaVar.b && this.c == ijaVar.c && this.d == ijaVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.e(tlm.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder q = k.q("DownloadedTrackInfo(trackId=", this.b, this.a, ", addedTimestamp=");
        q.append(", downloadedAsTrack=");
        q.append(this.c);
        q.append(", cacheType=");
        q.append(this.d);
        q.append(")");
        return q.toString();
    }
}
