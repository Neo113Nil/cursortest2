package defpackage;

/* loaded from: classes7.dex */
public final class um71 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public um71(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um71)) {
            return false;
        }
        um71 um71Var = (um71) obj;
        return rf71.o(this.a, um71Var.a) && rf71.o(this.b, um71Var.b) && rf71.o(this.c, um71Var.c) && rf71.o(this.d, um71Var.d) && rf71.o(this.e, um71Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
