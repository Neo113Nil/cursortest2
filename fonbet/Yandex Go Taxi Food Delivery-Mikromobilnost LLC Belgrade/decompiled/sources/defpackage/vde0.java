package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vde0 extends t1a1 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final pv0 g;

    public vde0(String str, String str2, String str3, String str4, String str5, pv0 pv0Var) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = pv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vde0)) {
            return false;
        }
        vde0 vde0Var = (vde0) obj;
        return jl40.l(this.b, vde0Var.b) && jl40.l(this.c, vde0Var.c) && jl40.l(this.d, vde0Var.d) && jl40.l(this.e, vde0Var.e) && jl40.l(this.f, vde0Var.f) && this.g.equals(vde0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChooseAddress(title=", this.b, ", subtitle=", this.c, ", skipButtonText=");
        g8e.D(v, this.d, ", otherText=", this.e, ", bubbleText=");
        v.append(this.f);
        v.append(", addressInfo=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
