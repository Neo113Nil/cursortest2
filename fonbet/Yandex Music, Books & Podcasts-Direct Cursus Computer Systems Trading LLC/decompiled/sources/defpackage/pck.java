package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pck implements qck {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public pck(String str, String str2, boolean z, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pck)) {
            return false;
        }
        pck pckVar = (pck) obj;
        return this.a.equals(pckVar.a) && this.b.equals(pckVar.b) && this.c == pckVar.c && Intrinsics.d(this.d, pckVar.d) && Intrinsics.d(this.e, pckVar.e);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Success(text=", this.a, ", buttonText=", this.b, ", buttonSelected=");
        m.append(this.c);
        m.append(", imageUrl=");
        m.append(this.d);
        m.append(", deeplink=");
        return su4.o(m, this.e, ")");
    }
}
