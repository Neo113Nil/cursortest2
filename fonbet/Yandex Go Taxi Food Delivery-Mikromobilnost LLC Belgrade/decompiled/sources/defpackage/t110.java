package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class t110 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public t110(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t110)) {
            return false;
        }
        t110 t110Var = (t110) obj;
        return this.a.equals(t110Var.a) && this.b.equals(t110Var.b) && jl40.l(this.c, t110Var.c) && jl40.l(this.d, t110Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("MassTransitVehicleDeeplink(vehicleId=", this.a, ", lineId=", this.b, ", utmSource="), this.c, ", utmMedium=", this.d, Extension.C_BRAKE);
    }
}
