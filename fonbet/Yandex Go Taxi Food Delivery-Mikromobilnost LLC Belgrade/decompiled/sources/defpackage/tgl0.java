package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tgl0 extends n351 {
    public final String c;
    public final boolean d;
    public final boolean e;

    public tgl0(String str, boolean z, boolean z2) {
        super("rover-key", false, 14);
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgl0)) {
            return false;
        }
        tgl0 tgl0Var = (tgl0) obj;
        return jl40.l(this.c, tgl0Var.c) && this.d == tgl0Var.d && this.e == tgl0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        return x4e.i(oo31.l("RoverModel(title=", this.c, ", isEnabled=", ", isShimmering=", this.d), this.e, Extension.C_BRAKE);
    }
}
