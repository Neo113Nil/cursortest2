package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v0c0 {
    public final String a;
    public final String b;
    public final String c;

    public v0c0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0c0)) {
            return false;
        }
        v0c0 v0c0Var = (v0c0) obj;
        return this.a.equals(v0c0Var.a) && jl40.l(this.b, v0c0Var.b) && jl40.l(this.c, v0c0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("PinTokenEntity(token=", oyr.p("EncryptedPinToken(token=", this.a, Extension.C_BRAKE), ", deviceId=", this.b, ", tokenBiometricUUID="), this.c, Extension.C_BRAKE);
    }
}
