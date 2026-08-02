package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rh50 {
    public final String a;
    public final nh50 b;

    public rh50(String str, nh50 nh50Var) {
        this.a = str;
        this.b = nh50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh50)) {
            return false;
        }
        rh50 rh50Var = (rh50) obj;
        return jl40.l(this.a, rh50Var.a) && this.b.equals(rh50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NddAddressFlowSwitchButton(title=" + this.a + ", flow=" + this.b + Extension.C_BRAKE;
    }
}
