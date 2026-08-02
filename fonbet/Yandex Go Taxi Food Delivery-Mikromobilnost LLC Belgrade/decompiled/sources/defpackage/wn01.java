package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wn01 implements qas0 {
    public final String a;
    public final String b;
    public final br51 c;
    public final Throwable d;

    public wn01(String str, String str2, br51 br51Var, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = br51Var;
        this.d = th;
    }

    public final String a() {
        return this.b;
    }

    public final br51 b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final Throwable d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn01)) {
            return false;
        }
        wn01 wn01Var = (wn01) obj;
        return jl40.l(this.a, wn01Var.a) && jl40.l(this.b, wn01Var.b) && jl40.l(this.c, wn01Var.c) && jl40.l(this.d, wn01Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        br51 br51Var = this.c;
        int hashCode3 = (hashCode2 + (br51Var == null ? 0 : br51Var.hashCode())) * 31;
        Throwable th = this.d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ShowCheckError(message=", this.a, ", description=", this.b, ", errorInfo=");
        v.append(this.c);
        v.append(", throwable=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
