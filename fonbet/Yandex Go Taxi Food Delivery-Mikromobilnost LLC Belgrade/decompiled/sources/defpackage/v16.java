package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class v16 {
    public final String a;
    public final int b;
    public final int c;

    public v16(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v16)) {
            return false;
        }
        v16 v16Var = (v16) obj;
        return jl40.l(this.a, v16Var.a) && this.b == v16Var.b && this.c == v16Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "BleBeaconInfo(uuid=", this.a, ", major=", ", minor="));
    }

    public v16() {
        this("", 0, 999);
    }
}
