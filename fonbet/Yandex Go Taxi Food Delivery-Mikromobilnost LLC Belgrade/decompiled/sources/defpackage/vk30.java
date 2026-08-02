package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vk30 {
    public final String a;
    public final String b;

    public vk30(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk30)) {
            return false;
        }
        vk30 vk30Var = (vk30) obj;
        return jl40.l(this.a, vk30Var.a) && jl40.l(this.b, vk30Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return unr0.p("MtGeoPaymentModalAnalyticsModel(vehiclesRequestId=", this.a, ", checkoutRequestId=", this.b, Extension.C_BRAKE);
    }
}
