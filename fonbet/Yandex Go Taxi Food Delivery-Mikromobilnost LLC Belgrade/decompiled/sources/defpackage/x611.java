package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class x611 implements z611 {
    public final String a;
    public final String b;
    public final String c;

    public x611(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x611)) {
            return false;
        }
        x611 x611Var = (x611) obj;
        return jl40.l(this.a, x611Var.a) && jl40.l(this.b, x611Var.b) && jl40.l(this.c, x611Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("ValueTipsChoice(tipsType=", this.a, ", decimalValue=", this.b, ", text="), this.c, Extension.C_BRAKE);
    }
}
