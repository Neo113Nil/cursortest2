package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ufe0 implements uni {
    public final String a;
    public final boolean b;

    public ufe0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufe0)) {
            return false;
        }
        ufe0 ufe0Var = (ufe0) obj;
        return jl40.l(this.a, ufe0Var.a) && this.b == ufe0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("PostcardPresentationArgs(deliveryId=", this.a, ", isOpenedFromTracking=", this.b, Extension.C_BRAKE);
    }
}
