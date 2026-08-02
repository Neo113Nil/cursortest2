package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xaj0 {
    public static final xaj0 c = new xaj0(null, null);
    public final String a;
    public final String b;

    public xaj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xaj0)) {
            return false;
        }
        xaj0 xaj0Var = (xaj0) obj;
        return jl40.l(this.a, xaj0Var.a) && jl40.l(this.b, xaj0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("RequiredTariffPreselect(tariffClass=", this.a, ", verticalId=", this.b, Extension.C_BRAKE);
    }

    public xaj0() {
        this(null, null);
    }
}
