package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class raj implements ed5 {
    public final String a;
    public final String b;
    public final boolean c;
    public final jzb d;
    public final boolean e;
    public final g0t f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ raj(String str, String str2, boolean z, jzb jzbVar, boolean z2, g0t g0tVar, boolean z3, boolean z4, int i) {
        this(str, str2, z, jzbVar, z2, g0tVar, (i & 64) != 0 ? false : z3, (i & 128) != 0, (i & 256) != 0 ? false : z4);
    }

    public static raj a(raj rajVar) {
        String str = rajVar.a;
        String str2 = rajVar.b;
        boolean z = rajVar.c;
        jzb jzbVar = rajVar.d;
        g0t g0tVar = rajVar.f;
        boolean z2 = rajVar.g;
        boolean z3 = rajVar.h;
        boolean z4 = rajVar.i;
        rajVar.getClass();
        str.getClass();
        str2.getClass();
        return new raj(str, str2, z, jzbVar, false, g0tVar, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raj)) {
            return false;
        }
        raj rajVar = (raj) obj;
        return Intrinsics.d(this.a, rajVar.a) && Intrinsics.d(this.b, rajVar.b) && this.c == rajVar.c && this.d == rajVar.d && this.e == rajVar.e && Intrinsics.d(this.f, rajVar.f) && this.g == rajVar.g && this.h == rajVar.h && this.i == rajVar.i;
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        jzb jzbVar = this.d;
        int e2 = k5r.e((e + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31, 31, this.e);
        g0t g0tVar = this.f;
        return Boolean.hashCode(this.i) + k5r.e(k5r.e((e2 + (g0tVar != null ? g0tVar.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder m = f1d.m("NonMusicCoverTrackUiData(coverUrl=", this.a, ", title=", this.b, ", isExplicit=");
        m.append(this.c);
        m.append(", explicitType=");
        m.append(this.d);
        m.append(", hasVideoShot=");
        m.append(this.e);
        m.append(", releaseDate=");
        m.append(this.f);
        m.append(", hasYandexBooksBadge=");
        dfi.t(m, this.g, ", hasOverflow=", this.h, ", hasLikeIcon=");
        return ouj.r(m, this.i, ")");
    }

    public raj(String str, String str2, boolean z, jzb jzbVar, boolean z2, g0t g0tVar, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = jzbVar;
        this.e = z2;
        this.f = g0tVar;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }
}
