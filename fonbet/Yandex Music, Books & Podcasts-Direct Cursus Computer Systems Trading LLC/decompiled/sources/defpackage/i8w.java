package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i8w {
    public final String a;
    public final String b;
    public final String c;

    public i8w(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8w)) {
            return false;
        }
        i8w i8wVar = (i8w) obj;
        return this.a.equals(i8wVar.a) && Intrinsics.d(this.b, i8wVar.b) && Intrinsics.d(this.c, i8wVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return su4.o(f1d.m("YandexBooksBannerData(text=", this.a, ", buttonText=", this.b, ", urlScheme="), this.c, ")");
    }
}
