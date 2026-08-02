package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sja0 implements uja0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public sja0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sja0)) {
            return false;
        }
        sja0 sja0Var = (sja0) obj;
        return this.a.equals(sja0Var.a) && this.b.equals(sja0Var.b) && this.c.equals(sja0Var.c) && jl40.l(this.d, sja0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("Content(title=", this.a, ", subtitle=", this.b, ", buttonText="), this.c, ", imageTag=", this.d, Extension.C_BRAKE);
    }
}
