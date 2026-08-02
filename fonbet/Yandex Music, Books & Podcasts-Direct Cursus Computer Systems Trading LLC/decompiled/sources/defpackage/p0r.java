package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p0r {
    public final String a;
    public final boolean b;
    public final int c;
    public final jzb d;
    public final boolean e;
    public final String f;
    public final String g;

    public p0r(String str, boolean z, int i, jzb jzbVar, boolean z2, String str2, String str3) {
        str2.getClass();
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = jzbVar;
        this.e = z2;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0r)) {
            return false;
        }
        p0r p0rVar = (p0r) obj;
        return this.a.equals(p0rVar.a) && this.b == p0rVar.b && this.c == p0rVar.c && this.d == p0rVar.d && this.e == p0rVar.e && Intrinsics.d(this.f, p0rVar.f) && Intrinsics.d(this.g, p0rVar.g);
    }

    public final int hashCode() {
        int a = f1d.a(this.c, k5r.e(this.a.hashCode() * 31, 31, this.b), 31);
        jzb jzbVar = this.d;
        int c = k5r.c(k5r.e((a + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder h = v3w.h("SmartPreviewTrackUiData(coverUrl=", this.a, ", isPopular=", ", position=", this.b);
        h.append(this.c);
        h.append(", explicitType=");
        h.append(this.d);
        h.append(", isExplicit=");
        h.append(this.e);
        h.append(", title=");
        h.append(this.f);
        h.append(", subtitle=");
        return su4.o(h, this.g, ")");
    }
}
