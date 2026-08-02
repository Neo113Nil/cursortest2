package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q911 {
    public final o2y0 a;
    public final String b;
    public final String c;
    public final boolean d;

    public q911(o2y0 o2y0Var, String str, String str2, boolean z) {
        this.a = o2y0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q911)) {
            return false;
        }
        q911 q911Var = (q911) obj;
        return jl40.l(this.a, q911Var.a) && jl40.l(this.b, q911Var.b) && jl40.l(this.c, q911Var.c) && this.d == q911Var.d;
    }

    public final int hashCode() {
        o2y0 o2y0Var = this.a;
        int hashCode = (o2y0Var == null ? 0 : o2y0Var.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + unr0.b((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportTrackingCardCardPayload(taxiOrderHolder=");
        sb.append(this.a);
        sb.append(", mmOrderId=");
        sb.append(this.b);
        sb.append(", routeType=");
        return nnm.i(this.c, ", isOpenedFromTaxiOrderScreen=", Extension.C_BRAKE, sb, this.d);
    }
}
