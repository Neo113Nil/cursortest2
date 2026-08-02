package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class tjr {
    public static final tjr d = new tjr("No file info", "No function info", "No line info");
    public final String a;
    public final String b;
    public final String c;

    public tjr(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjr)) {
            return false;
        }
        tjr tjrVar = (tjr) obj;
        return this.a.equals(tjrVar.a) && jl40.l(this.b, tjrVar.b) && this.c.equals(tjrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("SourceCodeInfo(file=", this.a, ", function=", this.b, ", line="), this.c, Extension.C_BRAKE);
    }
}
