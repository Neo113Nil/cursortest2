package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class uoj {
    public final String a;
    public final String b;
    public final duk0 c;

    public uoj(String str, String str2, duk0 duk0Var) {
        this.a = str;
        this.b = str2;
        this.c = duk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoj)) {
            return false;
        }
        uoj uojVar = (uoj) obj;
        return jl40.l(this.a, uojVar.a) && jl40.l(this.b, uojVar.b) && jl40.l(this.c, uojVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        duk0 duk0Var = this.c;
        return hashCode2 + (duk0Var != null ? duk0Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DiscountUiState(prefixUrlText=", this.a, ", urlText=", this.b, ", uiAction=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
