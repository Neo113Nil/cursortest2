package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tsz0 {
    public final String a;
    public final String b;
    public final String c;
    public final fxy0 d;

    public tsz0(fxy0 fxy0Var, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = fxy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsz0)) {
            return false;
        }
        tsz0 tsz0Var = (tsz0) obj;
        return jl40.l(this.a, tsz0Var.a) && jl40.l(this.b, tsz0Var.b) && jl40.l(this.c, tsz0Var.c) && jl40.l(this.d, tsz0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ToolbarDataEntity(title=", this.a, ", subtitle=", this.b, ", subtitleAmount=");
        v.append(this.c);
        v.append(", subtitleLeftImage=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
