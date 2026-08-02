package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w6g0 {
    public final String a;
    public final String b;

    public w6g0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6g0)) {
            return false;
        }
        w6g0 w6g0Var = (w6g0) obj;
        return this.a.equals(w6g0Var.a) && jl40.l(this.b, w6g0Var.b);
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + 990546129) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("QrDeeplink(deeplink=", this.a, ", routeType=scooters_multimodal, mmOfferId=", this.b, Extension.C_BRAKE);
    }
}
