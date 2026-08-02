package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rap0 {
    public final String a;
    public final String b;
    public final Integer c;
    public final Float d;
    public final String e;
    public final Integer f;

    public rap0(String str, String str2, Integer num, Float f, String str3, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = f;
        this.e = str3;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rap0)) {
            return false;
        }
        rap0 rap0Var = (rap0) obj;
        return jl40.l(this.a, rap0Var.a) && jl40.l(this.b, rap0Var.b) && jl40.l(this.c, rap0Var.c) && jl40.l(this.d, rap0Var.d) && jl40.l(this.e, rap0Var.e) && jl40.l(this.f, rap0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.d;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Style(imageTag=", this.a, ", strokeColor=", this.b, ", strokeOpacity=");
        v.append(this.c);
        v.append(", strokeWidth=");
        v.append(this.d);
        v.append(", backgroundColor=");
        v.append(this.e);
        v.append(", backgroundOpacity=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public rap0() {
        this(null, null, null, null, null, null);
    }
}
