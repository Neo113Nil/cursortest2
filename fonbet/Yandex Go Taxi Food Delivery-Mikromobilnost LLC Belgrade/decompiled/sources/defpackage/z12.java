package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class z12 {
    public final String a;
    public final String b;
    public final String c;
    public final xo70 d;

    public z12(String str, String str2, String str3, xo70 xo70Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z12)) {
            return false;
        }
        z12 z12Var = (z12) obj;
        return jl40.l(this.a, z12Var.a) && jl40.l(this.b, z12Var.b) && jl40.l(this.c, z12Var.c) && this.d.equals(z12Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("AmbulanceLinkedOrderUiState(title=", this.a, ", subtitle=", this.b, ", imageTag=");
        v.append(this.c);
        v.append(", orderContentState=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
