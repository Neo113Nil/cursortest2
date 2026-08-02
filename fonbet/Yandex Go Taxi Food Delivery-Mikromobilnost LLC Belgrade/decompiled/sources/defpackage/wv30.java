package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wv30 {
    public final String a;
    public final String b;
    public final vv30 c;
    public final q47 d;
    public final String e;

    public wv30(String str, String str2, vv30 vv30Var, q47 q47Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = vv30Var;
        this.d = q47Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv30)) {
            return false;
        }
        wv30 wv30Var = (wv30) obj;
        return jl40.l(this.a, wv30Var.a) && jl40.l(this.b, wv30Var.b) && jl40.l(this.c, wv30Var.c) && jl40.l(this.d, wv30Var.d) && jl40.l(this.e, wv30Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31)) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtRouteInfoModalUiState(iconTag=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", routeInfoButtons=");
        v.append(this.d);
        v.append(", routeId=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
