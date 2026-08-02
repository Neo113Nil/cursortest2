package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class upy {
    public final String a;
    public final String b;

    public upy(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upy)) {
            return false;
        }
        upy upyVar = (upy) obj;
        return jl40.l(this.a, upyVar.a) && jl40.l(this.b, upyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("LinkedOrderTrustingContact(title=", this.a, ", phone=", this.b, Extension.C_BRAKE);
    }
}
