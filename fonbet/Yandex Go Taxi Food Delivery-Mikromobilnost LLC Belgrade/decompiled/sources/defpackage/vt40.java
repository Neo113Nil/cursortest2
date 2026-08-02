package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vt40 {
    public final String a;
    public final String b;

    public vt40(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt40)) {
            return false;
        }
        vt40 vt40Var = (vt40) obj;
        return jl40.l(this.a, vt40Var.a) && jl40.l(this.b, vt40Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return unr0.p("MultimodalRouteOnboardingRouterPayload(mmOfferId=", this.a, ", routeType=", this.b, Extension.C_BRAKE);
    }
}
