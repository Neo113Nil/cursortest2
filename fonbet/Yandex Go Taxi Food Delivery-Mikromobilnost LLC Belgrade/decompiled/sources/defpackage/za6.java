package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class za6 {
    public final String a;
    public final int b;
    public final int c;

    public za6(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za6)) {
            return false;
        }
        za6 za6Var = (za6) obj;
        return jl40.l(this.a, za6Var.a) && this.b == za6Var.b && this.c == za6Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "BotCommandSpan(command=", this.a, ", start=", ", end="));
    }
}
