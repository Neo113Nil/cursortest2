package defpackage;

import com.yandex.go.delivery.rental_duration_selector.requirement.DeliveryRentRequirementTrailAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zli {
    public final rj4 a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final int g;
    public final bdc h;
    public final DeliveryRentRequirementTrailAction i;

    public zli(rj4 rj4Var, String str, String str2, String str3, int i, String str4, int i2, bdc bdcVar, DeliveryRentRequirementTrailAction deliveryRentRequirementTrailAction) {
        this.a = rj4Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = i2;
        this.h = bdcVar;
        this.i = deliveryRentRequirementTrailAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zli)) {
            return false;
        }
        zli zliVar = (zli) obj;
        return jl40.l(this.a, zliVar.a) && this.b.equals(zliVar.b) && jl40.l(this.c, zliVar.c) && jl40.l(this.d, zliVar.d) && this.e == zliVar.e && jl40.l(this.f, zliVar.f) && this.g == zliVar.g && this.h.equals(zliVar.h) && this.i == zliVar.i;
    }

    public final int hashCode() {
        rj4 rj4Var = this.a;
        int b = unr0.b((rj4Var == null ? 0 : rj4Var.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int b2 = oyr.b(this.e, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f;
        return this.i.hashCode() + oyr.b(this.h.a, oyr.b(this.g, (b2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryRentRequirementModel(badge=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        g8e.D(sb, this.c, ", imageTag=", this.d, ", selectedDuration=");
        smw0.t(this.e, ", trailText=", this.f, ", trailImageRes=", sb);
        sb.append(this.g);
        sb.append(", trailTextColor=");
        sb.append(this.h);
        sb.append(", trailAction=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
