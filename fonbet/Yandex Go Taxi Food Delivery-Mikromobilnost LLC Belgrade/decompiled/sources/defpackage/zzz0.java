package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zzz0 {
    public final String a;
    public final boolean b;

    public zzz0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzz0)) {
            return false;
        }
        zzz0 zzz0Var = (zzz0) obj;
        return jl40.l(this.a, zzz0Var.a) && this.b == zzz0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("TrackInfo(orderId=", this.a, ", trackEnabled=", this.b, Extension.C_BRAKE);
    }
}
