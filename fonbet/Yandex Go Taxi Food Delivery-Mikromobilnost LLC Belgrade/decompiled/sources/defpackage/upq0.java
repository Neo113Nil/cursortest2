package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class upq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public upq0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upq0)) {
            return false;
        }
        upq0 upq0Var = (upq0) obj;
        return this.a.equals(upq0Var.a) && jl40.l(this.b, upq0Var.b) && this.c.equals(upq0Var.c) && jl40.l(this.d, upq0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(b64.v("SendTextSuggestData(query=", this.a, ", queryId=", this.b, ", locale="), this.c, ", contextJson=", this.d, Extension.C_BRAKE);
    }
}
