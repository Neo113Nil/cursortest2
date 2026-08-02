package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q1g {
    public final String a;
    public final Date b;

    public q1g(Date date, String str) {
        str.getClass();
        this.a = str;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1g)) {
            return false;
        }
        q1g q1gVar = (q1g) obj;
        return Intrinsics.d(this.a, q1gVar.a) && this.b.equals(q1gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LikedAlbumId(albumId=" + this.a + ", timestamp=" + this.b + ")";
    }
}
