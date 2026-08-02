package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kbj {
    public final String a;
    public final String b;
    public final String c;
    public final w3g d;
    public final boolean e;
    public final jzb f;
    public final boolean g;
    public final boolean h;

    public kbj(String str, String str2, String str3, w3g w3gVar, boolean z, jzb jzbVar, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = w3gVar;
        this.e = z;
        this.f = jzbVar;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbj)) {
            return false;
        }
        kbj kbjVar = (kbj) obj;
        return Intrinsics.d(this.a, kbjVar.a) && Intrinsics.d(this.b, kbjVar.b) && Intrinsics.d(this.c, kbjVar.c) && Intrinsics.d(this.d, kbjVar.d) && this.e == kbjVar.e && this.f == kbjVar.f && this.g == kbjVar.g && this.h == kbjVar.h;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        w3g w3gVar = this.d;
        int e = k5r.e((hashCode + (w3gVar == null ? 0 : w3gVar.hashCode())) * 31, 31, this.e);
        jzb jzbVar = this.f;
        return Boolean.hashCode(this.h) + k5r.e((e + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder m = f1d.m("NonMusicListItemUiData(coverUrl=", this.a, ", title=", this.b, ", subtitle=");
        m.append(this.c);
        m.append(", likes=");
        m.append(this.d);
        m.append(", isLiked=");
        m.append(this.e);
        m.append(", explicitType=");
        m.append(this.f);
        m.append(", isExplicit=");
        return v3w.g(m, this.g, ", hasYandexBooksBadge=", this.h, ")");
    }
}
