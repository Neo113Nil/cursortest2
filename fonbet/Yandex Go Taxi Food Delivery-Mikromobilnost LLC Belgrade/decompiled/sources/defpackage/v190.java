package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v190 {
    public final String a;
    public final String b;
    public final String c;

    public v190(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v190)) {
            return false;
        }
        v190 v190Var = (v190) obj;
        return jl40.l(this.a, v190Var.a) && jl40.l(this.b, v190Var.b) && jl40.l(this.c, v190Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("OverrideData(deeplink=", this.a, ", title=", this.b, ", body="), this.c, Extension.C_BRAKE);
    }
}
