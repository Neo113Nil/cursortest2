package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class v48 {
    public final String a;
    public final String b;
    public final String c;

    public v48(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v48)) {
            return false;
        }
        v48 v48Var = (v48) obj;
        return jl40.l(this.a, v48Var.a) && jl40.l(this.b, v48Var.b) && jl40.l(this.c, v48Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("CarIconData(color=", this.a, ", tariffClassName=", this.b, ", overlayImageTag="), this.c, Extension.C_BRAKE);
    }
}
