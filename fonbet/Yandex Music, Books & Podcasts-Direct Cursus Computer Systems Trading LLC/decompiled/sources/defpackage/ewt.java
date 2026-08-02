package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ewt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ewt(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewt)) {
            return false;
        }
        ewt ewtVar = (ewt) obj;
        return Intrinsics.d(this.a, ewtVar.a) && Intrinsics.d(this.b, ewtVar.b) && Intrinsics.d(this.c, ewtVar.c) && Intrinsics.d(this.d, ewtVar.d) && Intrinsics.d(this.e, ewtVar.e) && Intrinsics.d(this.f, ewtVar.f);
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
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Utm(source=", this.a, ", medium=", this.b, ", campaign=");
        su4.v(m, this.c, ", group=", this.d, ", content=");
        return ouj.q(m, this.e, ", term=", this.f, ")");
    }
}
