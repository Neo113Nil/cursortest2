package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i8q {
    public final String a;
    public final boolean b;
    public final c0p c;
    public final String d;
    public final String e;

    public i8q(String str, boolean z, c0p c0pVar, String str2, String str3) {
        str.getClass();
        c0pVar.getClass();
        this.a = str;
        this.b = z;
        this.c = c0pVar;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8q)) {
            return false;
        }
        i8q i8qVar = (i8q) obj;
        return Intrinsics.d(this.a, i8qVar.a) && this.b == i8qVar.b && this.c == i8qVar.c && Intrinsics.d(this.d, i8qVar.d) && Intrinsics.d(this.e, i8qVar.e);
    }

    public final int hashCode() {
        int e = k5r.e((this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, false);
        String str = this.d;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder h = v3w.h("SharedSearchParams(query=", this.a, ", voiceSearch=", ", context=", this.b);
        h.append(this.c);
        h.append(", disableCorrection=false, artistId=");
        h.append(this.d);
        h.append(", filterId=");
        return su4.o(h, this.e, ")");
    }
}
