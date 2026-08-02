package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class se81 extends zz61 {
    public final String a;
    public final String b;
    public final String c;

    public se81(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se81)) {
            return false;
        }
        se81 se81Var = (se81) obj;
        return jl40.l(this.a, se81Var.a) && jl40.l(this.b, se81Var.b) && jl40.l(this.c, se81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z2a1.a(this.a.hashCode() * 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("AdUnit(name=", this.a, ", format=", this.b, ", id="), this.c, Extension.C_BRAKE);
    }
}
