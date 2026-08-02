package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l3n {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;

    public l3n(String str, String str2, String str3, String str4, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3n)) {
            return false;
        }
        l3n l3nVar = (l3n) obj;
        return Intrinsics.d(this.a, l3nVar.a) && Intrinsics.d(this.b, l3nVar.b) && Intrinsics.d(this.c, l3nVar.c) && Intrinsics.d(this.d, l3nVar.d) && Intrinsics.d(this.e, l3nVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PurchaseBlockStyleOverride(buttonColor=", this.a, ", buttonTextColor=", this.b, ", additionalButtonColor=");
        su4.v(m, this.c, ", additionalButtonTextColor=", this.d, ", isDarkTheme=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
