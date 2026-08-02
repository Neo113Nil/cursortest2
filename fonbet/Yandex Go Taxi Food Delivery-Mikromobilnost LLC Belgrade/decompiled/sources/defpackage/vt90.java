package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vt90 {
    public final boolean a;
    public final String b;

    public vt90(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt90)) {
            return false;
        }
        vt90 vt90Var = (vt90) obj;
        return this.a == vt90Var.a && jl40.l(this.b, vt90Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return xvz.m("PayOnDeliveryProhibitedData(isProhibited=", this.a, ", prohibitedToggleSubtitle=", this.b, Extension.C_BRAKE);
    }
}
