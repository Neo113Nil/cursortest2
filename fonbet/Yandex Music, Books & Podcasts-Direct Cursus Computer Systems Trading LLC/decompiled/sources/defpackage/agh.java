package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class agh {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Bitmap e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final zkg j;
    public final qlv k;
    public final jzb l;
    public final String m;

    public agh(String str, String str2, String str3, boolean z, Bitmap bitmap, boolean z2, boolean z3, boolean z4, boolean z5, zkg zkgVar, qlv qlvVar, jzb jzbVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = bitmap;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = zkgVar;
        this.k = qlvVar;
        this.l = jzbVar;
        this.m = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agh)) {
            return false;
        }
        agh aghVar = (agh) obj;
        return this.a.equals(aghVar.a) && this.b.equals(aghVar.b) && this.c.equals(aghVar.c) && this.d == aghVar.d && Intrinsics.d(this.e, aghVar.e) && this.f == aghVar.f && this.g == aghVar.g && this.h == aghVar.h && this.i == aghVar.i && this.j.equals(aghVar.j) && this.k == aghVar.k && this.l == aghVar.l && Intrinsics.d(this.m, aghVar.m);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Bitmap bitmap = this.e;
        int hashCode = (this.k.hashCode() + ((this.j.hashCode() + k5r.e(k5r.e(k5r.e(k5r.e((e + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31)) * 31;
        jzb jzbVar = this.l;
        int hashCode2 = (hashCode + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31;
        String str = this.m;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Media3DecodedData(titleWithExplicit=", this.a, ", title=", this.b, ", subtitle=");
        m.append(this.c);
        m.append(", needToUpdateBitmap=");
        m.append(this.d);
        m.append(", bitmap=");
        m.append(this.e);
        m.append(", playWhenReady=");
        m.append(this.f);
        m.append(", skipPossible=");
        dfi.t(m, this.g, ", prevPossible=", this.h, ", isPodcast=");
        m.append(this.i);
        m.append(", localLikeState=");
        m.append(this.j);
        m.append(", widgetControlsType=");
        m.append(this.k);
        m.append(", explicitType=");
        m.append(this.l);
        m.append(", averageCoverColor=");
        return su4.o(m, this.m, ")");
    }
}
