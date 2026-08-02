package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xh40 implements bi40 {
    public final String a;
    public final ph40 b;

    public xh40(String str, ph40 ph40Var) {
        this.a = str;
        this.b = ph40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh40)) {
            return false;
        }
        xh40 xh40Var = (xh40) obj;
        return jl40.l(this.a, xh40Var.a) && jl40.l(this.b, xh40Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ph40 ph40Var = this.b;
        return hashCode + (ph40Var != null ? ph40Var.hashCode() : 0);
    }

    public final String toString() {
        return "ApplyButtonClick(selectedTariffId=" + this.a + ", tariffItem=" + this.b + Extension.C_BRAKE;
    }
}
