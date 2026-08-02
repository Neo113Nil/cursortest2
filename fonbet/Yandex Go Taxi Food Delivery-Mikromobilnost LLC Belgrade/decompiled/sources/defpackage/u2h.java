package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class u2h {
    public final Integer a;
    public final String b;
    public final String c;
    public final Uri d;
    public final Bitmap e;
    public final String f;
    public final String g;
    public final long h;

    public u2h(Integer num, String str, String str2, Uri uri, Bitmap bitmap, String str3, String str4, long j) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = bitmap;
        this.f = str3;
        this.g = str4;
        this.h = j;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.g;
    }

    public final long d() {
        return this.h;
    }

    public final Integer e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2h)) {
            return false;
        }
        u2h u2hVar = (u2h) obj;
        return jl40.l(this.a, u2hVar.a) && jl40.l(this.b, u2hVar.b) && jl40.l(this.c, u2hVar.c) && jl40.l(this.d, u2hVar.d) && jl40.l(this.e, u2hVar.e) && jl40.l(this.f, u2hVar.f) && jl40.l(this.g, u2hVar.g) && this.h == u2hVar.h;
    }

    public final Bitmap f() {
        return this.e;
    }

    public final String g() {
        return this.b;
    }

    public final Uri h() {
        return this.d;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        Bitmap bitmap = this.e;
        int b = unr0.b((hashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        return Long.hashCode(this.h) + ((b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeeplinkNotification(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", body=");
        sb.append(this.c);
        sb.append(", uri=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", channel=");
        sb.append(this.f);
        sb.append(", collapseId=");
        ly3.y(this.h, this.g, ", expirationIntervalInMillis=", sb);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public /* synthetic */ u2h(String str, String str2, Uri uri, Bitmap bitmap, String str3, long j, int i) {
        this(null, str, str2, uri, (i & 16) != 0 ? null : bitmap, str3, null, j);
    }
}
