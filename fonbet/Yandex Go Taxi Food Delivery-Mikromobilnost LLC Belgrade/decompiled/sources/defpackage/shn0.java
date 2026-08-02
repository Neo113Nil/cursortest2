package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class shn0 {
    public final String a;
    public final String b;

    public shn0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shn0)) {
            return false;
        }
        shn0 shn0Var = (shn0) obj;
        return jl40.l(this.a, shn0Var.a) && jl40.l(this.b, shn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ScootersDetailedStatusBar(statusDescription=", this.a, ", additionalValue=", this.b, Extension.C_BRAKE);
    }
}
