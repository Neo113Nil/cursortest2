package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e5d {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public e5d(String str, Uri uri, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        uri.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5d)) {
            return false;
        }
        e5d e5dVar = (e5d) obj;
        return Intrinsics.d(this.a, e5dVar.a) && Intrinsics.d(this.b, e5dVar.b) && Intrinsics.d(this.c, e5dVar.c) && Intrinsics.d(this.d, e5dVar.d) && Intrinsics.d(this.e, e5dVar.e) && Intrinsics.d(this.f, e5dVar.f) && Intrinsics.d(this.g, e5dVar.g);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenerativeStream(id=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", title=");
        su4.v(sb, this.c, ", subtitle=", this.d, ", imageUrl=");
        su4.v(sb, this.e, ", videoUrl=", this.f, ", backgroundColor=");
        return su4.o(sb, this.g, ")");
    }
}
