package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class mum {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public mum(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof mum)) {
            return false;
        }
        mum mumVar = (mum) obj;
        return Objects.equals(this.a, mumVar.a) && Objects.equals(this.b, mumVar.b) && Objects.equals(this.c, mumVar.c) && Objects.equals(this.d, mumVar.d) && Objects.equals(this.e, mumVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
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
