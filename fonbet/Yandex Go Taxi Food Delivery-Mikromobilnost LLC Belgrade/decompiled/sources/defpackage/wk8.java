package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wk8 {
    public final String a;
    public final String b;
    public final String c;
    public final d6w d;

    public wk8(String str, String str2, String str3, d6w d6wVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d6wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk8)) {
            return false;
        }
        wk8 wk8Var = (wk8) obj;
        return jl40.l(this.a, wk8Var.a) && jl40.l(this.b, wk8Var.b) && jl40.l(this.c, wk8Var.c) && jl40.l(this.d, wk8Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d6w d6wVar = this.d;
        return hashCode3 + (d6wVar != null ? d6wVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CardNumberValidationInfo(errorMessageEmpty=", this.a, ", errorMessageLength=", this.b, ", errorMessageChecksum=");
        v.append(this.c);
        v.append(", expectedNumberLengthRange=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
