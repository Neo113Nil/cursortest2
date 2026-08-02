package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z9u {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final jzb h;
    public final boolean i;
    public final String j;

    public z9u(int i, String str, String str2, String str3, String str4, String str5, String str6, jzb jzbVar, boolean z, String str7) {
        eta.r(str, str3, str4, str5);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = jzbVar;
        this.i = z;
        this.j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9u)) {
            return false;
        }
        z9u z9uVar = (z9u) obj;
        return this.a == z9uVar.a && Intrinsics.d(this.b, z9uVar.b) && Intrinsics.d(this.c, z9uVar.c) && Intrinsics.d(this.d, z9uVar.d) && Intrinsics.d(this.e, z9uVar.e) && Intrinsics.d(this.f, z9uVar.f) && Intrinsics.d(this.g, z9uVar.g) && this.h == z9uVar.h && this.i == z9uVar.i && Intrinsics.d(this.j, z9uVar.j);
    }

    public final int hashCode() {
        int c = k5r.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int c2 = k5r.c(k5r.c(k5r.c(k5r.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        jzb jzbVar = this.h;
        int e = k5r.e((c2 + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31, 31, this.i);
        String str2 = this.j;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = k5r.r(this.a, "VideoClipUiData(index=", ", id=", this.b, ", headerTitle=");
        su4.v(r, this.c, ", previewImageUrl=", this.d, ", trackTitle=");
        su4.v(r, this.e, ", trackSubtitle=", this.f, ", duration=");
        r.append(this.g);
        r.append(", explicitType=");
        r.append(this.h);
        r.append(", explicit=");
        r.append(this.i);
        r.append(", durationDescription=");
        r.append(this.j);
        r.append(")");
        return r.toString();
    }
}
