package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g24 {
    public final String a;
    public final String b;
    public final String c;
    public final saf d;

    public g24(String str, String str2, String str3, saf safVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = safVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g24)) {
            return false;
        }
        g24 g24Var = (g24) obj;
        return Intrinsics.d(this.a, g24Var.a) && Intrinsics.d(this.b, g24Var.b) && Intrinsics.d(this.c, g24Var.c) && this.d.equals(g24Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Artist(title=", this.a, ", subtitle=", this.b, ", description=");
        m.append(this.c);
        m.append(", coverComposition=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
