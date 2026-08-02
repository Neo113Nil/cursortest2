package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fck implements hck {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;

    public fck(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fck)) {
            return false;
        }
        fck fckVar = (fck) obj;
        return this.a.equals(fckVar.a) && this.b.equals(fckVar.b) && this.c.equals(fckVar.c) && this.d == fckVar.d && Intrinsics.d(this.e, fckVar.e) && Intrinsics.d(this.f, fckVar.f);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Data(id=", this.a, ", text=", this.b, ", buttonText=");
        m.append(this.c);
        m.append(", buttonSelected=");
        m.append(this.d);
        m.append(", cover=");
        return ouj.q(m, this.e, ", deeplink=", this.f, ")");
    }
}
