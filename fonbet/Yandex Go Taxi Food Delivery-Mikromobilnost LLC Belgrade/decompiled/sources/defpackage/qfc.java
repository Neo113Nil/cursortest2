package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qfc {
    public final String a;
    public final String b;
    public final String c;
    public final Float d;
    public final Float e;

    public qfc(String str, String str2, String str3, Float f, Float f2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfc)) {
            return false;
        }
        qfc qfcVar = (qfc) obj;
        return jl40.l(this.a, qfcVar.a) && jl40.l(this.b, qfcVar.b) && jl40.l(this.c, qfcVar.c) && jl40.l(this.d, qfcVar.d) && jl40.l(this.e, qfcVar.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.d;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.e;
        return hashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ColorModel(colorDay=", this.a, ", colorNight=", this.b, ", semanticColor=");
        v.append(this.c);
        v.append(", alphaDay=");
        v.append(this.d);
        v.append(", alphaNight=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
