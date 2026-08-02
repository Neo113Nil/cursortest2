package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s8u0 {
    public final String a;
    public final String b;
    public final String c;

    public s8u0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8u0)) {
            return false;
        }
        s8u0 s8u0Var = (s8u0) obj;
        return jl40.l(this.a, s8u0Var.a) && jl40.l(this.b, s8u0Var.b) && jl40.l(this.c, s8u0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("StatusNotification(status=", this.a, ", text=", this.b, ", imageTag="), this.c, Extension.C_BRAKE);
    }

    public s8u0() {
        this("", "", null);
    }
}
