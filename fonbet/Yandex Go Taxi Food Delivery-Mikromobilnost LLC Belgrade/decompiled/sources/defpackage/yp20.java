package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class yp20 {
    public final String a;
    public final String b;
    public final String c;

    public yp20(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp20)) {
            return false;
        }
        yp20 yp20Var = (yp20) obj;
        return this.a.equals(yp20Var.a) && this.b.equals(yp20Var.b) && this.c.equals(yp20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("MobParams(proxyId=", this.a, ", configId=", this.b, ", mobId="), this.c, Extension.C_BRAKE);
    }
}
