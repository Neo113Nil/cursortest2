package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qiw0 {
    public final String a;
    public final String b;
    public final String c;

    public qiw0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qiw0)) {
            return false;
        }
        qiw0 qiw0Var = (qiw0) obj;
        return this.a.equals(qiw0Var.a) && this.b.equals(qiw0Var.b) && jl40.l(this.c, qiw0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("BotRequestData(id=", this.a, ", method=", this.b, ", target="), this.c, Extension.C_BRAKE);
    }
}
