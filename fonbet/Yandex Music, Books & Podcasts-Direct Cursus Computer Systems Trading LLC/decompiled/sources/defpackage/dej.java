package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dej {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final jzb d;
    public final boolean e;
    public final g0t f;
    public final boolean g;

    public dej(String str, boolean z, boolean z2, jzb jzbVar, boolean z3, g0t g0tVar, boolean z4) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = jzbVar;
        this.e = z3;
        this.f = g0tVar;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dej)) {
            return false;
        }
        dej dejVar = (dej) obj;
        return Intrinsics.d(this.a, dejVar.a) && this.b == dejVar.b && this.c == dejVar.c && this.d == dejVar.d && this.e == dejVar.e && Intrinsics.d(this.f, dejVar.f) && this.g == dejVar.g;
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        jzb jzbVar = this.d;
        int e2 = k5r.e((e + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31, 31, this.e);
        g0t g0tVar = this.f;
        return Boolean.hashCode(this.g) + ((e2 + (g0tVar != null ? g0tVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = v3w.h("NonMusicTrackUiData(title=", this.a, ", isPopular=", ", isExplicit=", this.b);
        h.append(this.c);
        h.append(", explicitType=");
        h.append(this.d);
        h.append(", hasVideoShot=");
        h.append(this.e);
        h.append(", releaseDate=");
        h.append(this.f);
        h.append(", hasOverflow=");
        return ouj.r(h, this.g, ")");
    }
}
