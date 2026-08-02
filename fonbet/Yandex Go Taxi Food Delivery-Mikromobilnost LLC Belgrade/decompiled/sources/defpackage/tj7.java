package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tj7 {
    public final String a;
    public final String b;
    public final String c;

    public tj7(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj7)) {
            return false;
        }
        tj7 tj7Var = (tj7) obj;
        return this.a.equals(tj7Var.a) && jl40.l(this.b, tj7Var.b) && this.c.equals(tj7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("CallOrderFallbackUiState(title=", this.a, ", subtitle=", this.b, ", callButtonTitle="), this.c, Extension.C_BRAKE);
    }
}
