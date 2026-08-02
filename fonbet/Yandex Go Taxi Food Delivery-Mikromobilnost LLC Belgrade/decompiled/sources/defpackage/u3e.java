package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u3e {
    public final String a;
    public final String b;
    public final String c;

    public u3e(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3e)) {
            return false;
        }
        u3e u3eVar = (u3e) obj;
        return this.a.equals(u3eVar.a) && this.b.equals(u3eVar.b) && this.c.equals(u3eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("ConfirmationModalConfig(title=", this.a, ", subtitle=", this.b, ", button="), this.c, Extension.C_BRAKE);
    }
}
