package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bts extends p9 {
    public static final jyr f = btf.b(new x6s(14));
    public final Uri b;
    public final List c;
    public final String d;
    public final Date e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bts(Uri uri, List list, String str, Date date) {
        super(bb6.c);
        uri.getClass();
        list.getClass();
        str.getClass();
        date.getClass();
        this.b = uri;
        this.c = list;
        this.d = str;
        this.e = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bts)) {
            return false;
        }
        bts btsVar = (bts) obj;
        return Intrinsics.d(this.b, btsVar.b) && Intrinsics.d(this.c, btsVar.c) && Intrinsics.d(this.d, btsVar.d) && Intrinsics.d(this.e, btsVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.d(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "Enc(uri=" + this.b + ", uris=" + this.c + ", encryptionKey=" + this.d + ", expiresAt=" + this.e + ")";
    }
}
