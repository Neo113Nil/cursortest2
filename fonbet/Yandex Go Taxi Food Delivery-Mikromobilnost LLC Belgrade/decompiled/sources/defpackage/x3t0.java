package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class x3t0 implements y3t0 {
    public final kdc a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final MtTransportType f;

    public x3t0(kdc kdcVar, String str, int i, int i2, String str2, MtTransportType mtTransportType) {
        this.a = kdcVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = mtTransportType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3t0)) {
            return false;
        }
        x3t0 x3t0Var = (x3t0) obj;
        return jl40.l(this.a, x3t0Var.a) && this.b.equals(x3t0Var.b) && this.c == x3t0Var.c && this.d == x3t0Var.d && this.e.equals(x3t0Var.e) && this.f == x3t0Var.f;
    }

    @Override // defpackage.y3t0
    public final MtTransportType getType() {
        return this.f;
    }

    public final int hashCode() {
        kdc kdcVar = this.a;
        return this.f.hashCode() + unr0.b(oyr.b(this.d, oyr.b(this.c, unr0.b((kdcVar == null ? 0 : kdcVar.hashCode()) * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Underground(color=");
        sb.append(this.a);
        sb.append(", lineNum=");
        sb.append(this.b);
        sb.append(", transportSystemIcon=");
        vfc.u(this.c, this.d, ", transportTypeIcon=", ", contentDescription=", sb);
        sb.append(this.e);
        sb.append(", type=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
