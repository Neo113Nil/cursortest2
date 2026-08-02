package defpackage;

import com.yandex.mapkit.geometry.Subpolyline;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.model.MtTransportSystemId;

/* loaded from: classes6.dex */
public final class zi40 implements hz30 {
    public final f5q0 a;
    public final kdc b;
    public final String c;
    public final String d;
    public final MtTransportSystemId e;
    public final hj40 f;
    public final String g;
    public final MtTransportType h;
    public final Subpolyline i;
    public final double j;
    public final int k;

    public zi40(f5q0 f5q0Var, kdc kdcVar, String str, String str2, MtTransportSystemId mtTransportSystemId, hj40 hj40Var, String str3, MtTransportType mtTransportType, Subpolyline subpolyline, double d, int i) {
        this.a = f5q0Var;
        this.b = kdcVar;
        this.c = str;
        this.d = str2;
        this.e = mtTransportSystemId;
        this.f = hj40Var;
        this.g = str3;
        this.h = mtTransportType;
        this.i = subpolyline;
        this.j = d;
        this.k = i;
    }

    @Override // defpackage.hz30
    public final int b() {
        return this.k;
    }

    @Override // defpackage.hz30
    public final Subpolyline c() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi40)) {
            return false;
        }
        zi40 zi40Var = (zi40) obj;
        return jl40.l(this.a, zi40Var.a) && jl40.l(this.b, zi40Var.b) && jl40.l(this.c, zi40Var.c) && jl40.l(this.d, zi40Var.d) && this.e == zi40Var.e && jl40.l(this.f, zi40Var.f) && jl40.l(this.g, zi40Var.g) && this.h == zi40Var.h && jl40.l(this.i, zi40Var.i) && Double.compare(this.j, zi40Var.j) == 0 && this.k == zi40Var.k;
    }

    @Override // defpackage.hz30
    public final double getDuration() {
        return this.j;
    }

    public final int hashCode() {
        f5q0 f5q0Var = this.a;
        int hashCode = (f5q0Var == null ? 0 : f5q0Var.hashCode()) * 31;
        kdc kdcVar = this.b;
        int b = unr0.b((hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return Integer.hashCode(this.k) + unr0.a((this.i.hashCode() + ((this.h.hashCode() + unr0.b((this.f.hashCode() + ((this.e.hashCode() + ((b + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.g)) * 31)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtTransferStopSection(weight=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", lineName=");
        g8e.D(sb, this.c, ", lineNum=", this.d, ", transportSystemId=");
        sb.append(this.e);
        sb.append(", stop=");
        sb.append(this.f);
        sb.append(", departureTime=");
        sb.append(this.g);
        sb.append(", type=");
        sb.append(this.h);
        sb.append(", subpolyline=");
        sb.append(this.i);
        sb.append(", duration=");
        sb.append(this.j);
        return b64.q(sb, ", sectionId=", this.k, Extension.C_BRAKE);
    }
}
