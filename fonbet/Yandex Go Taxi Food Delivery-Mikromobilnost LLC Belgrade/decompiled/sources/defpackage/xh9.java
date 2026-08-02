package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xh9 {
    public static final xh9 c = new xh9("", false);
    public final String a;
    public final boolean b;

    public xh9(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh9)) {
            return false;
        }
        xh9 xh9Var = (xh9) obj;
        return jl40.l(this.a, xh9Var.a) && this.b == xh9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("ChangingSystemChannelModel(id=", this.a, ", isEnabled=", this.b, Extension.C_BRAKE);
    }
}
