package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jca {
    public final String a;
    public final long b;

    public jca(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jca)) {
            return false;
        }
        jca jcaVar = (jca) obj;
        return Intrinsics.d(this.a, jcaVar.a) && this.b == jcaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q = k.q("DownloadedAlbumInfo(albumId=", this.b, this.a, ", downloadedTimestamp=");
        q.append(")");
        return q.toString();
    }
}
