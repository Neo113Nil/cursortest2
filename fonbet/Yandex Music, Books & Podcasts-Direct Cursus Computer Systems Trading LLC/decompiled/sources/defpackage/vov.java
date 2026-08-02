package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vov implements wov {
    public final Bitmap a;
    public final String b;
    public final String c;
    public final jzb d;
    public final llv e;
    public final plv f;

    public vov(Bitmap bitmap, String str, String str2, jzb jzbVar, llv llvVar, plv plvVar) {
        str.getClass();
        str2.getClass();
        this.a = bitmap;
        this.b = str;
        this.c = str2;
        this.d = jzbVar;
        this.e = llvVar;
        this.f = plvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vov)) {
            return false;
        }
        vov vovVar = (vov) obj;
        return Intrinsics.d(this.a, vovVar.a) && Intrinsics.d(this.b, vovVar.b) && Intrinsics.d(this.c, vovVar.c) && this.d == vovVar.d && this.e.equals(vovVar.e) && this.f.equals(vovVar.f);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int c = k5r.c(k5r.c((bitmap == null ? 0 : bitmap.hashCode()) * 31, 31, this.b), 31, this.c);
        jzb jzbVar = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((c + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Player(cover=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", explicitType=" + this.d + ", widgetButtons=" + this.e + ", colorType=" + this.f + ")";
    }
}
