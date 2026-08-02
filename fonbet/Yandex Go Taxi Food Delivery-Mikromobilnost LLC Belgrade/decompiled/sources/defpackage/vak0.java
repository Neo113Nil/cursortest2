package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vak0 implements ibk0 {
    public final String a;
    public final String b;
    public final String c;

    public vak0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vak0)) {
            return false;
        }
        vak0 vak0Var = (vak0) obj;
        return jl40.l(this.a, vak0Var.a) && jl40.l(this.b, vak0Var.b) && jl40.l(this.c, vak0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("StartAcceptancePayment(analyticsName=", this.a, ", loadingText=", this.b, ", errorText="), this.c, Extension.C_BRAKE);
    }
}
