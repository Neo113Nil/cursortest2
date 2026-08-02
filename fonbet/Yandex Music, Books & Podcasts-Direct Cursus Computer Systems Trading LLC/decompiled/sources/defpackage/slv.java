package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class slv extends tlv {
    public final Bitmap a;
    public final String b;
    public final String c;
    public final String d;
    public final jzb e;
    public final llv f;

    public slv(Bitmap bitmap, String str, String str2, String str3, jzb jzbVar, llv llvVar) {
        str2.getClass();
        str3.getClass();
        this.a = bitmap;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = jzbVar;
        this.f = llvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slv)) {
            return false;
        }
        slv slvVar = (slv) obj;
        return Intrinsics.d(this.a, slvVar.a) && Intrinsics.d(this.b, slvVar.b) && Intrinsics.d(this.c, slvVar.c) && Intrinsics.d(this.d, slvVar.d) && this.e == slvVar.e && this.f.equals(slvVar.f);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        String str = this.b;
        int c = k5r.c(k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        jzb jzbVar = this.e;
        return this.f.hashCode() + ((c + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Player(cover=");
        sb.append(this.a);
        sb.append(", averageCoverColor=");
        sb.append(this.b);
        sb.append(", title=");
        su4.v(sb, this.c, ", subtitle=", this.d, ", explicitType=");
        sb.append(this.e);
        sb.append(", widgetButtons=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
