package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d0a {
    public final Uri a;
    public final String b;
    public final zz9 c;
    public final Long d;

    public d0a(Uri uri, String str, zz9 zz9Var, Long l) {
        this.a = uri;
        this.b = str;
        this.c = zz9Var;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0a)) {
            return false;
        }
        d0a d0aVar = (d0a) obj;
        return Intrinsics.d(this.a, d0aVar.a) && Intrinsics.d(this.b, d0aVar.b) && Intrinsics.d(this.c, d0aVar.c) && Intrinsics.d(this.d, d0aVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        zz9 zz9Var = this.c;
        int hashCode = (c + (zz9Var == null ? 0 : zz9Var.hashCode())) * 31;
        Long l = this.d;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivVideoSource(url=");
        sb.append(this.a);
        sb.append(", mimeType=");
        sb.append(this.b);
        sb.append(", resolution=");
        sb.append(this.c);
        sb.append(", bitrate=");
        return tlm.k(sb, this.d, ')');
    }
}
