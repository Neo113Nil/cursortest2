package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class tnx0 {
    public final String a;
    public final String b;
    public final String c;

    public tnx0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnx0)) {
            return false;
        }
        tnx0 tnx0Var = (tnx0) obj;
        return this.a.equals(tnx0Var.a) && jl40.l(this.b, tnx0Var.b) && jl40.l(this.c, tnx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("TariffSurgeReport(nextButtonAction=", this.a, ", tariffName=", this.b, ", surgeValue="), this.c, Extension.C_BRAKE);
    }
}
