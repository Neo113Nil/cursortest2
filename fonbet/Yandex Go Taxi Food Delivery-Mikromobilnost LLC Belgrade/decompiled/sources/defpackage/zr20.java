package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class zr20 {
    public final String a;
    public final String b;
    public final String c;

    public zr20(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr20)) {
            return false;
        }
        zr20 zr20Var = (zr20) obj;
        return this.a.equals(zr20Var.a) && this.b.equals(zr20Var.b) && this.c.equals(zr20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("MobUrl(proto=", this.a, ", host=", this.b, ", query="), this.c, Extension.C_BRAKE);
    }
}
