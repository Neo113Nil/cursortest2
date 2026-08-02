package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rx5 {
    public final String a;
    public final String b;
    public final String c;

    public rx5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx5)) {
            return false;
        }
        rx5 rx5Var = (rx5) obj;
        return this.a.equals(rx5Var.a) && this.b.equals(rx5Var.b) && this.c.equals(rx5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("DeviceAuthState(biometricStrongStatus=", this.a, ", biometricWeakStatus=", this.b, ", deviceCredentialStatus="), this.c, Extension.C_BRAKE);
    }
}
