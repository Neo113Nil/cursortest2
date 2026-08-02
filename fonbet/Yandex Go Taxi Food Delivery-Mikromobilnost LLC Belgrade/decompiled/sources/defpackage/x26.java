package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x26 extends v26 {
    public final String a;
    public final int b;
    public final int c;

    public x26(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x26)) {
            return false;
        }
        x26 x26Var = (x26) obj;
        return jl40.l(this.a, x26Var.a) && this.b == x26Var.b && this.c == x26Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "BleScannedIBeacon(uuid=", this.a, ", major=", ", minor="));
    }
}
