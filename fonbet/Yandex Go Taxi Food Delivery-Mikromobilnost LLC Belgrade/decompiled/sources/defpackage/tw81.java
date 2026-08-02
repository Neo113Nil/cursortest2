package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class tw81 {
    public final String a;
    public final String b;
    public final String c;
    public final hi71 d;

    public tw81(String str, String str2, String str3, hi71 hi71Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hi71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw81)) {
            return false;
        }
        tw81 tw81Var = (tw81) obj;
        return jl40.l(this.a, tw81Var.a) && jl40.l(this.b, tw81Var.b) && jl40.l(this.c, tw81Var.c) && this.d.equals(tw81Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + z2a1.a(z2a1.a(this.a.hashCode() * 31, this.b), this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebugPanelAdUnitFullData(name=", this.a, ", format=", this.b, ", adUnitId=");
        v.append(this.c);
        v.append(", mediation=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
