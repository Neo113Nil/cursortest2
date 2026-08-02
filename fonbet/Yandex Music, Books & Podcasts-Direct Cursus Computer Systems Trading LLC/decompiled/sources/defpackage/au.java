package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class au {
    public final String a;
    public final boolean b;
    public final Date c;

    public au(String str, boolean z, Date date) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return Intrinsics.d(this.a, auVar.a) && this.b == auVar.b && Intrinsics.d(this.c, auVar.c);
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        Date date = this.c;
        return e + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        StringBuilder h = v3w.h("AlbumLikeStatus(albumId=", this.a, ", liked=", ", likeTimestamp=", this.b);
        h.append(this.c);
        h.append(")");
        return h.toString();
    }
}
