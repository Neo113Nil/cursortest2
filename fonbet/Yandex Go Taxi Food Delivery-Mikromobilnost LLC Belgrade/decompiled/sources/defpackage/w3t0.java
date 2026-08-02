package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class w3t0 implements y3t0 {
    public final int a;
    public final kdc b;
    public final jb11 c;
    public final String d;
    public final bdc e;
    public final bdc f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final MtTransportType k;

    public w3t0(int i, kdc kdcVar, jb11 jb11Var, String str, bdc bdcVar, bdc bdcVar2, String str2, String str3, String str4, String str5, MtTransportType mtTransportType) {
        this.a = i;
        this.b = kdcVar;
        this.c = jb11Var;
        this.d = str;
        this.e = bdcVar;
        this.f = bdcVar2;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = mtTransportType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3t0)) {
            return false;
        }
        w3t0 w3t0Var = (w3t0) obj;
        return this.a == w3t0Var.a && jl40.l(this.b, w3t0Var.b) && this.c.equals(w3t0Var.c) && jl40.l(this.d, w3t0Var.d) && this.e.equals(w3t0Var.e) && this.f.equals(w3t0Var.f) && this.g.equals(w3t0Var.g) && jl40.l(this.h, w3t0Var.h) && jl40.l(this.i, w3t0Var.i) && jl40.l(this.j, w3t0Var.j) && this.k == w3t0Var.k;
    }

    @Override // defpackage.y3t0
    public final MtTransportType getType() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31)) * 31;
        String str = this.d;
        int b = unr0.b(oyr.b(this.f.a, oyr.b(this.e.a, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.g);
        String str2 = this.h;
        int hashCode3 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        return this.k.hashCode() + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transport(iconRes=");
        sb.append(this.a);
        sb.append(", iconColor=");
        sb.append(this.b);
        sb.append(", variant=");
        sb.append(this.c);
        sb.append(", otherVariants=");
        sb.append(this.d);
        sb.append(", numOthersColor=");
        sb.append(this.e);
        sb.append(", numOthersColorSelected=");
        sb.append(this.f);
        sb.append(", contentDescription=");
        g8e.D(sb, this.g, ", startingStopId=", this.h, ", destinationStopId=");
        g8e.D(sb, this.i, ", lineId=", this.j, ", type=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
