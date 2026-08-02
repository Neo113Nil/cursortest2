package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class shb0 implements uhb0 {
    public final String a;
    public final String b;
    public final String c;

    public shb0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shb0)) {
            return false;
        }
        shb0 shb0Var = (shb0) obj;
        return jl40.l(this.a, shb0Var.a) && jl40.l(this.b, shb0Var.b) && jl40.l(this.c, shb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("Success(title=", this.a, ", subtitle=", this.b, ", buttonText="), this.c, Extension.C_BRAKE);
    }
}
