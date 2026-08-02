package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ul70 {
    public final boolean a;
    public final boolean b;
    public final String c;

    public ul70(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul70)) {
            return false;
        }
        ul70 ul70Var = (ul70) obj;
        return this.a == ul70Var.a && this.b == ul70Var.b && jl40.l(this.c, ul70Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(qv10.u("OrderCancelUiState(isEnabled=", ", isVisible=", ", costMessage=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
